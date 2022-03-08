package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.Evaluation;
import org.veritasopher.seniz.core.model.common.StateDeclarator;
import org.veritasopher.seniz.core.model.common.StateVariable;
import org.veritasopher.seniz.exception.type.StateVariableException;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * State Declarator Visitor
 *
 * @author Yepeng Ding
 * @date 3/5/2022
 */
public class StateDeclaratorVisitor extends SenizParserBaseVisitor<StateDeclarator> {

    private final StateExpressionVisitor stateExpressionVisitor;

    public StateDeclaratorVisitor(TransitionSystem transitionSystem) {
        this.stateExpressionVisitor = new StateExpressionVisitor(transitionSystem);
    }

    @Override
    public StateDeclarator visitStateDeclarator(SenizParser.StateDeclaratorContext ctx) {
        Set<StateVariable> stateVariables = ctx.stateExpression()
                .stream()
                .map(expr -> expr.accept(stateExpressionVisitor))
                .collect(Collectors.toSet());

        return new StateDeclarator(ctx.hashCode(), stateVariables);
    }

    private static class StateExpressionVisitor extends SenizParserBaseVisitor<StateVariable> {

        private final TransitionSystem transitionSystem;

        StateExpressionVisitor(TransitionSystem transitionSystem) {
            this.transitionSystem = transitionSystem;
        }

        @Override
        public StateVariable visitStateExpression(SenizParser.StateExpressionContext ctx) {
            String name = ctx.varIdentifier().IDENTIFIER().getText();
            StateVariable var = transitionSystem.getStateVariable(name);

            // Check if variable is defined
            if (var == null) {
                throw new StateVariableException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Undefined variable (" + name + ").");
            }

            // Get evaluation of the variable
            Evaluation evaluation = new Evaluation();
            ExpressionVisitor expressionVisitor = new ExpressionVisitor(evaluation, transitionSystem.getSystemArguments(), transitionSystem.getStateVariables());
            ctx.expression().accept(expressionVisitor);

            return var.withEvaluation(evaluation);
        }

    }
}
