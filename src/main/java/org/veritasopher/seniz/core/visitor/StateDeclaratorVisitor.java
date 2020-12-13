package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.exception.VariableException;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.domain.State;
import org.veritasopher.seniz.core.model.domain.StateVariable;

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

        private final LiteralVisitor literalVisitor;

        StateExpressionVisitor(TransitionSystem transitionSystem) {
            this.transitionSystem = transitionSystem;
            this.literalVisitor = new LiteralVisitor();
        }

        @Override
        public StateVariable visitStateExpression(SenizParser.StateExpressionContext ctx) {
            String name = ctx.stateVarIdentifier().IDENTIFIER().getText();
            StateVariable var = transitionSystem.getVariable(name);

            // Check if variable is defined
            if (var == null) {
                throw new VariableException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Undefined variable.");
            }

            // Get value of the variable
            Object value = ctx.literal().accept(literalVisitor);

            return var.withValue(value);
        }

    }
}
