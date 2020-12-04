package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.exception.VariableException;
import org.veritasopher.seniz.core.model.SystemEnv;
import org.veritasopher.seniz.core.model.domain.State;
import org.veritasopher.seniz.core.model.domain.StateVariable;

import java.util.Set;
import java.util.stream.Collectors;

public class StateDeclaratorVisitor extends SenizParserBaseVisitor<State> {

    private final StateExpressionVisitor stateExpressionVisitor;

    public StateDeclaratorVisitor(SystemEnv systemEnv) {
        this.stateExpressionVisitor = new StateExpressionVisitor(systemEnv);
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

        private final SystemEnv systemEnv;

        private final LiteralVisitor literalVisitor;

        StateExpressionVisitor(SystemEnv systemEnv) {
            this.systemEnv = systemEnv;
            this.literalVisitor = new LiteralVisitor();
        }

        @Override
        public StateVariable visitStateExpression(SenizParser.StateExpressionContext ctx) {
            String name = ctx.IDENTIFIER().getText();
            StateVariable var = systemEnv.getVariable(name);

            // Check if variable is defined
            if (var == null) {
                throw new VariableException(ctx.start.getLine(), "Undefined variable.");
            }

            // Get value of the variable
            Object value = ctx.literal().accept(literalVisitor);

            return var.withValue(value);
        }

    }
}
