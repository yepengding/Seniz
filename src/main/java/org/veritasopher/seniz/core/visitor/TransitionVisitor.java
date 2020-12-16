package org.veritasopher.seniz.core.visitor;

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

    public TransitionVisitor(TransitionSystem transitionSystem) {
        this.transitionSystem = transitionSystem;
        this.stateIdentifierVisitor = new StateIdentifierVisitor(transitionSystem);
        this.actionDeclarationVisitor = new ActionDeclarationVisitor();
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

        // Check init identifier
        boolean isInit = false;
        if (ctx.initIdentifier() != null) {
            isInit = true;
            i++;
        }

        State state = ctx.getChild(i).accept(stateIdentifierVisitor);

        // Infer the first state
        state = inferState(state);

        if (isInit) {
            // Add to initial state set
            transitionSystem.addInitState(state);
        }

        Transition transition;
        while (i < ctx.getChildCount() - 1) {
            transition = new Transition();

            transition.setSrcState(state.hashCode());

            i += 2;
            Action action = ctx.getChild(i).accept(actionDeclarationVisitor);

            if (action != null) {
                // Add new action
                transitionSystem.addAction(action);

                transition.setAction(action.hashCode());

                // Get destination state
                i++;
            }
            state = ctx.getChild(i).accept(stateIdentifierVisitor);

            // Infer destination state
            state = inferState(transitionSystem.getState(transition.getSrcState()), state);
            transition.setDstState(state.hashCode());

            // Transition duplicated
            if (transitionSystem.hasTransition(transition)) {
                throw new TransitionException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Transition is duplicated.");
            }

            transitionSystem.addTransition(transition);

        }

        return super.visitTransitionStatement(ctx);

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

}
