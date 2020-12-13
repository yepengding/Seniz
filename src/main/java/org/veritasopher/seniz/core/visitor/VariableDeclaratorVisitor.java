package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.mapper.TypeMapper;
import org.veritasopher.seniz.core.model.VariableSet;
import org.veritasopher.seniz.core.model.domain.StateVariable;
import org.veritasopher.seniz.exception.VariableException;

/**
 * Variable Declarator Visitor
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class VariableDeclaratorVisitor extends SenizParserBaseVisitor<VariableSet> {

    @Override
    public VariableSet visitStateVarSetDeclarator(SenizParser.StateVarSetDeclaratorContext ctx) {
        VariableSet variableSet = new VariableSet();

        VariableExpressionVisitor variableExpressionVisitor = new VariableExpressionVisitor(variableSet);
        ctx.stateVarExpression().forEach(expr -> variableSet.addVariable(expr.accept(variableExpressionVisitor)));

        return variableSet;
    }

    private static class VariableExpressionVisitor extends SenizParserBaseVisitor<StateVariable> {

        private final VariableSet variableSet;

        VariableExpressionVisitor(VariableSet variableSet) {
            this.variableSet = variableSet;
        }

        @Override
        public StateVariable visitStateVarExpression(SenizParser.StateVarExpressionContext ctx) {
            String name = ctx.stateVarIdentifier().IDENTIFIER().getText();

            // Check the name uniqueness
            if (variableSet.hasVariable(name)) {
                throw new VariableException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot use occupied variable name (" + name + ").");
            }

            String type = ctx.primitiveType().getText();
            return new StateVariable(name, TypeMapper.map(type), null);
        }
    }

}
