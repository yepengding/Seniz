package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.common.Evaluation;
import org.veritasopher.seniz.core.model.common.Term;
import org.veritasopher.seniz.core.model.common.Value;
import org.veritasopher.seniz.core.model.domain.Operator;
import org.veritasopher.seniz.core.model.domain.Type;
import org.veritasopher.seniz.exception.ExpressionException;

public class ExpressionVisitor extends SenizParserBaseVisitor<Evaluation> {

    private final LiteralVisitor literalVisitor;

    private final Evaluation evaluation;

    public ExpressionVisitor(Evaluation evaluation) {
        this.literalVisitor = new LiteralVisitor();
        this.evaluation = evaluation;
    }


    @Override
    public Evaluation visitPrimaryExpression(SenizParser.PrimaryExpressionContext ctx) {
        if (ctx.primary().literal() != null) {
            evaluation.addTerm(new Term(ctx.primary().literal().accept(literalVisitor)));
        } else if (ctx.primary().variableIdentifier() != null) {
            evaluation.addTerm(new Term(new Value(Type.VARIABLE, ctx.primary().variableIdentifier().IDENTIFIER())));
        } else {
            throw new ExpressionException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Illegal primary expression.");
        }

        return super.visitPrimaryExpression(ctx);
    }

    @Override
    public Evaluation visitAdditiveExpression(SenizParser.AdditiveExpressionContext ctx) {
        Operator operator = Operator.getOperator(ctx.bop.getType());
        if (operator == null) {
            throw new ExpressionException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported additive operator.");
        }
        evaluation.addTerm(new Term(operator));
        return super.visitAdditiveExpression(ctx);
    }

    @Override
    public Evaluation visitMultiplicativeExpression(SenizParser.MultiplicativeExpressionContext ctx) {
        Operator operator = Operator.getOperator(ctx.bop.getType());
        if (operator == null) {
            throw new ExpressionException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported multiplicative operator.");
        }
        evaluation.addTerm(new Term(operator));
        return super.visitMultiplicativeExpression(ctx);
    }



}
