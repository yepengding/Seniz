package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.Evaluation;
import org.veritasopher.seniz.core.model.common.Proposition;
import org.veritasopher.seniz.core.tool.Naming;
import org.veritasopher.seniz.exception.Assert;
import org.veritasopher.seniz.exception.type.PropositionException;

/**
 * Proposition Visitor
 *
 * @author Yepeng Ding
 * @date 3/10/2022
 */
public class PropositionVisitor extends SenizParserBaseVisitor<Void> {

    private final TransitionSystem transitionSystem;

    public PropositionVisitor(TransitionSystem transitionSystem) {
        this.transitionSystem = transitionSystem;
    }

    /**
     * Visit proposition statement
     *
     * @param ctx PropositionStatementContext
     * @return void
     */
    @Override
    public Void visitPropositionStatement(SenizParser.PropositionStatementContext ctx) {
        String name = ctx.propositionIdentifer().IDENTIFIER().getText();
        Assert.isTrue(Naming.satisfyPropositionNamingRule(name),
                new PropositionException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Invalid proposition name (" + name + ")."));

        Evaluation evaluation = new Evaluation();
        ctx.propositionBody().propositionExpression().accept(new PropositionExpressionVisitor(transitionSystem, evaluation));
        Proposition proposition = new Proposition(false, name, evaluation);

        transitionSystem.addProposition(proposition);
        return super.visitPropositionStatement(ctx);
    }

}
