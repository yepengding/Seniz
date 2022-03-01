package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.State;
import org.veritasopher.seniz.exception.StateException;

/**
 * State Declaration Visitor
 *
 * @author Yepeng Ding
 * @date 12/3/2020
 */
public class StateNamingVisitor extends SenizParserBaseVisitor<TransitionSystem> {

    private final TransitionSystem transitionSystem;

    private final StateDeclaratorVisitor stateDeclaratorVisitor;

    public StateNamingVisitor(TransitionSystem transitionSystem) {
        this.transitionSystem = transitionSystem;
        this.stateDeclaratorVisitor = new StateDeclaratorVisitor(transitionSystem);
    }

    /**
     * Visit states with explicit declarations
     *
     * @param ctx StateNamingContext
     * @return TransitionSystem
     */
    @Override
    public TransitionSystem visitStateNaming(SenizParser.StateNamingContext ctx) {
        String name = ctx.stateNameIdentifier().IDENTIFIER().getText();

        State state = ctx.stateBody().stateDeclarator().accept(stateDeclaratorVisitor);

        // Check the uniqueness of state declaration
        if (transitionSystem.hasStateName(name)) {
            throw new StateException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot use occupied state name (" + name + ").");
        }

        transitionSystem.addStateName(name, state);
        return transitionSystem;
    }

}
