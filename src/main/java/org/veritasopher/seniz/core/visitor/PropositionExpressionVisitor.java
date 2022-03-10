package org.veritasopher.seniz.core.visitor;


import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.Evaluation;
import org.veritasopher.seniz.core.model.common.Term;
import org.veritasopher.seniz.core.model.common.Value;
import org.veritasopher.seniz.core.model.domain.Operator;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.exception.Assert;
import org.veritasopher.seniz.exception.type.ExpressionException;
import org.veritasopher.seniz.exception.type.PropositionException;

/**
 * Proposition Expression Visitor
 *
 * @author Yepeng Ding
 * @date 3/11/2022
 */
public class PropositionExpressionVisitor extends SenizParserBaseVisitor<Evaluation> {

    private final TransitionSystem transitionSystem;
    private final Evaluation evaluation;

    public PropositionExpressionVisitor(TransitionSystem transitionSystem, Evaluation evaluation) {
        this.transitionSystem = transitionSystem;
        this.evaluation = evaluation;
    }

    @Override
    public Evaluation visitPropositionPrimary(SenizParser.PropositionPrimaryContext ctx) {
        if (ctx.systemIdentifier() != null) {
            // TODO Check existence of system
            evaluation.addTerm(new Term(Operator.ACCESS));
            evaluation.addTerm(new Term(new Value(PrimaryType.SYSTEM, ctx.systemIdentifier().IDENTIFIER().getText())));
        }
        evaluation.addTerm(new Term(new Value(PrimaryType.PROPOSITION, ctx.propositionIdentifer().IDENTIFIER().getText())));
        return super.visitPropositionPrimary(ctx);
    }

    @Override
    public Evaluation visitPropExpression(SenizParser.PropExpressionContext ctx) {
        // Evaluate expression
        Evaluation exprEvaluation = new Evaluation();
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(exprEvaluation, transitionSystem);
        ctx.expression().accept(expressionVisitor);
        exprEvaluation.getPNList().forEach(evaluation::addTerm);

        return super.visitPropExpression(ctx);
    }

    @Override
    public Evaluation visitPropConditionalExpression(SenizParser.PropConditionalExpressionContext ctx) {
        Operator operator = Operator.getOperator(ctx.bop.getType());
        Assert.notNull(operator,
                new PropositionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported conditional operator."));
        evaluation.addTerm(new Term(operator));
        return super.visitPropConditionalExpression(ctx);
    }
}
