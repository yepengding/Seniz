package org.veritasopher.seniz.controller;

import lombok.Getter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.base.SenizLexer;
import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.model.CompilationUnit;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.VariableSet;
import org.veritasopher.seniz.core.visitor.CompilationUnitVisitor;
import org.veritasopher.seniz.exception.VariableException;
import org.veritasopher.seniz.builder.TransitionSystemBuilder;
import org.veritasopher.seniz.builder.VariableSetBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
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

    private final Set<String> sourceFilePaths;

    private final TransitionSystemBuilder transitionSystemBuilder;

    private final VariableSetBuilder variableSetBuilder;

    @Getter
    private final Set<TransitionSystem> transitionSystems;

    public CompileController(Set<String> sourceFilePaths) {
        this.sourceFilePaths = sourceFilePaths;
        this.transitionSystemBuilder = new TransitionSystemBuilder();
        this.variableSetBuilder = new VariableSetBuilder();
        this.transitionSystems = new HashSet<>();
    }

    public void compile() {
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
            SenizLexer lexer = new SenizLexer(source);
            SenizParser parser = new SenizParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.compilationUnit();

            CompilationUnit compilationUnit = new CompilationUnit();
            CompilationUnitVisitor compilationUnitVisitor = new CompilationUnitVisitor(compilationUnit);
            compilationUnitVisitor.visit(tree);

            // Check defined variable set
            String varSetName = compilationUnit.getSystemParameter();
            VariableSet vars = compilationUnit.getVariableSet();

            if (varSetName != null) {
                if (vars == null || !varSetName.equals(vars.getIdentifier())) {
                    throw new VariableException("Variable set (" + varSetName + ") is not defined");
                }
            }

            // Build complete variable set
            vars = variableSetBuilder.build(vars, tree);

            // Build transition system
            TransitionSystem ts = compilationUnit.getTransitionSystem();
            if (ts != null) {
                transitionSystems.add(transitionSystemBuilder.build(ts, vars, tree));
            }

        }

    }

}
