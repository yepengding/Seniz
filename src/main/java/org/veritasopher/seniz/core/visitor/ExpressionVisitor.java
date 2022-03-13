package org.veritasopher.seniz.core.visitor;

import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.Evaluation;
import org.veritasopher.seniz.core.model.common.Term;
import org.veritasopher.seniz.core.model.common.Value;
import org.veritasopher.seniz.core.model.domain.Operator;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.exception.type.ExpressionException;

import java.util.stream.Collectors;

/**
 * Expression Visitor
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class ExpressionVisitor extends SenizParserBaseVisitor<Evaluation> {

    private final LiteralVisitor literalVisitor;

    private final Evaluation evaluation;

    private final TransitionSystem transitionSystem;


    public ExpressionVisitor(Evaluation evaluation, TransitionSystem transitionSystem) {
        this.literalVisitor = new LiteralVisitor();
        this.evaluation = evaluation;
        this.transitionSystem = transitionSystem;
    }


    @Override
    public Evaluation visitPrimaryExpression(SenizParser.PrimaryExpressionContext ctx) {
        if (ctx.primary().literal() != null) {
            evaluation.addTerm(new Term(ctx.primary().literal().accept(literalVisitor)));
        } else if (ctx.primary().variableIdentifier() != null) {
            String name = ctx.primary().variableIdentifier().IDENTIFIER().stream().map(ParseTree::getText).collect(Collectors.joining("."));
            // Check whether variable is defined as system argument, state variable, or global state variable
            if (transitionSystem.hasSystemArgument(name)) {
                evaluation.addTerm(new Term(new Value(PrimaryType.ARGUMENT, name)));
            } else if (transitionSystem.getStateVariable(name).isPresent()) {
                evaluation.addTerm(new Term(new Value(PrimaryType.VARIABLE, name)));
            } else if (transitionSystem.getGlobalStateVariable(name).isPresent()) {
                evaluation.addTerm(new Term(new Value(PrimaryType.GLOBAL_VARIABLE, name)));
            } else {
                throw new ExpressionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Undefined state variable or system argument.");
            }
        } else {
            throw new ExpressionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Illegal primary expression.");
        }

        return super.visitPrimaryExpression(ctx);
    }

    @Override
    public Evaluation visitUnaryExpression(SenizParser.UnaryExpressionContext ctx) {
        Operator operator = Operator.getOperator(ctx.prefix.getType());
        if (operator == null) {
            throw new ExpressionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported unary operator.");
        }
        evaluation.addTerm(new Term(operator));
        evaluation.addTerm(new Term(new Value(PrimaryType.INTEGER, 0)));
        return super.visitUnaryExpression(ctx);
    }

    @Override
    public Evaluation visitNotExpression(SenizParser.NotExpressionContext ctx) {
        Operator operator = Operator.getOperator(ctx.prefix.getType());
        if (operator == null) {
            throw new ExpressionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported not operator.");
        }
        evaluation.addTerm(new Term(operator));
        return super.visitNotExpression(ctx);
    }

    @Override
    public Evaluation visitAdditiveExpression(SenizParser.AdditiveExpressionContext ctx) {
        Operator operator = Operator.getOperator(ctx.bop.getType());
        if (operator == null) {
            throw new ExpressionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported additive operator.");
        }
        evaluation.addTerm(new Term(operator));
        return super.visitAdditiveExpression(ctx);
    }

    @Override
    public Evaluation visitMultiplicativeExpression(SenizParser.MultiplicativeExpressionContext ctx) {
        Operator operator = Operator.getOperator(ctx.bop.getType());
        if (operator == null) {
            throw new ExpressionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported multiplicative operator.");
        }
        evaluation.addTerm(new Term(operator));
        return super.visitMultiplicativeExpression(ctx);
    }

    @Override
    public Evaluation visitRelationalExpression(SenizParser.RelationalExpressionContext ctx) {
        Operator operator = Operator.getOperator(ctx.bop.getType());
        if (operator == null) {
            throw new ExpressionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported relational operator.");
        }
        evaluation.addTerm(new Term(operator));
        return super.visitRelationalExpression(ctx);
    }

    @Override
    public Evaluation visitConditionalExpression(SenizParser.ConditionalExpressionContext ctx) {
        Operator operator = Operator.getOperator(ctx.bop.getType());
        if (operator == null) {
            throw new ExpressionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported conditional operator.");
        }
        evaluation.addTerm(new Term(operator));
        return super.visitConditionalExpression(ctx);
    }
}
