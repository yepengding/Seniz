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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

    public TransitionVisitor(TransitionSystem transitionSystem) {
        this.transitionSystem = transitionSystem;
        this.stateIdentifierVisitor = new StateIdentifierVisitor(transitionSystem);
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
        if (state.isStuttering()) {
            throw new TransitionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Transition statement cannot start with a stuttering state declarator.");
        }

        // Infer the first state of this transition
        state = inferState(state);

        if (isInit) {
            // Add to initial state set
            transitionSystem.addInitState(state);
        }

        TransitionDeclarationVisitor transitionDeclarationVisitor = new TransitionDeclarationVisitor(transitionSystem);

        transitionDeclarationVisitor.setSrcState(state.hashCode());
        ctx.transitionDeclaration().forEach(transitionDeclarationContext ->
                transitionDeclarationContext.accept(transitionDeclarationVisitor));

        return super.visitTransitionStatement(ctx);

    }

    private static class TransitionDeclarationVisitor extends SenizParserBaseVisitor<Transition> {

        private final TransitionSystem transitionSystem;

        private final Map<String, State> stutteringStates;

        private final StateIdentifierVisitor stateIdentifierVisitor;

        private final ActionDeclarationVisitor actionDeclarationVisitor;

        @Setter
        private int srcState;

        private TransitionDeclarationVisitor(TransitionSystem transitionSystem) {
            this.transitionSystem = transitionSystem;
            this.stutteringStates = new HashMap<>();
            this.stateIdentifierVisitor = new StateIdentifierVisitor(transitionSystem);
            this.actionDeclarationVisitor = new ActionDeclarationVisitor();
        }

        @Override
        public Transition visitTransitionDeclaration(SenizParser.TransitionDeclarationContext ctx) {
            Transition transition = new Transition();

            // Set source state
            transition.setSrcState(srcState);

            // Set action
            Action action;
            if (ctx.actionDeclaration() != null) {
                // Add new action
                action = ctx.actionDeclaration().accept(actionDeclarationVisitor);
            } else {
                // Add epsilon action
                action = new Action(true, "");
            }
            transitionSystem.addAction(action);
            transition.setAction(action.hashCode());

            // Set destination state
            State dstState = ctx.stateIdentifier().accept(stateIdentifierVisitor);
            if (!dstState.isStuttering()) {
                // Infer destination state
                dstState = inferState(transitionSystem.getState(transition.getSrcState()), dstState);
            } else {
                // If stuttering state
                String stutteringName = dstState.getStutteringName();
                State stutteringState = this.stutteringStates.get(stutteringName);
                if (stutteringState == null) {
                    // Add this stuttering state if not existing
                    dstState = inferState(transitionSystem.getState(transition.getSrcState()), dstState);
                    this.stutteringStates.put(dstState.getStutteringName(), dstState);
                } else {
                    // Infer destination stuttering state
                    dstState = inferState(transitionSystem.getState(transition.getSrcState()), stutteringState);
                }
            }

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

            inferredState = new State(dst.isStuttering(), dst.getStutteringName(), variables);

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
