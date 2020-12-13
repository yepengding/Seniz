package org.veritasopher.seniz.builder;


import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.VariableSet;
import org.veritasopher.seniz.core.visitor.StateNamingVisitor;
import org.veritasopher.seniz.core.visitor.TransitionVisitor;
import org.veritasopher.seniz.exception.StateException;

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
        StateNamingVisitor stateNamingVisitor = new StateNamingVisitor(transitionSystem);
        stateNamingVisitor.visit(tree);


        // Collect all transitions, inferred states, initial states and actions
        TransitionVisitor transitionVisitor = new TransitionVisitor(transitionSystem);
        transitionVisitor.visit(tree);


        // Check legacy
        legacyCheck(transitionSystem);

        return transitionSystem;
    }

    private void legacyCheck(TransitionSystem ts) {
        if (ts.getInitStates().size() == 0) {
            throw new StateException("Lack initial states.");
        }
    }

}
