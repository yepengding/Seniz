package org.veritasopher.seniz.controller;

import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.builder.ControlSystemBuilder;
import org.veritasopher.seniz.builder.TransitionSystemBuilder;
import org.veritasopher.seniz.builder.VariableSetBuilder;
import org.veritasopher.seniz.core.model.*;
import org.veritasopher.seniz.core.visitor.CompilationUnitVisitor;
import org.veritasopher.seniz.exception.CompilationException;
import org.veritasopher.seniz.exception.StateVariableException;

import java.util.Map;

/**
 * Compilation Controller
 * Compile all files to transition systems
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class CompileController {

    private final TransitionSystemBuilder transitionSystemBuilder;

    private final ControlSystemBuilder controlSystemBuilder;

    private final VariableSetBuilder variableSetBuilder;

    private final Map<String, SourceFile> sourceFileMap;

    public CompileController(Map<String, SourceFile> sourceFileMap) {
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
            case TS: {
                TransitionSystem ts = compileTS(compilationUnit, precompileUnit, parseTree);
                GlobalEnvironment.getInstance().addTransitionSystem(ts);
                break;
            }
            case VAR: {
                StateVariableSet varset = compileVar(compilationUnit);
                GlobalEnvironment.getInstance().addStateVariableSet(varset);
                break;
            }
            case TS_VAR: {
                TransitionSystem ts = compileTSVar(compilationUnit, precompileUnit, parseTree);
                GlobalEnvironment.getInstance().addTransitionSystem(ts);
                break;
            }
            case CTRL: {
                TransitionSystem cs = compileCtrl(compilationUnit, precompileUnit, parseTree);
                GlobalEnvironment.getInstance().addTransitionSystem(cs);
                break;
            }
        }

        return compilationUnit;
    }

    private TransitionSystem compileTS(CompilationUnit compilationUnit, PrecompileUnit precompileUnit, ParseTree parseTree) {
        // Check defined variable set
        String parameter = compilationUnit.getSystemParameter();

        StateVariableSet stateVariableSet = GlobalEnvironment.getInstance().getStateVariableSet(parameter);

        // System parameter is defined
        if (parameter != null) {
            if (stateVariableSet == null) {
                throw new StateVariableException(compilationUnit.getIdentifier(), "Variable set (" + parameter + ") is not defined");
            }
        }

        // Build state variable set
        stateVariableSet = variableSetBuilder.build(stateVariableSet, parseTree);

        // Build transition system
        return transitionSystemBuilder.build(compilationUnit.getTransitionSystem(), stateVariableSet, parseTree);
    }

    private StateVariableSet compileVar(CompilationUnit compilationUnit) {
        return compilationUnit.getStateVariableSet();
    }

    private TransitionSystem compileTSVar(CompilationUnit compilationUnit, PrecompileUnit precompileUnit, ParseTree parseTree) {
        // Check defined variable set
        String parameter = compilationUnit.getSystemParameter();
        StateVariableSet stateVariableSet = compilationUnit.getStateVariableSet();

        // System parameter is defined
        if (parameter != null) {
            if (stateVariableSet == null && !precompileUnit.getPredIdSet().contains(parameter)) {
                throw new StateVariableException(compilationUnit.getIdentifier(), "Variable set (" + parameter + ") is not defined");
            } else if (stateVariableSet != null && parameter.equals(stateVariableSet.getIdentifier()) && precompileUnit.getPredIdSet().contains(parameter)) {
                throw new CompilationException(compilationUnit.getIdentifier(), "Find both imported state variable set and internal state variable set");
            }
        }

        // Build state variable set
        stateVariableSet = variableSetBuilder.build(stateVariableSet, parseTree);

        // Build transition system
        return transitionSystemBuilder.build(compilationUnit.getTransitionSystem(), stateVariableSet, parseTree);
    }

    private TransitionSystem compileCtrl(CompilationUnit compilationUnit, PrecompileUnit precompileUnit, ParseTree parseTree) {
        return controlSystemBuilder.build(compilationUnit.getTransitionSystem(), parseTree);
    }

}
