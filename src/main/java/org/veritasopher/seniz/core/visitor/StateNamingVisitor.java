package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.StateDeclarator;
import org.veritasopher.seniz.exception.Assert;
import org.veritasopher.seniz.exception.type.StateException;

import java.util.Optional;

import static org.veritasopher.seniz.core.tool.Naming.*;

/**
 * State Naming Visitor
 *
 * @author Yepeng Ding
 * @date 3/5/2022
 */
public class StateNamingVisitor extends SenizParserBaseVisitor<Void> {

    private final TransitionSystem transitionSystem;

    private final StateDeclaratorVisitor stateDeclaratorVisitor;

    public StateNamingVisitor(TransitionSystem transitionSystem) {
        this.transitionSystem = transitionSystem;
        this.stateDeclaratorVisitor = new StateDeclaratorVisitor(transitionSystem, false);
    }

    /**
     * Explicit Naming Visitor
     * <p>
     * Named state declarators
     */
    public class ExplicitNamingVisitor extends SenizParserBaseVisitor<Void> {

        /**
         * Visit state declarator with explicit naming declarations
         *
         * @param ctx StateNamingContext
         */
        @Override
        public Void visitStateNaming(SenizParser.StateNamingContext ctx) {
            String name = ctx.stateNameIdentifier().IDENTIFIER().getText();

            // Check naming rule
            Assert.isTrue(satisfyStateDeclaratorNamingRule(name),
                    new StateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Invalid state declarator name (" + name + ")."));

            // Check uniqueness
            Assert.isTrue(!transitionSystem.hasStateDeclarator(name),
                    new StateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot use occupied state name (" + name + ")."));

            StateDeclarator stateDeclarator = ctx.stateBody().stateDeclarator().accept(stateDeclaratorVisitor);
            stateDeclarator.setName(name);

            transitionSystem.addStateDeclarator(stateDeclarator);
            return super.visitStateNaming(ctx);
        }

    }

    /**
     * Implicit Naming Visitor
     * <p>
     * Unnamed state declarators
     */
    public class ImplicitNamingVisitor extends SenizParserBaseVisitor<Void> {

        /**
         * Visit state declarator without naming declarations
         *
         * @param ctx StateIdentifierContext
         * @return TransitionSystem
         */
        @Override
        public Void visitStateIdentifier(SenizParser.StateIdentifierContext ctx) {
            if (ctx.stateNameIdentifier() != null) {
                String name = ctx.stateNameIdentifier().IDENTIFIER().getText();
                Optional<StateDeclarator> s = transitionSystem.getStateDeclarator(name);
                if (s.isEmpty()) {
                    // Check naming of stuttering state declarators
                    if (!satisfyStateDeclaratorNamingRule(name)) {
                        throw new StateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Invalid stuttering state declarator name (" + name + ").");
                    }
                }
            } else if (ctx.stateBody() != null) {
                // Unnamed state declarator
                StateDeclarator stateDeclarator = ctx.stateBody().stateDeclarator().accept(stateDeclaratorVisitor);
                String name = getNameForAnonymousStateDeclarator(stateDeclarator);
                stateDeclarator.setName(name);
                transitionSystem.addStateDeclarator(stateDeclarator);
            } else {
                throw new StateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported state type.");
            }
            return super.visitStateIdentifier(ctx);
        }
    }


}
