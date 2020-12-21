package org.veritasopher.seniz.controller;

import org.veritasopher.seniz.core.model.*;
import org.veritasopher.seniz.core.visitor.PrecompileVisitor;
import org.veritasopher.seniz.exception.CompilationException;
import org.veritasopher.seniz.exception.PrecompileException;

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

    public GlobalEnvironment compile(Set<String> sourceFilePaths) {
        GlobalEnvironment env = new GlobalEnvironment();

        Set<PrecompileUnit> precompileUnits = precompile(sourceFilePaths);

        // Sort units by topological sort algorithm
        DependencyGraph<String> graph = new DependencyGraph<>(sourceFileMap.keySet());
        precompileUnits.forEach(d -> d.getPredIdSet().forEach(pred -> graph.addEdge(pred, d.getIdentifier())));
        List<String> sortedIdentifier = graph.getTopologicalSortedStack();
        CompileController compileController = new CompileController(env, sourceFileMap);

        CompilationUnit compilationUnit;
        PrecompileUnit precompileUnit;
        TransitionSystem mainTS = null;
        for (String id :
                sortedIdentifier) {
            compilationUnit = compileController.compile(sourceFileMap.get(id).getParseTree());
            precompileUnit = sourceFileMap.get(id).getPrecompileUnit();
            if (precompileUnit.isMain()) {
                mainTS = compilationUnit.getTransitionSystem();
                break;
            }
        }
        if (mainTS == null) {
            throw new CompilationException("", "Main transition system does not exist.");
        }

        env.setMainTS(mainTS);

        return env;
    }

    private Set<PrecompileUnit> precompile(Set<String> sourceFilePaths) {
        List<SourceFile> sourceFiles = new ArrayList<>();
        sourceFilePaths.forEach(throwingConsumerWrapper(path -> sourceFiles.add(new SourceFile(path))));

        sourceFiles.forEach(src -> sourceFileMap.put(src.getIdentifier(), src));

        // Analyze all source files to unit dependencies
        sourceFiles.forEach(src -> src.setPrecompileUnit(new PrecompileVisitor(src.getIdentifier(), sourceFileMap.keySet()).visit(src.getParseTree())));
        Set<PrecompileUnit> precompileUnits = sourceFiles.stream().map(SourceFile::getPrecompileUnit).collect(Collectors.toSet());

        // Check legacy of the main system
        long mainCount = precompileUnits.stream().filter(PrecompileUnit::isMain).count();
        if (mainCount == 0) {
            throw new PrecompileException("", "Missing main system.");
        } else if (mainCount > 1) {
            throw new PrecompileException("", "Multiple main systems exist.");
        }

        return precompileUnits;
    }


}
