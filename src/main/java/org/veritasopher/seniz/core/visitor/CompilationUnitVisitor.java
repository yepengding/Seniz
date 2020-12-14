package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.CompilationUnit;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.StateVariableSet;

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
    public CompilationUnit visitCompilationUnit(SenizParser.CompilationUnitContext ctx) {
        // TODO Dependency info (import)

        return super.visitCompilationUnit(ctx);
    }

    @Override
    public CompilationUnit visitSystemDeclaration(SenizParser.SystemDeclarationContext ctx) {
        TransitionSystem ts = new TransitionSystem(ctx.systemHeader().systemIdentifier(). IDENTIFIER().getText());
        compilationUnit.setTransitionSystem(ts);
        return compilationUnit;
    }

    @Override
    public CompilationUnit visitSystemParameter(SenizParser.SystemParameterContext ctx) {
        compilationUnit.setSystemParameter(ctx.stateVarSetIdentifer(). IDENTIFIER().getText());
        return compilationUnit;
    }

    @Override
    public CompilationUnit visitStateVarSetDeclaration(SenizParser.StateVarSetDeclarationContext ctx) {
        StateVariableSet stateVariableSet;
        SenizParser.StateVarSetDeclaratorContext declaratorContext = ctx.stateVarSetBody().stateVarSetDeclarator();
        if (declaratorContext != null) {
            StateVariableDeclaratorVisitor stateVariableDeclaratorVisitor = new StateVariableDeclaratorVisitor();
            stateVariableSet = declaratorContext.accept(stateVariableDeclaratorVisitor);
        } else {
            stateVariableSet = new StateVariableSet();
        }

        stateVariableSet.setIdentifier(ctx.stateVarSetHeader().stateVarSetIdentifer().IDENTIFIER().getText());

        compilationUnit.setStateVariableSet(stateVariableSet);

        return compilationUnit;
    }
}
