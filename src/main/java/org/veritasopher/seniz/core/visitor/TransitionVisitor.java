package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.*;
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
        // Ensure the init state declarator
        boolean isInit = ctx.initIdentifier() != null;
        if (!isInit) {
            return super.visitTransitionStatement(ctx);
        }

        Optional<StateDeclarator> stateDeclarator = ctx.stateIdentifier().accept(stateIdentifierVisitor);
        if (stateDeclarator.isEmpty()) {
            throw new TransitionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Transition statement cannot start with a stuttering state declarator.");
        }

        // Infer the first state of this transition (the init state)
        State initState = inferState(stateDeclarator.get());
        // Add state and initState
        transitionSystem.addState(initState);
        transitionSystem.addInitState(initState);

        // Generate transitions derived from the initial state
        generateTransitions(ctx, initState);

        return super.visitTransitionStatement(ctx);
    }

    /**
     * Generate transitions derived from a given state
     *
     * @param ctx      TransitionStatementContext
     * @param srcState source state
     */
    private void generateTransitions(SenizParser.TransitionStatementContext ctx, State srcState) {
        // Get transition rules deriving from the source state
        Set<TransitionRule> transitionRules = transitionSystem.getStateDeclaratorIds(srcState).stream()
                .map(transitionSystem::getTransitionRules)
                .flatMap(Set::stream)
                .collect(Collectors.toSet());

        transitionRules.forEach(rule -> generateTransitionsByRule(ctx, srcState, rule));
    }

    /**
     * Generate transitions by a given transition rule
     *
     * @param ctx      TransitionStatementContext
     * @param srcState source state
     * @param rule     transition rule
     */
    private void generateTransitionsByRule(SenizParser.TransitionStatementContext ctx, State srcState, TransitionRule rule) {
        Transition transition = new Transition();
        // Set source state
        transition.setSrcState(srcState.hashCode());

        // Set action
        transition.setAction(rule.getAction());

        // Set destination state
        Optional<StateDeclarator> dstStateDeclarator = transitionSystem.getStateDeclarator(rule.getDstStateDeclarator());
        if (dstStateDeclarator.isEmpty()) {
            throw new TransitionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Destination state declarator is unknown.");
        }
        State dstState = inferState(transitionSystem.getState(transition.getSrcState()), dstStateDeclarator.get());
        boolean dstStateExists = transitionSystem.hasState(dstState);
        if (!dstStateExists) {
            // Add the inferred destination state if not exists
            transitionSystem.addState(dstState);
        }
        transition.setDstState(dstState.hashCode());

        // Check duplicated transitions
        if (transitionSystem.hasTransition(transition)) {
            throw new TransitionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Transition is duplicated.");
        }
        // Add new transition
        transitionSystem.addTransition(transition);

        // If the destination state is newly inferred, generate transitions derived from it.
        if (!dstStateExists) {
            generateTransitions(ctx, dstState);
        }
    }


    /**
     * Infer destination state from source state
     *
     * @param src source state
     * @param dst destination state
     * @return inferred state
     */
    private State inferState(State src, StateDeclarator dst) {
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

        return inferredState;
    }

    /**
     * Infer the first state of a transition
     * Complete the first state with values of not explicitly identified state variables as default
     *
     * @param fst first state
     * @return inferred state
     */
    private State inferState(StateDeclarator fst) {
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

        return inferredState;
    }


}
