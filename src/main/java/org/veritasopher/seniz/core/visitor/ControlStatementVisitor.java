package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.common.ControlStatement;
import org.veritasopher.seniz.core.model.domain.CompositionType;

public class ControlStatementVisitor extends SenizParserBaseVisitor<Void> {

    private final ControlStatement controlStatement;

    public ControlStatementVisitor(ControlStatement controlStatement) {
        this.controlStatement = controlStatement;
    }

    @Override
    public Void visitSyncControlStatement(SenizParser.SyncControlStatementContext ctx) {
        controlStatement.setCompositionType(CompositionType.SYNC);
        ctx.subSystemIdentifier().forEach(i -> controlStatement.addSystemIdentifier(i.systemIdentifier().IDENTIFIER().getText()));
        return super.visitSyncControlStatement(ctx);
    }

    @Override
    public Void visitAsyncControlStatement(SenizParser.AsyncControlStatementContext ctx) {
        controlStatement.setCompositionType(CompositionType.ASYNC);
        ctx.subSystemIdentifier().forEach(i -> controlStatement.addSystemIdentifier(i.systemIdentifier().IDENTIFIER().getText()));
        return super.visitAsyncControlStatement(ctx);
    }
}
