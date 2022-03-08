package org.veritasopher.seniz.builder;

import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.visitor.ControlStatementVisitor;
import org.veritasopher.seniz.exception.type.BuilderException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Control System Builder
 *
 * @author Yepeng Ding
 * @date 12/19/2020
 */
public class ControlSystemBuilder {

    public TransitionSystem build(TransitionSystem controlSystem, ParseTree tree, GlobalEnvironment env) {
        List<String> identifiers = new ArrayList<>();
        ControlStatementVisitor controlStatementVisitor = new ControlStatementVisitor(identifiers);
        controlStatementVisitor.visit(tree);

        // Empty check
        if (identifiers.size() < 1) {
            throw new BuilderException(controlSystem.getIdentifier(), "Empty control system.");
        }

        // Dependency existence check
        if (identifiers.stream().map(env::getTransitionSystem).anyMatch(Objects::isNull)) {
            throw new BuilderException(controlSystem.getIdentifier(), "Lack dependencies.");
        }

        controlSystem.setControlSystemIds(identifiers);
        return controlSystem;
    }

}
