package org.veritasopher.seniz.core.visitor;

import lombok.Setter;
import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.*;
import org.veritasopher.seniz.exception.type.TransitionException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static org.veritasopher.seniz.core.tool.Naming.getNameForAnonymousProposition;

/**
 * Transition Rule Visitor
 * <p>
 * Construct transition rule base for state declarators
 *
 * @author Yepeng Ding
 * @date 3/5/2022
 */
public class TransitionRuleVisitor extends SenizParserBaseVisitor<Void> {

    private final TransitionSystem transitionSystem;

    private final StateIdentifierVisitor stateIdentifierVisitor;

    public TransitionRuleVisitor(TransitionSystem transitionSystem) {
        this.transitionSystem = transitionSystem;
        this.stateIdentifierVisitor = new StateIdentifierVisitor(transitionSystem);
    }

    /**
     * Construct the transition rule set by visiting transition statements
     *
     * @param ctx TransitionStatementContext
     * @return void
     */
    @Override
    public Void visitTransitionStatement(SenizParser.TransitionStatementContext ctx) {

        // Ensure the first is not a stuttering state declarator
        StateDeclarator stateDeclarator = ctx.stateIdentifier().accept(stateIdentifierVisitor).orElseThrow(() -> {
            throw new TransitionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Transition statement cannot start with a stuttering state declarator.");
        });

        TransitionRuleVisitor.TransitionDeclarationVisitor transitionDeclarationVisitor = new TransitionRuleVisitor.TransitionDeclarationVisitor(transitionSystem);

        transitionDeclarationVisitor.setSrcStateDeclaratorId(stateDeclarator.getId());

        ctx.transitionDeclaration().forEach(transitionDeclarationContext ->
                transitionDeclarationContext.accept(transitionDeclarationVisitor));

        return super.visitTransitionStatement(ctx);
    }

    private static class TransitionDeclarationVisitor extends SenizParserBaseVisitor<TransitionRule> {

        private final TransitionSystem transitionSystem;

        private final Map<String, Integer> stutteringStateDeclarators;

        private final StateIdentifierVisitor stateIdentifierVisitor;

        private final GlobalStateIdentifierVisitor globalStateIdentifierVisitor;

        private final ActionDeclarationVisitor actionDeclarationVisitor;

        @Setter
        private int srcStateDeclaratorId;

        private TransitionDeclarationVisitor(TransitionSystem transitionSystem) {
            this.transitionSystem = transitionSystem;
            this.stutteringStateDeclarators = new HashMap<>();
            this.stateIdentifierVisitor = new StateIdentifierVisitor(transitionSystem);
            this.globalStateIdentifierVisitor = new GlobalStateIdentifierVisitor(transitionSystem);
            this.actionDeclarationVisitor = new ActionDeclarationVisitor();
        }

        @Override
        public TransitionRule visitTransitionDeclaration(SenizParser.TransitionDeclarationContext ctx) {
            TransitionRule transitionRule = new TransitionRule();

            // Set source state declarator
            transitionRule.setSrcStateDeclarator(srcStateDeclaratorId);

            // Set guard (transition condition)
            Proposition guard;
            if (ctx.guardIdentifier() != null) {
                // Add new guard
                Evaluation evaluation = new Evaluation();
                ctx.guardIdentifier().propositionExpression().accept(new PropositionExpressionVisitor(transitionSystem, evaluation));
                guard = new Proposition(evaluation);
                guard.setName(getNameForAnonymousProposition(guard));
                transitionSystem.addProposition(guard);
            } else {
                // Set tautology
                guard = transitionSystem.getTautology();
            }
            transitionRule.setGuard(guard.hashCode());

            // Set action
            Action action;
            if (ctx.actionDeclaration() != null) {
                // Add new action
                action = ctx.actionDeclaration().accept(actionDeclarationVisitor);
                transitionSystem.addAction(action);
            } else {
                // Set epsilon action
                action = transitionSystem.getEpsilonAction();
            }
            transitionRule.setAction(action.hashCode());

            // Set global state declarator
            if (ctx.globalStateIdentifier() != null) {
                StateDeclarator globalStateDeclarator = ctx.globalStateIdentifier().accept(globalStateIdentifierVisitor);
                transitionRule.setGlobalStateDeclarator(globalStateDeclarator.getId());
            } else {
                transitionRule.setGlobalStateDeclarator(transitionSystem.getEmptyStateDeclarator().getId());
            }

            // Set destination state declarator
            Optional<StateDeclarator> dstStateDeclarator =
                    ctx.stateIdentifier().accept(stateIdentifierVisitor);

            int dstStateDeclaratorId;
            if (dstStateDeclarator.isPresent()) {
                dstStateDeclaratorId = dstStateDeclarator.get().getId();
            } else {
                // If a stuttering state declarator, create a loop transition (src = dst)
                String stutteringName = ctx.stateIdentifier().stateNameIdentifier().IDENTIFIER().getText();
                Integer stutteringState = this.stutteringStateDeclarators.get(stutteringName);
                if (stutteringState == null) {
                    // Add this stuttering state declarator if not existing
                    this.stutteringStateDeclarators.put(stutteringName, srcStateDeclaratorId);
                    dstStateDeclaratorId = srcStateDeclaratorId;
                } else {
                    dstStateDeclaratorId = stutteringState;
                }
            }

            transitionRule.setDstStateDeclarator(dstStateDeclaratorId);


            // Check duplicated transition rules
            if (transitionSystem.hasTransitionRule(transitionRule)) {
                throw new TransitionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Transition rule is duplicated.");
            }

            // Add new transition rule (including updating the rule base)
            transitionSystem.addTransitionRule(srcStateDeclaratorId, transitionRule);

            // Reset the source state for the recursive visit
            setSrcStateDeclaratorId(dstStateDeclaratorId);

            return transitionRule;
        }
    }

}
