package org.veritasopher.seniz.controller;

import org.veritasopher.seniz.core.model.*;
import org.veritasopher.seniz.core.visitor.PrecompileVisitor;
import org.veritasopher.seniz.exception.Assert;
import org.veritasopher.seniz.exception.type.CompilationException;
import org.veritasopher.seniz.exception.type.PrecompileException;

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

    // Map<Identifier, Source File>
    private final Map<String, SourceFile> sourceFileMap;

    public MasterController() {
        this.sourceFileMap = new HashMap<>();
    }

    /**
     * Compile all source files from paths
     *
     * @param sourceFilePaths set of source file paths
     * @return compiled global environment
     */
    public GlobalEnvironment compile(Set<String> sourceFilePaths) {
        List<SourceFile> sourceFiles = new ArrayList<>();
        sourceFilePaths.forEach(throwingConsumerWrapper(path -> sourceFiles.add(new SourceFile(path))));

        return compileSourceFiles(sourceFiles);
    }

    /**
     * Compile all source files
     *
     * @param sourceFiles list of source files
     * @return compiled global environment
     */
    public GlobalEnvironment compile(List<SourceFile> sourceFiles) {
        return compileSourceFiles(sourceFiles);
    }

    /**
     * Compile source files
     *
     * @param sourceFiles list of source files
     * @return compiled global environment
     */
    private GlobalEnvironment compileSourceFiles(List<SourceFile> sourceFiles) {
        GlobalEnvironment env = new GlobalEnvironment();

        Set<PrecompileUnit> precompileUnits = precompile(sourceFiles);

        // Sort units by topological sort algorithm
        DependencyGraph<String> graph = new DependencyGraph<>(sourceFileMap.keySet());
        precompileUnits.forEach(d -> d.getPredIdSet().forEach(pred -> graph.addEdge(pred, d.getIdentifier())));
        List<String> sortedIdentifier = graph.getTopologicalSortedStack();
        CompileController compileController = new CompileController(env, sourceFileMap);

        CompilationUnit compilationUnit;
        PrecompileUnit precompileUnit;
        String mainSystemIdentifier = null;
        for (String id :
                sortedIdentifier) {
            compilationUnit = compileController.compile(sourceFileMap.get(id).getParseTree());
            precompileUnit = sourceFileMap.get(id).getPrecompileUnit();
            if (precompileUnit.isMain()) {
                mainSystemIdentifier = compilationUnit.getIdentifier();
                break;
            }
        }

        Assert.notNull(mainSystemIdentifier,
                new CompilationException("Main transition system does not exist."));

        env.setMainSystemIdentifier(mainSystemIdentifier);

        return env;
    }


    /**
     * Precompile source files
     *
     * @param sourceFiles set of source files
     * @return set of precompile units
     */
    private Set<PrecompileUnit> precompile(List<SourceFile> sourceFiles) {

        sourceFiles.forEach(src -> sourceFileMap.put(src.getIdentifier(), src));

        // Analyze all source files to unit dependencies
        sourceFiles.forEach(src -> src.setPrecompileUnit(new PrecompileVisitor(src.getIdentifier(), sourceFileMap.keySet()).visit(src.getParseTree())));
        Set<PrecompileUnit> precompileUnits = sourceFiles.stream().map(SourceFile::getPrecompileUnit).collect(Collectors.toSet());

        // Check legacy of the main system
        long mainCount = precompileUnits.stream().filter(PrecompileUnit::isMain).count();
        if (mainCount == 0) {
            throw new PrecompileException("Missing main system.");
        } else if (mainCount > 1) {
            throw new PrecompileException("Multiple main systems exist.");
        }

        return precompileUnits;
    }


}
