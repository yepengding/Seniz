package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.domain.StateVariable;
import org.veritasopher.seniz.exception.ActionException;
import org.veritasopher.seniz.exception.StateException;
import org.veritasopher.seniz.exception.TransitionException;
import org.veritasopher.seniz.core.model.SystemEnv;
import org.veritasopher.seniz.core.model.domain.Action;
import org.veritasopher.seniz.core.model.domain.State;
import org.veritasopher.seniz.core.model.domain.Transition;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Transition Visitor
 *
 * @author Yepeng Ding
 * @date 12/3/2020
 */
public class TransitionVisitor extends SenizParserBaseVisitor<SystemEnv> {

    private final SystemEnv systemEnv;

    private final TransitionStatementVisitor transitionStatementVisitor;

    public TransitionVisitor(SystemEnv systemEnv) {
        this.systemEnv = systemEnv;
        this.transitionStatementVisitor = new TransitionStatementVisitor(systemEnv);
    }

    /**
     * Construct the transition set by visiting transition statements
     *
     * @param ctx transition statement context
     * @return system environment
     */
    @Override
    public SystemEnv visitTransitionStatement(SenizParser.TransitionStatementContext ctx) {
        int i = 0;
        Element element = ctx.getChild(i).accept(transitionStatementVisitor);

        // Safety check (only state and action are legal)
        if (element == null || element.type != ElementType.STATE) {
            throw new TransitionException(ctx.start.getLine(), "Unsupported transition declaration.");
        }

        // Complete the first state with values of not contained state variables as 'null'
        inferState(element.state);

        while (i < ctx.getChildCount() - 1) {
            Transition transition = new Transition();
            // Safety check
            if (element.type != ElementType.STATE) {
                throw new TransitionException(ctx.start.getLine(), "Unsupported transition declaration.");
            }

            transition.setSrcState(element.state);

            i += 2;
            element = ctx.getChild(i).accept(transitionStatementVisitor);

            if (element == null) {
                throw new TransitionException(ctx.start.getLine(), "Unsupported transition declaration.");
            }

            switch (element.type) {
                case STATE: {
                    // Implicit action can be omitted
                    // TODO infer dst state
                    transition.setDstState(inferState(transition.getSrcState(), element.state));
                    break;
                }
                case ACTION: {
                    // Explicit action
                    transition.setAction(element.action);

                    // Get destination state
                    i++;
                    element = ctx.getChild(i).accept(transitionStatementVisitor);

                    if (element == null) {
                        throw new TransitionException(ctx.start.getLine(), "Unsupported transition declaration.");
                    }
                    // TODO infer dst state
                    transition.setDstState(inferState(transition.getSrcState(), element.state));
                    break;
                }
            }

            // Transition duplicated
            if (systemEnv.haveTransition(transition)) {
                throw new TransitionException(ctx.start.getLine(), "Transition is duplicated.");
            }

            systemEnv.addTransition(transition);

        }

        return super.visitTransitionStatement(ctx);
    }


    private static class TransitionStatementVisitor extends SenizParserBaseVisitor<Element> {

        private final SystemEnv systemEnv;

        private final StateDeclaratorVisitor stateDeclaratorVisitor;

        TransitionStatementVisitor(SystemEnv systemEnv) {
            this.systemEnv = systemEnv;
            this.stateDeclaratorVisitor = new StateDeclaratorVisitor(systemEnv);
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

            if (ctx.IDENTIFIER() != null) {
                // Named state
                String name = ctx.IDENTIFIER().getText();
                Optional<State> s = systemEnv.getState(name);

                // Check whether state associated with identifier exists
                if (!s.isPresent()) {
                    throw new StateException(ctx.start.getLine(), "State named (" + name + ") does not exist.");
                }
                state = s.get();

            } else if (ctx.stateBody() != null) {
                // Unnamed state
                state = ctx.stateBody().stateDeclarator().accept(stateDeclaratorVisitor);
            } else {
                throw new StateException(ctx.start.getLine(), "Unsupported state type.");
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
                throw new ActionException(ctx.start.getLine(), "Unsupported action type.");
            }

            return new Element(ElementType.ACTION, new Action(ctx.IDENTIFIER().getText()));
        }

    }

    /**
     * Infer the first state of a transition
     *
     * @param fst first state
     * @return inferred state
     */
    private State inferState(State fst) {
        Set<String> varNames = fst.getVariables()
                .stream()
                .map(StateVariable::getName)
                .collect(Collectors.toSet());

        systemEnv.getVariableSet()
                .stream()
                .filter(v -> !varNames.contains(v.getName()))
                .forEach(fst.getVariables()::add);

        return fst;
    }

    /**
     * Infer destination state from source state
     *
     * @param src source state
     * @param dst destination state
     * @return inferred state
     */
    private State inferState(State src, State dst) {
        Set<String> varNames = dst.getVariables()
                .stream()
                .map(StateVariable::getName)
                .collect(Collectors.toSet());

        src.getVariables()
                .stream()
                .filter(v -> !varNames.contains(v.getName()))
                .forEach(dst.getVariables()::add);
        return dst;
    }

    /**
     * Main element types
     */
    private enum ElementType {
        STATE, ACTION
    }

    /**
     * Element
     */
    static class Element {

        private State state;

        private Action action;

        private final ElementType type;

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
