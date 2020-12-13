package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.domain.Action;
import org.veritasopher.seniz.core.model.domain.State;
import org.veritasopher.seniz.core.model.domain.StateVariable;
import org.veritasopher.seniz.core.model.domain.Transition;
import org.veritasopher.seniz.exception.ActionException;
import org.veritasopher.seniz.exception.StateException;
import org.veritasopher.seniz.exception.TransitionException;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Transition Visitor
 *
 * @author Yepeng Ding
 * @date 12/3/2020
 */
public class TransitionVisitor extends SenizParserBaseVisitor<TransitionSystem> {

    private final TransitionSystem transitionSystem;

    private final TransitionStatementVisitor transitionStatementVisitor;

    public TransitionVisitor(TransitionSystem transitionSystem) {
        this.transitionSystem = transitionSystem;
        this.transitionStatementVisitor = new TransitionStatementVisitor(transitionSystem);
    }

    /**
     * Construct the transition set by visiting transition statements
     *
     * @param ctx transition statement context
     * @return transition system
     */
    @Override
    public TransitionSystem visitTransitionStatement(SenizParser.TransitionStatementContext ctx) {
        int i = 0;
        Element element = ctx.getChild(i).accept(transitionStatementVisitor);

        if (element == null) {
            throw new TransitionException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported transition declaration.");
        }

        // Check init identifier
        boolean isInit = false;
        if (element.type == ElementType.INIT) {
            isInit = true;
            i++;
            element = ctx.getChild(i).accept(transitionStatementVisitor);
        }

        // Safety check (only state and action are legal)
        if (element.type != ElementType.STATE) {
            throw new TransitionException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported transition declaration.");
        }

        // Infer the first state
        element.state = inferState(element.state);

        if (isInit) {
            // Add to initial state set
            transitionSystem.addInitState(element.state);
        }

        while (i < ctx.getChildCount() - 1) {
            Transition transition = new Transition();
            // Safety check
            if (element.type != ElementType.STATE) {
                throw new TransitionException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported transition declaration.");
            }

            transition.setSrcState(element.state.hashCode());

            i += 2;
            element = ctx.getChild(i).accept(transitionStatementVisitor);

            if (element == null) {
                throw new TransitionException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported transition declaration.");
            }

            if (element.type == ElementType.ACTION) {
                // Explicit action
                Action action = element.action;

                // Add new action
                transitionSystem.addAction(action);

                transition.setAction(action.hashCode());

                // Get destination state
                i++;
                element = ctx.getChild(i).accept(transitionStatementVisitor);

                if (element == null || element.type != ElementType.STATE) {
                    throw new TransitionException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported transition declaration.");
                }
            }

            // Infer destination state
            element.state = inferState(transitionSystem.getState(transition.getSrcState()), element.state);
            transition.setDstState(element.state.hashCode());

            // Transition duplicated
            if (transitionSystem.hasTransition(transition)) {
                throw new TransitionException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Transition is duplicated.");
            }

            transitionSystem.addTransition(transition);

        }

        return super.visitTransitionStatement(ctx);
    }


    private static class TransitionStatementVisitor extends SenizParserBaseVisitor<Element> {

        private final TransitionSystem transitionSystem;

        private final StateDeclaratorVisitor stateDeclaratorVisitor;

        TransitionStatementVisitor(TransitionSystem transitionSystem) {
            this.transitionSystem = transitionSystem;
            this.stateDeclaratorVisitor = new StateDeclaratorVisitor(transitionSystem);
        }

        /**
         * State
         *
         * @param ctx
         * @return Element with state
         */
        @Override
        public Element visitStateIdentifier(SenizParser.StateIdentifierContext ctx) {

            State state;

            if (ctx.stateNameIdentifier() != null) {
                // Named state
                String name = ctx.stateNameIdentifier().IDENTIFIER().getText();
                Optional<State> s = transitionSystem.getStateName(name);

                // Check whether state associated with identifier exists
                if (s.isEmpty()) {
                    throw new StateException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "State named (" + name + ") does not exist.");
                }
                state = s.get();

            } else if (ctx.stateBody() != null) {
                // Unnamed state
                state = ctx.stateBody().stateDeclarator().accept(stateDeclaratorVisitor);
            } else {
                throw new StateException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported state type.");
            }

            return new Element(ElementType.STATE, state);
        }

        /**
         * Action
         *
         * @param ctx
         * @return Element with action
         */
        @Override
        public Element visitActionDeclaration(SenizParser.ActionDeclarationContext ctx) {
            if (ctx.IDENTIFIER() == null) {
                throw new ActionException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported action type.");
            }

            return new Element(ElementType.ACTION, new Action(ctx.IDENTIFIER().getText()));
        }

        /**
         * Init identifier
         *
         * @param ctx
         * @return
         */
        @Override
        public Element visitInitIdentifier(SenizParser.InitIdentifierContext ctx) {
            return new Element(ElementType.INIT);
        }

    }

    /**
     * Infer the first state of a transition
     * Complete the first state with values of not contained state variables as 'null'
     *
     * @param fst first state
     * @return inferred state
     */
    private State inferState(State fst) {
        State inferredState;

        Set<StateVariable> variables = new HashSet<>(fst.getVariables());

        Set<String> varNames = fst.getVariables()
                .stream()
                .map(StateVariable::getName)
                .collect(Collectors.toSet());

        transitionSystem.getVariableSet()
                .stream()
                .filter(v -> !varNames.contains(v.getName()))
                .forEach(variables::add);

        inferredState = new State(variables);

        // Add state
        transitionSystem.addState(inferredState);
        return inferredState;
    }

    /**
     * Infer destination state from source state
     *
     * @param src source state
     * @param dst destination state
     * @return inferred state
     */
    private State inferState(State src, State dst) {
        State inferredState;

        Set<StateVariable> variables = new HashSet<>(dst.getVariables());

        Set<String> varNames = dst.getVariables()
                .stream()
                .map(StateVariable::getName)
                .collect(Collectors.toSet());

        src.getVariables()
                .stream()
                .filter(v -> !varNames.contains(v.getName()))
                .forEach(variables::add);

        inferredState = new State(variables);

        // Add state
        transitionSystem.addState(inferredState);
        return inferredState;
    }

    /**
     * Main element types
     */
    private enum ElementType {
        STATE, ACTION, INIT
    }

    /**
     * Element
     */
    static class Element {

        private State state;

        private Action action;

        private final ElementType type;

        Element(ElementType type) {
            this.type = type;
        }

        Element(ElementType type, State state) {
            this.state = state;
            this.type = type;
        }

        Element(ElementType type, Action action) {
            this.action = action;
            this.type = type;
        }

    }

}
