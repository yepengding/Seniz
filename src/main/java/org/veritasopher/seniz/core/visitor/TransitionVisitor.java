package org.veritasopher.seniz.core.visitor;

import lombok.Setter;
import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.Action;
import org.veritasopher.seniz.core.model.common.State;
import org.veritasopher.seniz.core.model.common.StateVariable;
import org.veritasopher.seniz.core.model.common.Transition;
import org.veritasopher.seniz.exception.TransitionException;

import java.util.HashSet;
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

    private final StateIdentifierVisitor stateIdentifierVisitor;

    private final ActionDeclarationVisitor actionDeclarationVisitor;

    private final TransitionDeclarationVisitor transitionDeclarationVisitor;

    public TransitionVisitor(TransitionSystem transitionSystem) {
        this.transitionSystem = transitionSystem;
        this.stateIdentifierVisitor = new StateIdentifierVisitor(transitionSystem);
        this.actionDeclarationVisitor = new ActionDeclarationVisitor();
        this.transitionDeclarationVisitor = new TransitionDeclarationVisitor(transitionSystem);
    }

    /**
     * Construct the transition set by visiting transition statements
     *
     * @param ctx transition statement context
     * @return transition system
     */
    @Override
    public TransitionSystem visitTransitionStatement(SenizParser.TransitionStatementContext ctx) {

        // Check init identifier
        boolean isInit = ctx.initIdentifier() != null;

        State state = ctx.stateIdentifier().accept(stateIdentifierVisitor);
        if (state.isStutter()) {
            throw new TransitionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Transition statement cannot start with a stuttering state declarator.");
        }

        // Infer the first state
        state = inferState(state);

        if (isInit) {
            // Add to initial state set
            transitionSystem.addInitState(state);
        }

        transitionDeclarationVisitor.setSrcState(state.hashCode());
        ctx.transitionDeclaration().forEach(transitionDeclarationContext ->
                transitionDeclarationContext.accept(transitionDeclarationVisitor));
//        Transition transition;
//        while (i < ctx.getChildCount() - 1) {
//            transition = new Transition();
//
//            transition.setSrcState(state.hashCode());
//
//            i += 2;
//            Action action = ctx.getChild(i).accept(actionDeclarationVisitor);
//
//            if (action != null) {
//                // Add new action
//                transitionSystem.addAction(action);
//
//                transition.setAction(action.hashCode());
//
//                // Get destination state
//                i++;
//            }
//            state = ctx.getChild(i).accept(stateIdentifierVisitor);
//
//            // Infer destination state
//            state = inferState(transitionSystem.getState(transition.getSrcState()), state);
//            transition.setDstState(state.hashCode());
//
//            // Transition duplicated
//            if (transitionSystem.hasTransition(transition)) {
//                throw new TransitionException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Transition is duplicated.");
//            }
//
//            transitionSystem.addTransition(transition);
//
//        }

        return super.visitTransitionStatement(ctx);

    }

    private static class TransitionDeclarationVisitor extends SenizParserBaseVisitor<Transition> {

        private final TransitionSystem transitionSystem;

        private final StateIdentifierVisitor stateIdentifierVisitor;

        private final ActionDeclarationVisitor actionDeclarationVisitor;

        @Setter
        private int srcState;

        private TransitionDeclarationVisitor(TransitionSystem transitionSystem) {
            this.transitionSystem = transitionSystem;
            this.stateIdentifierVisitor = new StateIdentifierVisitor(transitionSystem);
            this.actionDeclarationVisitor = new ActionDeclarationVisitor();
        }

        @Override
        public Transition visitTransitionDeclaration(SenizParser.TransitionDeclarationContext ctx) {
            Transition transition = new Transition();

            // Set source state
            transition.setSrcState(srcState);

            // Set action
            ActionDeclarationVisitor actionDeclarationVisitor = new ActionDeclarationVisitor();
            if (ctx.actionDeclaration() != null) {
                // Add new action
                Action action = ctx.actionDeclaration().accept(actionDeclarationVisitor);
                transitionSystem.addAction(action);
                transition.setAction(action.hashCode());
            }

            // Set destination state
            State dstState = ctx.stateIdentifier().accept(stateIdentifierVisitor);
            // Infer destination state
            dstState = inferState(transitionSystem.getState(transition.getSrcState()), dstState);
            transition.setDstState(dstState.hashCode());


            // Check duplicated transitions
            if (transitionSystem.hasTransition(transition)) {
                throw new TransitionException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Transition is duplicated.");
            }

            // Add new transition
            transitionSystem.addTransition(transition);

            // Reset the source state for the recursive visit
            setSrcState(dstState.hashCode());

            return transition;
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
    }


    /**
     * Infer the first state of a transition
     * Complete the first state with values of not explicitly identified state variables as default
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

        transitionSystem.getStateVariableSet()
                .stream()
                .filter(v -> !varNames.contains(v.getName()))
                .forEach(variables::add);

        inferredState = new State(variables);

        // Add state
        transitionSystem.addState(inferredState);
        return inferredState;
    }


}
