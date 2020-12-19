package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.StateVariableSet;
import org.veritasopher.seniz.core.model.SystemVariableSet;
import org.veritasopher.seniz.core.model.common.Evaluation;
import org.veritasopher.seniz.core.model.common.StateVariable;
import org.veritasopher.seniz.core.model.common.Term;
import org.veritasopher.seniz.core.model.common.Value;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.exception.StateVariableException;

/**
 * Variable Declarator Visitor
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class StateVariableDeclaratorVisitor extends SenizParserBaseVisitor<StateVariableSet> {

    private final SystemVariableSet systemVariableSet;

    public StateVariableDeclaratorVisitor(SystemVariableSet systemVariableSet) {
        this.systemVariableSet = systemVariableSet;
    }

    @Override
    public StateVariableSet visitStateVarSetDeclarator(SenizParser.StateVarSetDeclaratorContext ctx) {
        StateVariableSet stateVariableSet = new StateVariableSet();

        StateVariableExpressionVisitor variableExpressionVisitor = new StateVariableExpressionVisitor(stateVariableSet, systemVariableSet);
        ctx.stateVarExpression().forEach(expr -> stateVariableSet.addVariable(expr.accept(variableExpressionVisitor)));

        return stateVariableSet;
    }

    private static class StateVariableExpressionVisitor extends SenizParserBaseVisitor<StateVariable> {

        private final StateVariableSet stateVariableSet;

        private final SystemVariableSet systemVariableSet;

        StateVariableExpressionVisitor(StateVariableSet stateVariableSet, SystemVariableSet systemVariableSet) {
            this.stateVariableSet = stateVariableSet;
            this.systemVariableSet = systemVariableSet;
        }

        @Override
        public StateVariable visitStateVarExpression(SenizParser.StateVarExpressionContext ctx) {
            String name = ctx.stateVarIdentifier().IDENTIFIER().getText();

            // Check the name uniqueness
            if (stateVariableSet.hasVariable(name)) {
                throw new StateVariableException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot use occupied state variable name (" + name + ").");
            } else if (systemVariableSet.hasVariable(name)) {
                throw new StateVariableException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot use occupied system variable name (" + name + ").");
            }

            // Get type by type name
            PrimaryType primaryType = PrimaryType.getType(ctx.primitiveType().getText());

            // Get default evaluation for different types
            Evaluation evaluation = getDefaultEvaluation(primaryType);

            if (evaluation.getRPN().size() == 0) {
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
