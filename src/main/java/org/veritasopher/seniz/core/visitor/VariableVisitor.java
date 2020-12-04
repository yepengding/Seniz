package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.mapper.TypeMapper;
import org.veritasopher.seniz.core.model.domain.StateVariable;
import org.veritasopher.seniz.core.model.SystemEnv;

public class VariableVisitor extends SenizParserBaseVisitor<SystemEnv> {

    private final SystemEnv systemEnv;

    public VariableVisitor(SystemEnv systemEnv) {
        this.systemEnv = systemEnv;
    }

    @Override
    public SystemEnv visitVariableExpression(SenizParser.VariableExpressionContext ctx) {
        // TODO Uniqueness check
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.primitiveType().getText();
        StateVariable stateVariable = new StateVariable(name, TypeMapper.map(type), null);
        systemEnv.addVariable(stateVariable);
        return systemEnv;
    }

}
