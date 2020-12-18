package org.veritasopher.seniz.controller;

import com.google.common.io.Files;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.model.CompilationUnit;
import org.veritasopher.seniz.core.model.DependencyGraph;
import org.veritasopher.seniz.core.model.SourceFile;
import org.veritasopher.seniz.core.model.UnitDependency;
import org.veritasopher.seniz.core.tool.Parsing;
import org.veritasopher.seniz.core.visitor.PrecompileVisitor;
import org.veritasopher.seniz.exception.PrecompileException;

import java.io.FileInputStream;
import java.util.*;
import java.util.stream.Collectors;

import static org.veritasopher.seniz.util.ThrowingConsumer.throwingConsumerWrapper;

/**
 * Master Controller
 * Instruct compiling, generating
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class MasterController {

    // Map<Compile Unit Identifier, Parse Tree>
    private final Map<String, ParseTree> parseTrees;

    public MasterController() {
        this.parseTrees = new HashMap<>();
    }

    public void precompile(Set<String> sourceFilePaths) {
        List<SourceFile> sourceFiles = new ArrayList<>();
        sourceFilePaths.forEach(throwingConsumerWrapper(path -> sourceFiles.add(new SourceFile(path))));

        // Map<Identifier, Source File>
        Map<String, SourceFile> sourceFileMap = new HashMap<>();
        sourceFiles.forEach(src -> sourceFileMap.put(src.getIdentifier(), src));

        // Analyze all source files to unit dependencies
        sourceFiles.forEach(src -> src.setDependency(new PrecompileVisitor(src.getIdentifier(), sourceFileMap.keySet()).visit(src.getParseTree())));
        Set<UnitDependency> unitDependencies = sourceFiles.stream().map(SourceFile::getDependency).collect(Collectors.toSet());

        // Check legacy of the main system
        long mainCount = unitDependencies.stream().filter(UnitDependency::isMain).count();
        if (mainCount == 0) {
            throw new PrecompileException("Missing main system.");
        } else if (mainCount > 1) {
            throw new PrecompileException("Multiple main systems exist.");
        }

        // Sort units by topological sort algorithm
        DependencyGraph<String> graph = new DependencyGraph<>(sourceFileMap.keySet());
        unitDependencies.forEach(d -> d.getPredecessorId().forEach(pred -> graph.addEdge(pred, d.getIdentifier())));
        List<String> sortedIdentifier = graph.getTopologicalSortedStack();
        System.out.println(sortedIdentifier);

        CompileController compileController = new CompileController();
        for (String id :
                sortedIdentifier) {
            CompilationUnit compilationUnit = compileController.compile(sourceFileMap.get(id).getParseTree());
        }
    }


}
