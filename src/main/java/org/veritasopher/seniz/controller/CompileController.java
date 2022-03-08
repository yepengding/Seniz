package org.veritasopher.seniz.controller;

import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.builder.ControlSystemBuilder;
import org.veritasopher.seniz.builder.TransitionSystemBuilder;
import org.veritasopher.seniz.builder.VariableSetBuilder;
import org.veritasopher.seniz.core.model.*;
import org.veritasopher.seniz.core.visitor.CompilationUnitVisitor;
import org.veritasopher.seniz.exception.type.CompilationException;
import org.veritasopher.seniz.exception.type.StateVariableException;

import java.util.Map;

/**
 * Compilation Controller
 * Compile all files to transition systems
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class CompileController {

    private final GlobalEnvironment env;

    private final TransitionSystemBuilder transitionSystemBuilder;

    private final ControlSystemBuilder controlSystemBuilder;

    private final VariableSetBuilder variableSetBuilder;

    private final Map<String, SourceFile> sourceFileMap;

    public CompileController(GlobalEnvironment environment, Map<String, SourceFile> sourceFileMap) {
        this.env = environment;
        this.sourceFileMap = sourceFileMap;
        this.transitionSystemBuilder = new TransitionSystemBuilder();
        this.controlSystemBuilder = new ControlSystemBuilder();
        this.variableSetBuilder = new VariableSetBuilder();
    }

    public CompilationUnit compile(ParseTree parseTree) {
        CompilationUnit compilationUnit = new CompilationUnit();
        CompilationUnitVisitor compilationUnitVisitor = new CompilationUnitVisitor(compilationUnit);
        compilationUnitVisitor.visit(parseTree);
        PrecompileUnit precompileUnit = sourceFileMap.get(compilationUnit.getIdentifier()).getPrecompileUnit();
        switch (precompileUnit.getType()) {
            case TS -> {
                TransitionSystem ts = compileTS(compilationUnit, precompileUnit, parseTree);
                env.addTransitionSystem(ts);
            }
            case VAR -> {
                VariableSet varset = compileVar(compilationUnit);
                env.addStateVariableSet(varset);
            }
            case TS_VAR -> {
                TransitionSystem ts = compileTSVar(compilationUnit, precompileUnit, parseTree);
                env.addTransitionSystem(ts);
            }
            case CTRL -> {
                TransitionSystem cs = compileCtrl(compilationUnit, precompileUnit, parseTree);
                env.addTransitionSystem(cs);
            }
        }

        return compilationUnit;
    }

    private TransitionSystem compileTS(CompilationUnit compilationUnit, PrecompileUnit precompileUnit, ParseTree parseTree) {
        // Check defined variable set
        String variableSetId = compilationUnit.getVariableSetIdentifier();

        VariableSet variableSet = env.getStateVariableSet(variableSetId);

        // Variable set is defined
        if (variableSetId != null && variableSet == null) {
            throw new StateVariableException(compilationUnit.getIdentifier(), "Variable set (" + variableSetId + ") is not defined");
        }

        // Build state variable set
        variableSet = variableSetBuilder.build(variableSet, compilationUnit.getTransitionSystem().getSystemArguments(), parseTree);

        // Build transition system
        return transitionSystemBuilder.build(compilationUnit.getTransitionSystem(), variableSet, parseTree);
    }

    private VariableSet compileVar(CompilationUnit compilationUnit) {
        return compilationUnit.getStateVariableSet();
    }

    private TransitionSystem compileTSVar(CompilationUnit compilationUnit, PrecompileUnit precompileUnit, ParseTree parseTree) {
        // Check defined variable set
        String variableSetId = compilationUnit.getVariableSetIdentifier();
        VariableSet variableSet = compilationUnit.getStateVariableSet();

        // Variable set is defined
        if (variableSetId != null) {
            if (variableSet == null && !precompileUnit.getPredIdSet().contains(variableSetId)) {
                throw new StateVariableException(compilationUnit.getIdentifier(), "Variable set (" + variableSetId + ") is not defined");
            } else if (variableSet != null && variableSetId.equals(variableSet.getIdentifier()) && precompileUnit.getPredIdSet().contains(variableSetId)) {
                throw new CompilationException(compilationUnit.getIdentifier(), "Find both imported state variable set and internal state variable set");
            }
        }

        // Build state variable set
        variableSet = variableSetBuilder.build(variableSet, parseTree);

        // Build transition system
        return transitionSystemBuilder.build(compilationUnit.getTransitionSystem(), variableSet, parseTree);
    }

    private TransitionSystem compileCtrl(CompilationUnit compilationUnit, PrecompileUnit precompileUnit, ParseTree parseTree) {
        return controlSystemBuilder.build(compilationUnit.getTransitionSystem(), parseTree, env);
    }

}
