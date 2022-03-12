package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.VariableSet;
import org.veritasopher.seniz.core.model.common.Evaluation;
import org.veritasopher.seniz.core.model.common.StateVariable;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.exception.type.StateVariableException;

import java.util.Set;

/**
 * Variable Declarator Visitor
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class VariableDeclaratorVisitor extends SenizParserBaseVisitor<VariableSet> {

    private final String identifier;
    private final Set<String> systemVariableNameSet;

    public VariableDeclaratorVisitor(String identifier, Set<String> systemVariableNameSet) {
        this.identifier = identifier;
        this.systemVariableNameSet = systemVariableNameSet;
    }

    @Override
    public VariableSet visitVarSetDeclarator(SenizParser.VarSetDeclaratorContext ctx) {
        VariableSet variableSet = new VariableSet();
        variableSet.setIdentifier(identifier);

        VariableExpressionVisitor variableExpressionVisitor = new VariableExpressionVisitor(variableSet, systemVariableNameSet);
        ctx.varExpression().forEach(expr -> variableSet.addVariable(expr.accept(variableExpressionVisitor)));

        return variableSet;
    }

    private static class VariableExpressionVisitor extends SenizParserBaseVisitor<StateVariable> {

        private final VariableSet variableSet;

        private final Set<String> systemVariableNameSet;

        VariableExpressionVisitor(VariableSet variableSet, Set<String> systemVariableNameSet) {
            this.variableSet = variableSet;
            this.systemVariableNameSet = systemVariableNameSet;
        }

        @Override
        public StateVariable visitVarExpression(SenizParser.VarExpressionContext ctx) {
            String name = ctx.varIdentifier().IDENTIFIER().getText();

            // Check the name uniqueness
            if (variableSet.hasVariable(name)) {
                throw new StateVariableException(variableSet.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot use occupied state variable name (" + name + ").");
            } else if (systemVariableNameSet.contains(name)) {
                throw new StateVariableException(variableSet.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot use occupied system variable name (" + name + ").");
            }

            // Get type by type name
            PrimaryType primaryType = PrimaryType.getType(ctx.primitiveType().getText());

            // Get default evaluation for different types
            Evaluation evaluation = new Evaluation(primaryType);

            if (evaluation.getPNList().size() == 0) {
                // No default value for weird type
                throw new StateVariableException(variableSet.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported variable type.");
            }
            return new StateVariable(name, primaryType, evaluation);
        }
    }

}
