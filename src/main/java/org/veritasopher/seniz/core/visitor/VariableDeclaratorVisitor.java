package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.SystemArgumentSet;
import org.veritasopher.seniz.core.model.VariableSet;
import org.veritasopher.seniz.core.model.common.Evaluation;
import org.veritasopher.seniz.core.model.common.StateVariable;
import org.veritasopher.seniz.core.model.common.Term;
import org.veritasopher.seniz.core.model.common.Value;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.exception.type.StateVariableException;

/**
 * Variable Declarator Visitor
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class VariableDeclaratorVisitor extends SenizParserBaseVisitor<VariableSet> {

    private final SystemArgumentSet systemVariableSet;

    public VariableDeclaratorVisitor(SystemArgumentSet systemVariableSet) {
        this.systemVariableSet = systemVariableSet;
    }

    @Override
    public VariableSet visitVarSetDeclarator(SenizParser.VarSetDeclaratorContext ctx) {
        VariableSet variableSet = new VariableSet();

        VariableExpressionVisitor variableExpressionVisitor = new VariableExpressionVisitor(variableSet, systemVariableSet);
        ctx.varExpression().forEach(expr -> variableSet.addVariable(expr.accept(variableExpressionVisitor)));

        return variableSet;
    }

    private static class VariableExpressionVisitor extends SenizParserBaseVisitor<StateVariable> {

        private final VariableSet stateVariableSet;

        private final SystemArgumentSet systemArgumentSet;

        VariableExpressionVisitor(VariableSet stateVariableSet, SystemArgumentSet systemArgumentSet) {
            this.stateVariableSet = stateVariableSet;
            this.systemArgumentSet = systemArgumentSet;
        }

        @Override
        public StateVariable visitVarExpression(SenizParser.VarExpressionContext ctx) {
            String name = ctx.varIdentifier().IDENTIFIER().getText();

            // Check the name uniqueness
            if (systemArgumentSet.hasArgument(name)) {
                throw new StateVariableException(stateVariableSet.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot use occupied state variable name (" + name + ").");
            } else if (systemArgumentSet.hasArgument(name)) {
                throw new StateVariableException(stateVariableSet.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot use occupied system variable name (" + name + ").");
            }

            // Get type by type name
            PrimaryType primaryType = PrimaryType.getType(ctx.primitiveType().getText());

            // Get default evaluation for different types
            Evaluation evaluation = getDefaultEvaluation(primaryType);

            if (evaluation.getPN().size() == 0) {
                // No default value for weird type
                throw new StateVariableException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported variable type.");
            }
            return new StateVariable(name, primaryType, evaluation);
        }

        private Evaluation getDefaultEvaluation(PrimaryType primaryType) {
            Evaluation evaluation = new Evaluation();
            switch (primaryType) {
                case BOOLEAN: {
                    evaluation.addTerm(new Term(new Value(PrimaryType.BOOLEAN, false)));
                    break;
                }
                case INTEGER: {
                    evaluation.addTerm(new Term(new Value(PrimaryType.INTEGER, 0)));
                    break;
                }
                case FLOAT: {
                    evaluation.addTerm(new Term(new Value(PrimaryType.FLOAT, 0.0)));
                }
                case STRING: {
                    evaluation.addTerm(new Term(new Value(PrimaryType.STRING, "")));
                }
            }

            return evaluation;
        }
    }

}
