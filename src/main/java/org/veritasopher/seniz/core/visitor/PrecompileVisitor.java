package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.UnitDependency;
import org.veritasopher.seniz.exception.PrecompileException;

import java.util.Set;

/**
 * Precompile Visitor
 *
 * @author Yepeng Ding
 * @date 12/18/2020
 */
public class PrecompileVisitor extends SenizParserBaseVisitor<UnitDependency> {

    private final String identifier;

    private final Set<String> idSet;

    private final UnitDependency unitDependency;

    public PrecompileVisitor(String identifier, Set<String> idSet) {
        this.identifier = identifier;
        this.idSet = idSet;
        this.unitDependency = new UnitDependency();
    }

    @Override
    public UnitDependency visitCompilationUnit(SenizParser.CompilationUnitContext ctx) {
        // Set predecessors
        if (ctx.importDeclaration() != null) {
            // TODO Handle qualified names (different folders)
            String name;
            for (SenizParser.ImportDeclarationContext context :
                    ctx.importDeclaration()) {
                name = context.qualifiedName().getText();
                if (!idSet.contains(name)) {
                    // Module does not exist in source files
                    throw new PrecompileException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Module (" + name + ") is missing.");
                } else if (identifier.equals(name)) {
                    // Self importing
                    throw new PrecompileException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Cannot import self (" + name + ").");
                }
            }
            ctx.importDeclaration().forEach(pred -> unitDependency.addPredecessorId(pred.qualifiedName().getText()));
        }
        if (ctx.systemDeclaration() != null) {
            unitDependency.setSystem(true);
            this.visitSystemHeader(ctx.systemDeclaration().systemHeader());
        } else if (ctx.stateVarSetDeclaration() != null) {
            unitDependency.setSystem(false);
            this.visitStateVarSetHeader(ctx.stateVarSetDeclaration().stateVarSetHeader());
        }

        return unitDependency;
    }

    @Override
    public UnitDependency visitSystemHeader(SenizParser.SystemHeaderContext ctx) {

        String id = ctx.systemIdentifier().IDENTIFIER().getText();
        // Identifier must be the same with the file name
        if (!identifier.equals(id)) {
            throw new PrecompileException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "System identifier (" + id + ") is different from file name.");
        }

        // Set identifier
        unitDependency.setIdentifier(id);

        // Set whether is main system
        unitDependency.setMain(ctx.systemModifier() != null);

        return super.visitSystemHeader(ctx);
    }

    @Override
    public UnitDependency visitStateVarSetHeader(SenizParser.StateVarSetHeaderContext ctx) {
        String id = ctx.stateVarSetIdentifer().IDENTIFIER().getText();
        // Identifier must be the same with the file name
        if (!identifier.equals(id)) {
            throw new PrecompileException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "State variable set identifier (" + id + ") is different from file name.");
        }
        unitDependency.setIdentifier(id);
        return super.visitStateVarSetHeader(ctx);
    }
}
