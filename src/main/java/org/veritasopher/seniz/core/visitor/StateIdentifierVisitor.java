package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.State;
import org.veritasopher.seniz.exception.StateException;

import java.util.Optional;

/**
 * State Identifier Visitor
 *
 * @author Yepeng Ding
 * @date 12/15/2020
 */
public class StateIdentifierVisitor extends SenizParserBaseVisitor<State> {

    private final TransitionSystem transitionSystem;

    private final StateDeclaratorVisitor stateDeclaratorVisitor;

    StateIdentifierVisitor(TransitionSystem transitionSystem) {
        this.transitionSystem = transitionSystem;
        this.stateDeclaratorVisitor = new StateDeclaratorVisitor(transitionSystem);
    }

    @Override
    public State visitStateIdentifier(SenizParser.StateIdentifierContext ctx) {
        State state;

        if (ctx.stateNameIdentifier() != null) {
            // Named state
            String name = ctx.stateNameIdentifier().IDENTIFIER().getText();
            Optional<State> s = transitionSystem.getStateName(name);

            // Check whether state associated with identifier exists
            if (s.isEmpty()) {
                throw new StateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "State named (" + name + ") does not exist.");
            }
            state = s.get();

        } else if (ctx.stateBody() != null) {
            // Unnamed state
            state = ctx.stateBody().stateDeclarator().accept(stateDeclaratorVisitor);
        } else {
            throw new StateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported state type.");
        }

        return state;
    }

}
