package org.veritasopher.seniz.builder;


import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.VariableSet;
import org.veritasopher.seniz.core.visitor.StateDeclarationVisitor;
import org.veritasopher.seniz.core.visitor.TransitionVisitor;
import org.veritasopher.seniz.exception.BaseException;
import org.veritasopher.seniz.exception.StateException;
import org.veritasopher.seniz.exception.TransitionException;

/**
 * Transition System Builder
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class TransitionSystemBuilder {

    /**
     * Build transition system
     *
     * @param transitionSystem identified transition system
     * @param variableSet      variable set
     * @param tree             parse tree
     * @return built transition system
     */
    public TransitionSystem build(TransitionSystem transitionSystem, VariableSet variableSet, ParseTree tree) {

        // Collect defined state variables
        if (variableSet == null) {
            variableSet = new VariableSet();
        }
        transitionSystem.setVariables(variableSet);

        // Collect named states
        try {
            StateDeclarationVisitor stateDeclarationVisitor = new StateDeclarationVisitor(transitionSystem);
            stateDeclarationVisitor.visit(tree);
        } catch (StateException e) {
            return null;
        }

        // Collect all transitions, inferred states, initial states and actions
        try {
            TransitionVisitor transitionVisitor = new TransitionVisitor(transitionSystem);
            transitionVisitor.visit(tree);
        } catch (TransitionException e) {
            return null;
        }

        // Check legacy
        try {
            legacyCheck(transitionSystem);
        } catch (StateException e) {
            return null;
        }
        return transitionSystem;
    }

    private void legacyCheck(TransitionSystem ts) {
        if (ts.getInitStates().size() == 0) {
            throw new StateException("Lack initial states.");
        }
    }

}
