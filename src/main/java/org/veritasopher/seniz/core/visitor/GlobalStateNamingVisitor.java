package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.StateDeclarator;
import org.veritasopher.seniz.exception.Assert;
import org.veritasopher.seniz.exception.type.GlobalStateException;

import static org.veritasopher.seniz.core.tool.Naming.getNameForAnonymousStateDeclarator;
import static org.veritasopher.seniz.core.tool.Naming.satisfyStateDeclaratorNamingRule;

/**
 * Global State Naming Visitor
 *
 * @author Yepeng Ding
 * @date 3/13/2022
 */
public class GlobalStateNamingVisitor extends SenizParserBaseVisitor<Void> {

    private final TransitionSystem transitionSystem;

    private final StateDeclaratorVisitor stateDeclaratorVisitor;

    public GlobalStateNamingVisitor(TransitionSystem transitionSystem) {
        this.transitionSystem = transitionSystem;
        this.stateDeclaratorVisitor = new StateDeclaratorVisitor(transitionSystem, true);
    }

    /**
     * Explicit Naming Visitor
     * <p>
     * Named state declarators
     */
    public class ExplicitNamingVisitor extends SenizParserBaseVisitor<Void> {

        /**
         * Visit global state declarator with explicit naming declarations
         *
         * @param ctx GlobalStateNamingContext
         * @return Void
         */
        @Override
        public Void visitGlobalStateNaming(SenizParser.GlobalStateNamingContext ctx) {
            String name = ctx.globalStateNameIdentifier().IDENTIFIER().getText();
            // Check naming rule (same with the state declarator naming)
            Assert.isTrue(satisfyStateDeclaratorNamingRule(name),
                    new GlobalStateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Invalid global state declarator name (" + name + ")."));

            // Check uniqueness
            Assert.isTrue(transitionSystem.getGlobalStateDeclarator(name).isEmpty(),
                    new GlobalStateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot use occupied global state declarator name (" + name + ")."));

            StateDeclarator stateDeclarator = ctx.globalStateBody().stateDeclarator().accept(stateDeclaratorVisitor);
            stateDeclarator.setName(name);

            transitionSystem.addGlobalStateDeclarator(stateDeclarator);

            return super.visitGlobalStateNaming(ctx);
        }

    }

    /**
     * Implicit Naming Visitor
     * <p>
     * Unnamed state declarators
     */
    public class ImplicitNamingVisitor extends SenizParserBaseVisitor<Void> {

        /**
         * Visit global state declarator without naming declarations
         *
         * @param ctx StateIdentifierContext
         * @return TransitionSystem
         */
        @Override
        public Void visitGlobalStateIdentifier(SenizParser.GlobalStateIdentifierContext ctx) {
            if (ctx.globalStateNameIdentifier() != null) {
                String name = ctx.globalStateNameIdentifier().IDENTIFIER().getText();
                Assert.isTrue(transitionSystem.getGlobalStateDeclarator(name).isPresent(),
                        new GlobalStateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Undefined global state declarator name (" + name + ")."));
            } else if (ctx.globalStateBody() != null) {
                // Unnamed state declarator
                StateDeclarator stateDeclarator = ctx.globalStateBody().stateDeclarator().accept(stateDeclaratorVisitor);
                String name = getNameForAnonymousStateDeclarator(stateDeclarator);
                stateDeclarator.setName(name);
                transitionSystem.addGlobalStateDeclarator(stateDeclarator);
            } else {
                throw new GlobalStateException(transitionSystem.getIdentifier(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported global state type.");
            }
            return super.visitGlobalStateIdentifier(ctx);
        }
    }

}
