package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.ControlSystem;
import org.veritasopher.seniz.core.model.common.ControlStatement;
import org.veritasopher.seniz.core.model.domain.CompositionType;
import org.veritasopher.seniz.exception.Assert;
import org.veritasopher.seniz.exception.type.ControlStatementException;

import java.util.ArrayList;

/**
 * Control Statement Visitor
 *
 * @author Yepeng Ding
 * @date 3/11/2022
 */
public class ControlStatementVisitor extends SenizParserBaseVisitor<Void> {

    private final ControlSystem controlSystem;
    private final ControlStatement controlStatement;

    public ControlStatementVisitor(ControlSystem controlSystem, ControlStatement controlStatement) {
        this.controlSystem = controlSystem;
        this.controlStatement = controlStatement;
    }

    @Override
    public Void visitSyncControlStatement(SenizParser.SyncControlStatementContext ctx) {
        controlStatement.setCompositionType(CompositionType.SYNC);
        ctx.subSystemIdentifier().forEach(i -> {
            String alias = i.systemAlias().IDENTIFIER().getText();
            Assert.isTrue(!controlStatement.hasSystemAlias(alias),
                    new ControlStatementException("System alias (%s) has been occupied.".formatted(alias)));
            if (i.parameterList() != null) {
                controlStatement.addSubsystem(new ControlStatement.SubSystem(
                        alias, i.systemIdentifier().IDENTIFIER().getText(), i.parameterList().accept(new ParameterListVisitor(controlSystem))));
            } else {
                controlStatement.addSubsystem(new ControlStatement.SubSystem(
                        alias, i.systemIdentifier().IDENTIFIER().getText(), new ArrayList<>()));
            }
        });
        return super.visitSyncControlStatement(ctx);
    }

    @Override
    public Void visitAsyncControlStatement(SenizParser.AsyncControlStatementContext ctx) {
        controlStatement.setCompositionType(CompositionType.ASYNC);
        ctx.subSystemIdentifier().forEach(i -> {
            String alias = i.systemAlias().IDENTIFIER().getText();
            Assert.isTrue(!controlStatement.hasSystemAlias(alias),
                    new ControlStatementException("System alias (%s) has been occupied.".formatted(alias)));
            if (i.parameterList() != null) {
                controlStatement.addSubsystem(new ControlStatement.SubSystem(
                        alias, i.systemIdentifier().IDENTIFIER().getText(), i.parameterList().accept(new ParameterListVisitor(controlSystem))));
            } else {
                controlStatement.addSubsystem(new ControlStatement.SubSystem(
                        alias, i.systemIdentifier().IDENTIFIER().getText(), new ArrayList<>()));
            }
        });
        return super.visitAsyncControlStatement(ctx);
    }
}
