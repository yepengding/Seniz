package org.veritasopher.seniz.builder;

import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.model.ControlSystem;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.core.model.VariableSet;
import org.veritasopher.seniz.core.model.common.ControlStatement;
import org.veritasopher.seniz.core.visitor.ControlInitStateVisitor;
import org.veritasopher.seniz.core.visitor.ControlStatementVisitor;
import org.veritasopher.seniz.exception.Assert;
import org.veritasopher.seniz.exception.type.BuilderException;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Control System Builder
 *
 * @author Yepeng Ding
 * @date 3/12/2022
 */
public class ControlSystemBuilder {

    public ControlSystem build(ControlSystem controlSystem, VariableSet variableSet, VariableSet globalVariableSet, ParseTree tree, GlobalEnvironment env) {
        // Set state variable set
        controlSystem.setStateVariables(variableSet);
        controlSystem.setGlobalStateVariables(globalVariableSet);

        // Compile initialized global variables of subsystems
        ControlInitStateVisitor controlInitStateVisitor = new ControlInitStateVisitor(controlSystem, false);
        controlInitStateVisitor.visit(tree);

        // Compile control statement
        ControlStatement controlStatement = new ControlStatement();
        ControlStatementVisitor controlStatementVisitor = new ControlStatementVisitor(controlSystem, controlStatement);
        controlStatementVisitor.visit(tree);

        List<String> systemIdentifiers = controlStatement.getSubsystemIdentifierList();

        // Empty check
        Assert.isTrue(systemIdentifiers.size() > 0,
                new BuilderException(controlSystem.getIdentifier(), "Empty control system."));

        // Dependency existence check
        Set<String> lackingDependencies = systemIdentifiers.stream()
                .filter(id -> env.getTransitionSystem(id).isEmpty())
                .collect(Collectors.toSet());
        Assert.isTrue(lackingDependencies.size() == 0,
                new BuilderException(controlSystem.getIdentifier(), "Lack dependency: %s.".formatted(
                        String.join(", ", lackingDependencies)
                )));

        // System argument set consistency check
        // TODO Type check
        Set<String> inconsistentSystems = controlStatement.getSubsystems().stream()
                .filter(sys -> env.getTransitionSystem(sys.identifier()).orElseThrow().getSystemArguments().size() != sys.argEvaluations().size())
                .map(ControlStatement.SubSystem::alias)
                .collect(Collectors.toSet());

        Assert.isTrue(inconsistentSystems.size() == 0,
                new BuilderException(controlSystem.getIdentifier(), "Inconsistent system arguments in subsystems: %s.".formatted(
                        String.join(", ", inconsistentSystems)
                )));

        // Global variable set consistency check (all subsystems must declare the same global variable set to enable sharing)
        inconsistentSystems = systemIdentifiers.stream()
                .filter(id -> !Objects.equals(env.getTransitionSystem(id).orElseThrow().getGlobalVariableSetName(), variableSet.getIdentifier()))
                .collect(Collectors.toSet());
        Assert.isTrue(inconsistentSystems.size() == 0,
                new BuilderException(controlSystem.getIdentifier(), "Inconsistent global variable sets in subsystems: %s.".formatted(
                        String.join(", ", inconsistentSystems)
                )));

        controlSystem.setControlStatement(controlStatement);
        return controlSystem;
    }

}
