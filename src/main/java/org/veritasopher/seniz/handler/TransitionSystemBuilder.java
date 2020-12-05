package org.veritasopher.seniz.handler;


import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.VariableSet;
import org.veritasopher.seniz.core.visitor.StateDeclarationVisitor;
import org.veritasopher.seniz.core.visitor.TransitionVisitor;

/**
 * Transition System Builder
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class TransitionSystemBuilder {

    public TransitionSystem build(TransitionSystem transitionSystem, VariableSet variableSet, ParseTree tree) {

        // Collect defined state variables
        if (variableSet == null) {
            variableSet = new VariableSet();
        }
        transitionSystem.setVariables(variableSet);

        // Collect named states
        StateDeclarationVisitor stateDeclarationVisitor = new StateDeclarationVisitor(transitionSystem);
        stateDeclarationVisitor.visit(tree);

        // Collect all transitions and infer states and actions
        TransitionVisitor transitionVisitor = new TransitionVisitor(transitionSystem);
        transitionVisitor.visit(tree);

        return transitionSystem;
    }

}
