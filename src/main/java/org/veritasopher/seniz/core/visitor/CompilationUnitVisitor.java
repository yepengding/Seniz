package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.CompilationUnit;
import org.veritasopher.seniz.core.model.StateVariableSet;
import org.veritasopher.seniz.core.model.SystemVariableSet;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.SystemVariable;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.exception.FormalParameterException;
import org.veritasopher.seniz.exception.StateVariableException;

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
        TransitionSystem ts = new TransitionSystem(identifier);
        compilationUnit.setTransitionSystem(ts);

        // Create new system variable set
        SystemVariableSet systemVariableSet = ts.getSystemVariables();
        FormalParameterVisitor formalParameterVisitor = new FormalParameterVisitor(systemVariableSet);
        SenizParser.FormalParameterListContext formalParameterListContext = ctx.systemHeader().formalParameterList();
        if (formalParameterListContext != null) {
            formalParameterListContext.formalParameter().forEach(p -> systemVariableSet.addVariable(p.accept(formalParameterVisitor)));
        }
        return super.visitSystemDeclaration(ctx);
    }

    @Override
    public CompilationUnit visitSystemParameter(SenizParser.SystemParameterContext ctx) {
        compilationUnit.setSystemParameter(ctx.stateVarSetIdentifer().IDENTIFIER().getText());
        return super.visitSystemParameter(ctx);
    }

    @Override
    public CompilationUnit visitStateVarSetDeclaration(SenizParser.StateVarSetDeclarationContext ctx) {
        String identifier = ctx.stateVarSetHeader().stateVarSetIdentifer().IDENTIFIER().getText();

        // If state variable set only exists in the source file, then set identifier
        if (compilationUnit.getIdentifier() == null) {
            compilationUnit.setIdentifier(identifier);
        }

        StateVariableSet stateVariableSet;

        // Pass system variable set for checking name uniqueness
        SystemVariableSet systemVariableSet;
        if (compilationUnit.getTransitionSystem() != null) {
            systemVariableSet = compilationUnit.getTransitionSystem().getSystemVariables();
        } else {
            systemVariableSet = new SystemVariableSet();
        }

        StateVariableDeclaratorVisitor stateVariableDeclaratorVisitor = new StateVariableDeclaratorVisitor(systemVariableSet);
        stateVariableSet = ctx.stateVarSetBody().stateVarSetDeclarator().accept(stateVariableDeclaratorVisitor);

        stateVariableSet.setIdentifier(identifier);

        compilationUnit.setStateVariableSet(stateVariableSet);

        return super.visitStateVarSetDeclaration(ctx);
    }

    private static class FormalParameterVisitor extends SenizParserBaseVisitor<SystemVariable> {

        private final SystemVariableSet systemVariableSet;

        private FormalParameterVisitor(SystemVariableSet systemVariableSet) {
            this.systemVariableSet = systemVariableSet;
        }

        @Override
        public SystemVariable visitFormalParameter(SenizParser.FormalParameterContext ctx) {

            String name = ctx.variableIdentifier().IDENTIFIER().getText();
            // Check the name uniqueness
            if (systemVariableSet.hasVariable(name)) {
                throw new FormalParameterException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot use occupied system variable name (" + name + ").");
            }

            // Get type by type name
            PrimaryType primaryType = PrimaryType.getType(ctx.primitiveType().getText());
            if (primaryType == PrimaryType.NULL) {
                throw new StateVariableException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported variable type.");
            }

            return new SystemVariable(name, primaryType, null);
        }

    }

}
