package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.PrecompileUnit;
import org.veritasopher.seniz.exception.PrecompileException;

import java.util.Set;

/**
 * Precompile Visitor
 *
 * @author Yepeng Ding
 * @date 12/18/2020
 */
public class PrecompileVisitor extends SenizParserBaseVisitor<PrecompileUnit> {

    private final String identifier;

    private final Set<String> idSet;

    private final PrecompileUnit precompileUnit;

    public PrecompileVisitor(String identifier, Set<String> idSet) {
        this.identifier = identifier;
        this.idSet = idSet;
        this.precompileUnit = new PrecompileUnit();
    }

    @Override
    public PrecompileUnit visitCompilationUnit(SenizParser.CompilationUnitContext ctx) {
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
            ctx.importDeclaration().forEach(pred -> precompileUnit.addPredecessorId(pred.qualifiedName().getText()));
        }
        if (ctx.systemDeclaration() != null) {
            precompileUnit.setSystem(true);
            this.visitSystemHeader(ctx.systemDeclaration().systemHeader());
        } else if (ctx.stateVarSetDeclaration() != null) {
            precompileUnit.setSystem(false);
            this.visitStateVarSetHeader(ctx.stateVarSetDeclaration().stateVarSetHeader());
        }

        return precompileUnit;
    }

    @Override
    public PrecompileUnit visitSystemHeader(SenizParser.SystemHeaderContext ctx) {

        String id = ctx.systemIdentifier().IDENTIFIER().getText();
        // Identifier must be the same with the file name
        if (!identifier.equals(id)) {
            throw new PrecompileException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "System identifier (" + id + ") is different from file name.");
        }

        // Set identifier
        precompileUnit.setIdentifier(id);

        // Set whether is main system
        precompileUnit.setMain(ctx.systemModifier() != null);

        return super.visitSystemHeader(ctx);
    }

    @Override
    public PrecompileUnit visitStateVarSetHeader(SenizParser.StateVarSetHeaderContext ctx) {
        String id = ctx.stateVarSetIdentifer().IDENTIFIER().getText();
        // Identifier must be the same with the file name
        if (!identifier.equals(id)) {
            throw new PrecompileException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "State variable set identifier (" + id + ") is different from file name.");
        }
        precompileUnit.setIdentifier(id);
        return super.visitStateVarSetHeader(ctx);
    }
}
