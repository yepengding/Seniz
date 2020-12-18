package org.veritasopher.seniz.controller;

import lombok.Getter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.builder.TransitionSystemBuilder;
import org.veritasopher.seniz.builder.VariableSetBuilder;
import org.veritasopher.seniz.core.model.*;
import org.veritasopher.seniz.core.tool.Parsing;
import org.veritasopher.seniz.core.visitor.CompilationUnitVisitor;
import org.veritasopher.seniz.exception.CompilationException;
import org.veritasopher.seniz.exception.PrecompileException;
import org.veritasopher.seniz.exception.StateVariableException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Compilation Controller
 * Compile all files to transition systems
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class CompileController {

    private final TransitionSystemBuilder transitionSystemBuilder;

    private final VariableSetBuilder variableSetBuilder;

    @Getter
    private final Set<TransitionSystem> transitionSystems;

    private Map<String, SourceFile> sourceFileMap;

    public CompileController() {
        this.transitionSystemBuilder = new TransitionSystemBuilder();
        this.variableSetBuilder = new VariableSetBuilder();
        this.transitionSystems = new HashSet<>();
    }

    public CompileController(Map<String, SourceFile> sourceFileMap) {
        this.sourceFileMap = sourceFileMap;
        this.transitionSystemBuilder = new TransitionSystemBuilder();
        this.variableSetBuilder = new VariableSetBuilder();
        this.transitionSystems = new HashSet<>();
    }

    public CompilationUnit compile(ParseTree parseTree) {
        CompilationUnit compilationUnit = new CompilationUnit();
        CompilationUnitVisitor compilationUnitVisitor = new CompilationUnitVisitor(compilationUnit);
        compilationUnitVisitor.visit(parseTree);

        PrecompileUnit precompileUnit = sourceFileMap.get(compilationUnit.getIdentifier()).getPrecompileUnit();

        // Check defined variable set
        String varSetName = compilationUnit.getSystemParameter();
        StateVariableSet stateVariableSet = compilationUnit.getStateVariableSet();
        // State variable set is defined in the system parameter
        if (varSetName != null) {
            if (stateVariableSet == null && !precompileUnit.getPredIdSet().contains(varSetName)) {
                throw new StateVariableException("Variable set (" + varSetName + ") is not defined");
            } else if (stateVariableSet != null && varSetName.equals(stateVariableSet.getIdentifier()) && precompileUnit.getPredIdSet().contains(varSetName)) {
                throw new CompilationException("Find both imported state variable set and internal state variable set");
            }
        }

        return compilationUnit;
    }

    public void compile(Set<String> sourceFilePaths) {
        Set<CharStream> sourceCharStreams = sourceFilePaths.stream()
                .map(path -> {
                    try {
                        return CharStreams.fromStream(new FileInputStream(path));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return null;
                })
                .collect(Collectors.toSet());

        // TODO Currently support single file without dependencies
        for (CharStream source :
                sourceCharStreams) {
            compileSource(source);
        }

    }

    public TransitionSystem compile(String sourceFileContent) {
        CharStream source = CharStreams.fromString(sourceFileContent);
        return compileSource(source);
    }

    private TransitionSystem compileSource(CharStream source) {
        ParseTree tree = Parsing.getParseTreeFromSource(source);

        CompilationUnit compilationUnit = new CompilationUnit();
        CompilationUnitVisitor compilationUnitVisitor = new CompilationUnitVisitor(compilationUnit);
        compilationUnitVisitor.visit(tree);

        // Check defined variable set
        String varSetName = compilationUnit.getSystemParameter();
        StateVariableSet vars = compilationUnit.getStateVariableSet();

        if (varSetName != null) {
            if (vars == null || !varSetName.equals(vars.getIdentifier())) {
                throw new StateVariableException("Variable set (" + varSetName + ") is not defined");
            }
        }

        // Build complete variable set
        vars = variableSetBuilder.build(vars, tree);

        // Build transition system
        TransitionSystem ts = compilationUnit.getTransitionSystem();
        if (ts != null) {
            transitionSystems.add(transitionSystemBuilder.build(ts, vars, tree));
        }

        return ts;
    }

}
