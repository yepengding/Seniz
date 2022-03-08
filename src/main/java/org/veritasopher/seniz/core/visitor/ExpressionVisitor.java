package org.veritasopher.seniz.core.visitor;

import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.VariableSet;
import org.veritasopher.seniz.core.model.SystemArgumentSet;
import org.veritasopher.seniz.core.model.common.Evaluation;
import org.veritasopher.seniz.core.model.common.Term;
import org.veritasopher.seniz.core.model.common.Value;
import org.veritasopher.seniz.core.model.domain.Operator;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.exception.type.ExpressionException;

import java.util.stream.Collectors;

public class ExpressionVisitor extends SenizParserBaseVisitor<Evaluation> {

    private final LiteralVisitor literalVisitor;

    private final Evaluation evaluation;

    private final SystemArgumentSet systemArgumentSet;

    private final VariableSet stateVariableSet;

    public ExpressionVisitor(Evaluation evaluation, SystemArgumentSet systemArgumentSet, VariableSet stateVariableSet) {
        this.literalVisitor = new LiteralVisitor();
        this.evaluation = evaluation;
        this.systemArgumentSet = systemArgumentSet;
        this.stateVariableSet = stateVariableSet;
    }


    @Override
    public Evaluation visitPrimaryExpression(SenizParser.PrimaryExpressionContext ctx) {
        if (ctx.primary().literal() != null) {
            evaluation.addTerm(new Term(ctx.primary().literal().accept(literalVisitor)));
        } else if (ctx.primary().variableIdentifier() != null) {
            String name = ctx.primary().variableIdentifier().IDENTIFIER().stream().map(ParseTree::getText).collect(Collectors.joining("."));
            // Check whether variable is defined as system variable or state variable
            if (!systemArgumentSet.hasArgument(name) && !stateVariableSet.hasVariable(name)) {
                throw new ExpressionException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Undefined variable.");
            }
            evaluation.addTerm(new Term(new Value(PrimaryType.VARIABLE, name)));
        } else {
            throw new ExpressionException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Illegal primary expression.");
        }

        return super.visitPrimaryExpression(ctx);
    }

    @Override
    public Evaluation visitUnaryExpression(SenizParser.UnaryExpressionContext ctx) {
        Operator operator = Operator.getOperator(ctx.prefix.getType());
        if (operator == null) {
            throw new ExpressionException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported unary operator.");
        }
        evaluation.addTerm(new Term(operator));
        evaluation.addTerm(new Term(new Value(PrimaryType.INTEGER, 0)));
        return super.visitUnaryExpression(ctx);
    }

    @Override
    public Evaluation visitNotExpression(SenizParser.NotExpressionContext ctx) {
        Operator operator = Operator.getOperator(ctx.prefix.getType());
        if (operator == null) {
            throw new ExpressionException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported not operator.");
        }
        evaluation.addTerm(new Term(operator));
        return super.visitNotExpression(ctx);
    }

    @Override
    public Evaluation visitAdditiveExpression(SenizParser.AdditiveExpressionContext ctx) {
        Operator operator = Operator.getOperator(ctx.bop.getType());
        if (operator == null) {
            throw new ExpressionException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported additive operator.");
        }
        evaluation.addTerm(new Term(operator));
        return super.visitAdditiveExpression(ctx);
    }

    @Override
    public Evaluation visitMultiplicativeExpression(SenizParser.MultiplicativeExpressionContext ctx) {
        Operator operator = Operator.getOperator(ctx.bop.getType());
        if (operator == null) {
            throw new ExpressionException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported multiplicative operator.");
        }
        evaluation.addTerm(new Term(operator));
        return super.visitMultiplicativeExpression(ctx);
    }

    @Override
    public Evaluation visitRelationalExpression(SenizParser.RelationalExpressionContext ctx) {
        Operator operator = Operator.getOperator(ctx.bop.getType());
        if (operator == null) {
            throw new ExpressionException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported relational operator.");
        }
        evaluation.addTerm(new Term(operator));
        return super.visitRelationalExpression(ctx);
    }

    @Override
    public Evaluation visitConditionalExpression(SenizParser.ConditionalExpressionContext ctx) {
        Operator operator = Operator.getOperator(ctx.bop.getType());
        if (operator == null) {
            throw new ExpressionException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported conditional operator.");
        }
        evaluation.addTerm(new Term(operator));
        return super.visitConditionalExpression(ctx);
    }
}
