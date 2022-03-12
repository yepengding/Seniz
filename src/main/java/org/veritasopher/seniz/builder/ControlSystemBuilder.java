package org.veritasopher.seniz.builder;

import org.antlr.v4.runtime.tree.ParseTree;
import org.checkerframework.checker.units.qual.C;
import org.veritasopher.seniz.core.model.ControlSystem;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.core.model.VariableSet;
import org.veritasopher.seniz.core.model.common.ControlStatement;
import org.veritasopher.seniz.core.visitor.ControlStatementVisitor;
import org.veritasopher.seniz.exception.Assert;
import org.veritasopher.seniz.exception.type.BuilderException;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Control System Builder
 *
 * @author Yepeng Ding
 * @date 3/12/2022
 */
public class ControlSystemBuilder {

    public ControlSystem build(ControlSystem controlSystem, VariableSet variableSet, ParseTree tree, GlobalEnvironment env) {
        // Set state variable set
        controlSystem.setStateVariables(variableSet);

        // Compile control statement
        ControlStatement controlStatement = new ControlStatement();
        ControlStatementVisitor controlStatementVisitor = new ControlStatementVisitor(controlStatement);
        controlStatementVisitor.visit(tree);

        // Empty check
        Assert.isTrue(controlStatement.getSystemIdentifiers().size() > 0,
                new BuilderException(controlSystem.getIdentifier(), "Empty control system."));

        // Dependency existence check
        Set<String> lackingDependencies = controlStatement.getSystemIdentifiers().stream()
                .filter(id -> env.getTransitionSystem(id).isEmpty())
                .collect(Collectors.toSet());
        Assert.isTrue(lackingDependencies.size() == 0,
                new BuilderException(controlSystem.getIdentifier(), "Lack dependency: %s.".formatted(
                        String.join(", ", lackingDependencies)
                )));

        controlSystem.setControlStatement(controlStatement);
        return controlSystem;
    }

}
