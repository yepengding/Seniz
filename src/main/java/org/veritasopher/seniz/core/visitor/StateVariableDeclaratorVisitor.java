package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.StateVariableSet;
import org.veritasopher.seniz.core.model.common.StateVariable;
import org.veritasopher.seniz.core.model.domain.Type;
import org.veritasopher.seniz.exception.StateVariableException;

/**
 * Variable Declarator Visitor
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class StateVariableDeclaratorVisitor extends SenizParserBaseVisitor<StateVariableSet> {

    @Override
    public StateVariableSet visitStateVarSetDeclarator(SenizParser.StateVarSetDeclaratorContext ctx) {
        StateVariableSet stateVariableSet = new StateVariableSet();

        StateVariableExpressionVisitor variableExpressionVisitor = new StateVariableExpressionVisitor(stateVariableSet);
        ctx.stateVarExpression().forEach(expr -> stateVariableSet.addVariable(expr.accept(variableExpressionVisitor)));

        return stateVariableSet;
    }

    private static class StateVariableExpressionVisitor extends SenizParserBaseVisitor<StateVariable> {

        private final StateVariableSet stateVariableSet;

        StateVariableExpressionVisitor(StateVariableSet stateVariableSet) {
            this.stateVariableSet = stateVariableSet;
        }

        @Override
        public StateVariable visitStateVarExpression(SenizParser.StateVarExpressionContext ctx) {
            String name = ctx.stateVarIdentifier().IDENTIFIER().getText();

            // Check the name uniqueness
            if (stateVariableSet.hasVariable(name)) {
                throw new StateVariableException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot use occupied variable name (" + name + ").");
            }

            // Get type by type name
            Type type = Type.getType(ctx.primitiveType().getText());
            if (type == Type.NULL) {
                throw new StateVariableException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported variable type.");
            }
            return new StateVariable(name, type, null);
        }
    }

}
