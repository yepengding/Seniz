package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.Evaluation;
import org.veritasopher.seniz.core.model.common.StateDeclarator;
import org.veritasopher.seniz.core.model.common.StateVariable;
import org.veritasopher.seniz.exception.Assert;
import org.veritasopher.seniz.exception.type.GlobalStateException;
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

    public StateDeclaratorVisitor(TransitionSystem transitionSystem, boolean isGlobal) {
        this.stateExpressionVisitor = new StateExpressionVisitor(transitionSystem, isGlobal);
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

        private final boolean isGlobal;

        StateExpressionVisitor(TransitionSystem transitionSystem, boolean isGlobal) {
            this.transitionSystem = transitionSystem;
            this.isGlobal = isGlobal;
        }

        @Override
        public StateVariable visitStateExpression(SenizParser.StateExpressionContext ctx) {
            String name = ctx.varIdentifier().IDENTIFIER().getText();

            StateVariable var;
            if (!isGlobal) {
                // State variable
                var = transitionSystem.getStateVariable(name).orElseThrow(() -> {
                    throw new StateVariableException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Undefined variable (" + name + ").");
                });
            } else {
                // Global (Shared) state variable
                // Check coinciding
                Assert.isTrue(transitionSystem.getStateVariable(name).isEmpty(),
                        new GlobalStateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Global variable (%s) has the same name with a defined variable.".formatted(name)));
                var = transitionSystem.getGlobalStateVariable(name).orElseThrow(() -> {
                    throw new GlobalStateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Undefined global variable (" + name + ").");
                });
            }

            // Get evaluation of the variable
            Evaluation evaluation = new Evaluation();
            ExpressionVisitor expressionVisitor = new ExpressionVisitor(evaluation, transitionSystem);
            ctx.expression().accept(expressionVisitor);

            return var.withEvaluation(evaluation);
        }

    }
}
