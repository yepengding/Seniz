package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.StateDeclarator;
import org.veritasopher.seniz.exception.type.StateException;

import java.util.Optional;

/**
 * State Identifier Visitor
 *
 * @author Yepeng Ding
 * @date 3/5/2022
 */
public class StateIdentifierVisitor extends SenizParserBaseVisitor<Optional<StateDeclarator>> {

    private final TransitionSystem transitionSystem;


    StateIdentifierVisitor(TransitionSystem transitionSystem) {
        this.transitionSystem = transitionSystem;
    }

    @Override
    public Optional<StateDeclarator> visitStateIdentifier(SenizParser.StateIdentifierContext ctx) {
        Optional<StateDeclarator> stateDeclarator;
        if (ctx.stateNameIdentifier() != null) {
            // Named state declarator (including stuttering state declarator)
            String name = ctx.stateNameIdentifier().IDENTIFIER().getText();
            stateDeclarator = transitionSystem.getStateDeclarator(name);
        } else if (ctx.stateBody() != null) {
            // Unnamed state declarator
            int id = ctx.stateBody().stateDeclarator().hashCode();
            stateDeclarator = transitionSystem.getStateDeclarator(id);
            if (stateDeclarator.isEmpty()) {
                // If not exist, then throw exception
                throw new StateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Undefined state declarator.");
            }
        } else {
            throw new StateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported state declarator type.");
        }
        return stateDeclarator;
    }

}
