package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.common.Evaluation;
import org.veritasopher.seniz.exception.StateVariableException;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.State;
import org.veritasopher.seniz.core.model.common.StateVariable;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * State Declarator Visitor
 *
 * @author Yepeng Ding
 * @date 12/4/2020
 */
public class StateDeclaratorVisitor extends SenizParserBaseVisitor<State> {

    private final StateExpressionVisitor stateExpressionVisitor;

    public StateDeclaratorVisitor(TransitionSystem transitionSystem) {
        this.stateExpressionVisitor = new StateExpressionVisitor(transitionSystem);
    }

    @Override
    public State visitStateDeclarator(SenizParser.StateDeclaratorContext ctx) {
        Set<StateVariable> stateVariables = ctx.stateExpression()
                .stream()
                .map(expr -> expr.accept(stateExpressionVisitor))
                .collect(Collectors.toSet());

        return new State(stateVariables);
    }

    private static class StateExpressionVisitor extends SenizParserBaseVisitor<StateVariable> {

        private final TransitionSystem transitionSystem;

        StateExpressionVisitor(TransitionSystem transitionSystem) {
            this.transitionSystem = transitionSystem;
        }

        @Override
        public StateVariable visitStateExpression(SenizParser.StateExpressionContext ctx) {
            String name = ctx.stateVarIdentifier().IDENTIFIER().getText();
            StateVariable var = transitionSystem.getStateVariable(name);

            // Check if variable is defined
            if (var == null) {
                throw new StateVariableException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Undefined variable.");
            }

            // Get evaluation of the variable
            Evaluation evaluation = new Evaluation();
            ExpressionVisitor expressionVisitor = new ExpressionVisitor(evaluation);
            ctx.expression().accept(expressionVisitor);

            return var.withEvaluation(evaluation);
        }

    }
}
