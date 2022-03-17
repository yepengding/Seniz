package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.StateDeclarator;
import org.veritasopher.seniz.exception.type.GlobalStateException;

/**
 * Global State Identifier Visitor
 *
 * @author Yepeng Ding
 * @date 3/13/2022
 */
public class GlobalStateIdentifierVisitor extends SenizParserBaseVisitor<StateDeclarator> {

    private final TransitionSystem transitionSystem;


    GlobalStateIdentifierVisitor(TransitionSystem transitionSystem) {
        this.transitionSystem = transitionSystem;
    }

    @Override
    public StateDeclarator visitGlobalStateIdentifier(SenizParser.GlobalStateIdentifierContext ctx) {
        StateDeclarator stateDeclarator;
        if (ctx.globalStateNameIdentifier() != null) {
            // Named global state declarator
            String name = ctx.globalStateNameIdentifier().IDENTIFIER().getText();
            stateDeclarator = transitionSystem.getGlobalStateDeclarator(name).orElseThrow(() -> {
                throw new GlobalStateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Undefined named global state declarator");
            });
        } else if (ctx.globalStateBody() != null) {
            // Unnamed state declarator
            int id = ctx.globalStateBody().stateDeclarator().hashCode();
            stateDeclarator = transitionSystem.getGlobalStateDeclarator(id).orElseThrow(() -> {
                throw new GlobalStateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Undefined global state declarator.");
            });
        } else {
            throw new GlobalStateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported global state declarator type.");
        }
        return stateDeclarator;
    }

}
