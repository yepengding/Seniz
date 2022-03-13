package org.veritasopher.seniz.core.visitor;

import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.CompilationUnit;
import org.veritasopher.seniz.core.model.ControlSystem;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.VariableSet;
import org.veritasopher.seniz.core.model.common.Evaluation;
import org.veritasopher.seniz.core.model.common.SystemArgument;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.exception.Assert;
import org.veritasopher.seniz.exception.type.CompilationException;
import org.veritasopher.seniz.exception.type.FormalParameterException;
import org.veritasopher.seniz.exception.type.TypeException;

import java.util.HashSet;
import java.util.Set;
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

    /**
     * Instantiate a system with system arguments
     *
     * @param ctx SystemDeclarationContext
     * @return Compilation Unit
     */
    @Override
    public CompilationUnit visitSystemDeclaration(SenizParser.SystemDeclarationContext ctx) {
        SenizParser.SystemHeaderContext headerContext = ctx.systemHeader();
        String identifier = headerContext.systemIdentifier().IDENTIFIER().getText();
        compilationUnit.setIdentifier(identifier);

        // Set dependent and global variable set name
        String dependentVariableSetName = null, globalVariableSetName = null;

        if (headerContext.systemParameter() != null) {
            dependentVariableSetName = headerContext.systemParameter().varSetIdentifier(0).IDENTIFIER().getText();
            if (headerContext.systemParameter().WITH() != null) {
                globalVariableSetName = headerContext.systemParameter().varSetIdentifier(1).IDENTIFIER().getText();
            }
        }

        if (headerContext.systemModifiers().controlModifier() == null) {
            // Transition system
            TransitionSystem ts = new TransitionSystem(identifier);
            compilationUnit.setTransitionSystem(ts);

            // Create new system argument set
            FormalParameterVisitor formalParameterVisitor = new FormalParameterVisitor(ts);
            SenizParser.FormalParameterListContext formalParameterListContext = ctx.systemHeader().formalParameterList();
            if (formalParameterListContext != null) {
                formalParameterListContext.formalParameter().forEach(p -> ts.addSystemArgument(p.accept(formalParameterVisitor)));
            }

            // Set dependent and global variable set name
            ts.setDependentVariableSetName(dependentVariableSetName);
            ts.setGlobalVariableSetName(globalVariableSetName);
        } else {
            // Control system
            ControlSystem cs = new ControlSystem(identifier);
            compilationUnit.setControlSystem(cs);

            // Create new system argument set
            FormalParameterVisitor formalParameterVisitor = new FormalParameterVisitor(cs);
            SenizParser.FormalParameterListContext formalParameterListContext = ctx.systemHeader().formalParameterList();
            if (formalParameterListContext != null) {
                formalParameterListContext.formalParameter().forEach(p -> cs.addSystemArgument(p.accept(formalParameterVisitor)));
            }

            // Set dependent and global variable set name
            cs.setDependentVariableSetName(dependentVariableSetName);
            cs.setGlobalVariableSetName(globalVariableSetName);
        }

        return super.visitSystemDeclaration(ctx);
    }

    /**
     * Visit variable set declaration
     *
     * @param ctx VarSetDeclarationContext
     * @return CompilationUnit
     */
    @Override
    public CompilationUnit visitVarSetDeclaration(SenizParser.VarSetDeclarationContext ctx) {
        String identifier = ctx.varSetHeader().varSetIdentifier().IDENTIFIER().getText();

        // If a source file only contains a state variable set, then set compilation unit identifier as variable set identifier
        // This can be ensured by the visiting order (system declaration goes first)
        if (compilationUnit.getIdentifier() == null) {
            compilationUnit.setIdentifier(identifier);
        }

        VariableSet variableSet;

        // Check name uniqueness wrt system variable set
        Set<String> systemVariableNameSet;
        if (compilationUnit.getTransitionSystem() != null) {
            systemVariableNameSet = compilationUnit.getTransitionSystem().getSystemArgumentNameSet();
        } else if (compilationUnit.getControlSystem() != null) {
            systemVariableNameSet = compilationUnit.getControlSystem().getSystemArgumentNameSet();
        } else {
            systemVariableNameSet = new HashSet<>();
        }

        VariableDeclaratorVisitor variableDeclaratorVisitor = new VariableDeclaratorVisitor(identifier, systemVariableNameSet);
        variableSet = ctx.varSetBody().varSetDeclarator().accept(variableDeclaratorVisitor);

        compilationUnit.setVariableSet(variableSet);

        return super.visitVarSetDeclaration(ctx);
    }

    private static class FormalParameterVisitor extends SenizParserBaseVisitor<SystemArgument> {

        private final TransitionSystem transitionSystem;
        private final ControlSystem controlSystem;

        private FormalParameterVisitor(TransitionSystem transitionSystem) {
            this.transitionSystem = transitionSystem;
            this.controlSystem = null;
            Assert.notNull(transitionSystem, new CompilationException("", "Uninstantiated transition system."));
        }

        private FormalParameterVisitor(ControlSystem controlSystem) {
            this.transitionSystem = null;
            this.controlSystem = controlSystem;
            Assert.notNull(controlSystem, new CompilationException("", "Uninstantiated control system."));
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
            String identifier = null;
            // Check the name uniqueness
            if (transitionSystem != null) {
                identifier = transitionSystem.getIdentifier();
                Assert.isTrue(!transitionSystem.hasSystemArgument(name),
                        new FormalParameterException(identifier, ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot use occupied system argument name (" + name + ")."));
            }

            if (controlSystem != null) {
                identifier = controlSystem.getIdentifier();
                Assert.isTrue(!controlSystem.hasSystemArgument(name),
                        new FormalParameterException(identifier, ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot use occupied system argument name (" + name + ")."));
            }

            // Get type by type name
            PrimaryType primaryType = PrimaryType.getType(ctx.primitiveType().getText());
            if (primaryType == PrimaryType.NULL) {
                Assert.notNull(identifier, new CompilationException("", "Undefined system type."));
                throw new TypeException(identifier, ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported system argument type.");
            }

            return new SystemArgument(name, primaryType, new Evaluation(primaryType));
        }
    }

}
