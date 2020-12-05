package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.mapper.TypeMapper;
import org.veritasopher.seniz.core.model.domain.StateVariable;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.exception.VariableException;

/**
 * Variable Visitor
 *
 * @author Yepeng Ding
 * @date 12/3/2020
 */
public class VariableVisitor extends SenizParserBaseVisitor<TransitionSystem> {

    private final TransitionSystem transitionSystem;

    public VariableVisitor(TransitionSystem transitionSystem) {
        this.transitionSystem = transitionSystem;
    }

    @Override
    public TransitionSystem visitVariableExpression(SenizParser.VariableExpressionContext ctx) {
        String name = ctx.IDENTIFIER().getText();

        // Check the name uniqueness
        if (transitionSystem.hasVariable(name)) {
            throw new VariableException(ctx.start.getLine(), "Cannot use occupied variable name (" + name + ").");
        }

        String type = ctx.primitiveType().getText();
        StateVariable stateVariable = new StateVariable(name, TypeMapper.map(type), null);
        transitionSystem.addVariable(stateVariable);
        return transitionSystem;
    }

}
