package org.veritasopher.seniz.controller;

import com.google.common.io.Files;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.model.DependencyGraph;
import org.veritasopher.seniz.core.model.StateVariableSet;
import org.veritasopher.seniz.core.model.UnitDependency;
import org.veritasopher.seniz.core.tool.Parsing;
import org.veritasopher.seniz.core.visitor.PrecompileVisitor;
import org.veritasopher.seniz.exception.PrecompileException;

import java.io.FileInputStream;
import java.util.*;

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

    // Map<Identifier, State Variable Set>
    private Map<String, StateVariableSet> stateVariableSets;

    public MasterController() {
        this.parseTrees = new HashMap<>();
    }

    public void precompile(Set<String> sourceFilePaths) {
        // Read source files as char streams
        // Map<Compile Unit Identifier, Source File Char Stream>
        Map<String, CharStream> sourceCharStreams = new HashMap<>();
        sourceFilePaths.forEach(throwingConsumerWrapper(path -> sourceCharStreams.put(Files.getNameWithoutExtension(path), CharStreams.fromStream(new FileInputStream(path)))));

        // Get parse tree from char streams
        sourceCharStreams.forEach((id, src) -> parseTrees.put(id, Parsing.getParseTreeFromSource(src)));

        // Analyze all source files to unit dependencies
        Set<UnitDependency> unitDependencies = new HashSet<>();
        parseTrees.forEach((id, tree) -> unitDependencies.add(new PrecompileVisitor(id, parseTrees.keySet()).visit(tree)));

        // Check legacy of the main system
        long mainCount = unitDependencies.stream().filter(UnitDependency::isMain).count();
        if (mainCount == 0) {
            throw new PrecompileException("Missing main system.");
        } else if (mainCount > 1) {
            throw new PrecompileException("Multiple main systems exist.");
        }

        // Sort units by topological sort algorithm
        DependencyGraph<String> graph = new DependencyGraph<>(parseTrees.keySet());
        unitDependencies.forEach(d -> d.getPredecessorId().forEach(pred -> graph.addEdge(pred, d.getIdentifier())));
        Stack<String> sortedIdentifier = graph.getTopologicalSortedStack();
        System.out.println(sortedIdentifier);
    }


}
