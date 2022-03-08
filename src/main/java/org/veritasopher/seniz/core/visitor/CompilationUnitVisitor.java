package org.veritasopher.seniz.core.visitor;

import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.CompilationUnit;
import org.veritasopher.seniz.core.model.VariableSet;
import org.veritasopher.seniz.core.model.SystemArgumentSet;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.SystemArgument;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.exception.type.CompilationException;
import org.veritasopher.seniz.exception.type.FormalParameterException;

import java.util.stream.Collectors;

/**
 * Compilation Unit Visitor
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class CompilationUnitVisitor extends SenizParserBaseVisitor<CompilationUnit> {

    private final CompilationUnit compilationUnit;

    public CompilationUnitVisitor(CompilationUnit compilationUnit) {
        this.compilationUnit = compilationUnit;
    }

    @Override
    public CompilationUnit visitSystemDeclaration(SenizParser.SystemDeclarationContext ctx) {
        String identifier = ctx.systemHeader().systemIdentifier().IDENTIFIER().getText();
        compilationUnit.setIdentifier(identifier);

        // Create new transition system
        TransitionSystem ts = new TransitionSystem(identifier, ctx.systemHeader().systemModifiers().controlModifier() != null);
        compilationUnit.setTransitionSystem(ts);

        // Create new system variable set
        SystemArgumentSet systemVariableSet = ts.getSystemArguments();
        FormalParameterVisitor formalParameterVisitor = new FormalParameterVisitor(systemVariableSet);
        SenizParser.FormalParameterListContext formalParameterListContext = ctx.systemHeader().formalParameterList();
        if (formalParameterListContext != null) {
            formalParameterListContext.formalParameter().forEach(p -> systemVariableSet.addVariable(p.accept(formalParameterVisitor)));
        }
        return super.visitSystemDeclaration(ctx);
    }

    @Override
    public CompilationUnit visitSystemParameter(SenizParser.SystemParameterContext ctx) {
        if (ctx.varSetIdentifer() != null) {
            // Set
            compilationUnit.setVariableSetIdentifier(ctx.varSetIdentifer().IDENTIFIER().getText());
        }
        return super.visitSystemParameter(ctx);
    }

    @Override
    public CompilationUnit visitVarSetDeclaration(SenizParser.VarSetDeclarationContext ctx) {
        String identifier = ctx.varSetHeader().varSetIdentifer().IDENTIFIER().getText();

        // If a source file only contains a state variable set, then set compilation unit identifier as variable set identifier
        // This can be ensured by the visiting order (system declaration goes first)
        if (compilationUnit.getIdentifier() == null) {
            compilationUnit.setIdentifier(identifier);
        }

        VariableSet variableSet;

        // Check name uniqueness wrt system variable set
        SystemArgumentSet systemVariableSet;
        if (compilationUnit.getTransitionSystem() != null) {
            systemVariableSet = compilationUnit.getTransitionSystem().getSystemArguments();
        } else {
            systemVariableSet = new SystemArgumentSet();
        }

        VariableDeclaratorVisitor stateVariableDeclaratorVisitor = new VariableDeclaratorVisitor(systemVariableSet);
        variableSet = ctx.varSetBody().varSetDeclarator().accept(stateVariableDeclaratorVisitor);

        variableSet.setIdentifier(identifier);

        compilationUnit.setStateVariableSet(variableSet);

        return super.visitVarSetDeclaration(ctx);
    }

    private static class FormalParameterVisitor extends SenizParserBaseVisitor<SystemArgument> {

        private final SystemArgumentSet systemArgumentSet;

        private FormalParameterVisitor(SystemArgumentSet systemArgumentSet) {
            this.systemArgumentSet = systemArgumentSet;
        }

        /**
         * Visit system arguments
         *
         * @param ctx FormalParameterContext
         * @return system argument
         */
        @Override
        public SystemArgument visitFormalParameter(SenizParser.FormalParameterContext ctx) {

            String name = ctx.variableIdentifier().IDENTIFIER().stream().map(ParseTree::getText).collect(Collectors.joining("."));
            // Check the name uniqueness
            if (systemArgumentSet.hasArgument(name)) {
                throw new FormalParameterException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot use occupied system argument name (" + name + ").");
            }

            // Get type by type name
            PrimaryType primaryType = PrimaryType.getType(ctx.primitiveType().getText());
            if (primaryType == PrimaryType.NULL) {
                throw new CompilationException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported system argument type.");
            }

            return new SystemArgument(name, primaryType, null);
        }

    }

}
