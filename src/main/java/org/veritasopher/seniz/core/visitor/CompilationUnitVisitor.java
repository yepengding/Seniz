package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.CompilationUnit;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.VariableSet;

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
        TransitionSystem ts = new TransitionSystem(ctx.systemHeader().IDENTIFIER().getText());
        compilationUnit.setTransitionSystem(ts);
        return compilationUnit;
    }

    @Override
    public CompilationUnit visitSystemParameter(SenizParser.SystemParameterContext ctx) {
        compilationUnit.setSystemParameter(ctx.IDENTIFIER().getText());
        return compilationUnit;
    }

    @Override
    public CompilationUnit visitVariableDeclaration(SenizParser.VariableDeclarationContext ctx) {
        VariableSet variableSet;
        SenizParser.VariableDeclaratorContext declaratorContext = ctx.variableBody().variableDeclarator();
        if (declaratorContext != null) {
            VariableDeclaratorVisitor variableDeclaratorVisitor = new VariableDeclaratorVisitor();
            variableSet = declaratorContext.accept(variableDeclaratorVisitor);
        } else {
            variableSet = new VariableSet();
        }

        variableSet.setIdentifier(ctx.variableHeader().IDENTIFIER().getText());

        compilationUnit.setVariableSet(variableSet);

        return compilationUnit;
    }
}
