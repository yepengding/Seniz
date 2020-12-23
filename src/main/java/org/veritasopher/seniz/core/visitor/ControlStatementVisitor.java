package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;

import java.util.List;

public class ControlStatementVisitor extends SenizParserBaseVisitor<List<String>> {

    private final List<String> identifiers;

    public ControlStatementVisitor(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    // TODO Support interleaving only
    @Override
    public List<String> visitControlStatement(SenizParser.ControlStatementContext ctx) {
        ctx.subSystemIdentifier().forEach(i -> identifiers.add(i.systemIdentifier().IDENTIFIER().getText()));
        return super.visitControlStatement(ctx);
    }
}
