package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.BaseSystem;
import org.veritasopher.seniz.core.model.common.Evaluation;

import java.util.List;
import java.util.stream.Collectors;

public class ParameterListVisitor extends SenizParserBaseVisitor<List<Evaluation>> {

    private final BaseSystem baseSystem;

    public ParameterListVisitor(BaseSystem baseSystem) {
        this.baseSystem = baseSystem;
    }

    @Override
    public List<Evaluation> visitParameterList(SenizParser.ParameterListContext ctx) {
        return ctx.expression().stream()
                .map(exprCtx -> {
                    Evaluation exprEvaluation = new Evaluation();
                    exprCtx.accept(new ExpressionVisitor(exprEvaluation, baseSystem));
                    return exprEvaluation;
                })
                .collect(Collectors.toList());
    }
}
