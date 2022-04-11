package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.ControlSystem;
import org.veritasopher.seniz.core.model.VariableSet;
import org.veritasopher.seniz.core.model.common.StateVariable;

import java.util.Set;
import java.util.stream.Collectors;

public class ControlInitStateVisitor extends SenizParserBaseVisitor<Void> {

    private final ControlSystem controlSystem;

    private final StateDeclaratorVisitor.StateExpressionVisitor stateExpressionVisitor;

    public ControlInitStateVisitor(ControlSystem controlSystem, boolean isGlobal) {
        this.controlSystem = controlSystem;
        this.stateExpressionVisitor = new StateDeclaratorVisitor.StateExpressionVisitor(controlSystem, isGlobal);
    }

    @Override
    public Void visitStateBody(SenizParser.StateBodyContext ctx) {
        // Update explicitly initialized state variables
        ctx.stateDeclarator().stateExpression().stream()
                .map(expr -> expr.accept(stateExpressionVisitor))
                .forEach(controlSystem::updateStateVariable);
        return super.visitStateBody(ctx);
    }

}
