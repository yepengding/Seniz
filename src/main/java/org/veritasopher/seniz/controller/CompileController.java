package org.veritasopher.seniz.controller;

import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.builder.ControlSystemBuilder;
import org.veritasopher.seniz.builder.TransitionSystemBuilder;
import org.veritasopher.seniz.builder.VariableSetBuilder;
import org.veritasopher.seniz.core.model.*;
import org.veritasopher.seniz.core.visitor.CompilationUnitVisitor;
import org.veritasopher.seniz.exception.Assert;
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

    /**
     * Compiler a parse tree
     *
     * @param parseTree parse tree
     * @return a compilation unit
     */
    public CompilationUnit compile(ParseTree parseTree) {
        CompilationUnit compilationUnit = new CompilationUnit();
        // Instantiate a system or a variable set
        CompilationUnitVisitor compilationUnitVisitor = new CompilationUnitVisitor(compilationUnit);
        compilationUnitVisitor.visit(parseTree);
        PrecompileUnit precompileUnit = sourceFileMap.get(compilationUnit.getIdentifier()).getPrecompileUnit();
        switch (precompileUnit.getType()) {
            // Only a transition system
            case TS -> compileTS(compilationUnit, parseTree);
            // Only a variable set
            case VAR -> compileVar(compilationUnit);
            // A transition system and a state variable set
            case TS_VAR -> compileTSVar(compilationUnit, parseTree);
            // A control system
            case CTRL -> compileCtrl(compilationUnit, parseTree);
            // A control system and a state variable set
            case CTRL_VAR -> compileCtrlVar(compilationUnit, parseTree);
        }

        return compilationUnit;
    }

    /**
     * Compile a transition system
     *
     * @param compilationUnit transition system unit
     * @param parseTree       parse tree
     */
    private void compileTS(CompilationUnit compilationUnit, ParseTree parseTree) {
        TransitionSystem system = compilationUnit.getTransitionSystem();

        // Get defined variable set
        String variableSetName = system.getDependentVariableSetName();
        VariableSet variableSet = env.getStateVariableSet(variableSetName).orElseThrow(() -> {
            throw new StateVariableException(compilationUnit.getIdentifier(), "Variable set (" + variableSetName + ") is not defined");
        });

        // Finalize state variable set
        variableSet = variableSetBuilder.build(system, variableSet);

        // Build transition system and add it to the global environment
        env.addTransitionSystem(transitionSystemBuilder.build(system, variableSet, parseTree));
    }

    /**
     * Compile a variable set
     *
     * @param compilationUnit compilation unit
     */
    private void compileVar(CompilationUnit compilationUnit) {
        compileVarSetToEnv(compilationUnit.getVariableSet());
    }

    /**
     * Compile a transition system with a variable set
     *
     * @param compilationUnit compilation unit containing a transition system and a variable set
     * @param parseTree       parse tree
     */
    private void compileTSVar(CompilationUnit compilationUnit, ParseTree parseTree) {
        TransitionSystem system = compilationUnit.getTransitionSystem();
        VariableSet variableSet = compilationUnit.getVariableSet();

        compileVarSetToEnv(variableSet);

        // Get defined variable set
        String variableSetName = system.getDependentVariableSetName();
        variableSet = env.getStateVariableSet(variableSetName).orElseThrow(() -> {
            throw new StateVariableException(compilationUnit.getIdentifier(), "Variable set (" + variableSetName + ") is not defined");
        });

        // Build state variable set
        variableSet = variableSetBuilder.build(system, variableSet);

        // Build transition system and add it to the global environment
        env.addTransitionSystem(transitionSystemBuilder.build(system, variableSet, parseTree));
    }

    /**
     * Compile a control system
     *
     * @param compilationUnit control system unit
     * @param parseTree       parse tree
     */
    private void compileCtrl(CompilationUnit compilationUnit, ParseTree parseTree) {
        compileControlSystemToEnv(compilationUnit.getControlSystem(), parseTree);
    }

    /**
     * Compile a control system with a variable set
     *
     * @param compilationUnit compilation unit containing a control system and a variable set
     * @param parseTree       parse tree
     */
    private void compileCtrlVar(CompilationUnit compilationUnit, ParseTree parseTree) {
        VariableSet variableSet = compilationUnit.getVariableSet();
        compileVarSetToEnv(variableSet);

        compileControlSystemToEnv(compilationUnit.getControlSystem(), parseTree);
    }

    /**
     * Add a variable set to the global environment
     *
     * @param variableSet variable set
     */
    private void compileVarSetToEnv(VariableSet variableSet) {
        Assert.isTrue(env.getStateVariableSet(variableSet.getIdentifier()).isEmpty(),
                new StateVariableException(variableSet.getIdentifier(), "Variable set (" + variableSet.getIdentifier() + ") has been defined."));
        // Add the compiled variable set to the global environment
        env.addStateVariableSet(variableSet);
    }

    private void compileControlSystemToEnv(ControlSystem system, ParseTree parseTree) {
        // Get defined variable set
        VariableSet variableSet;
        String variableSetName = system.getDependentVariableSetName();
        if (variableSetName != null) {
            variableSet = env.getStateVariableSet(variableSetName).orElseThrow(() -> {
                throw new StateVariableException(system.getIdentifier(), "Variable set (" + variableSetName + ") is not defined");
            });
        } else {
            variableSet = new VariableSet();
        }

        // Finalize state variable set
        variableSet = variableSetBuilder.build(system, variableSet);

        // Build control system and add it to the global environment
        env.addControlSystem(controlSystemBuilder.build(system, variableSet, parseTree, env));
    }

}
