package org.veritasopher.seniz.builder;


import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.VariableSet;
import org.veritasopher.seniz.core.visitor.*;
import org.veritasopher.seniz.exception.type.StateException;

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
     * @param stateVariableSet variable set
     * @param tree             parse tree
     * @return built transition system
     */
    public TransitionSystem build(TransitionSystem transitionSystem, VariableSet stateVariableSet, VariableSet globalVariableSet, ParseTree tree) {
        // Set state variable set
        transitionSystem.setStateVariables(stateVariableSet);
        transitionSystem.setGlobalStateVariables(globalVariableSet);

        // Collect state naming (name -> state declarator)
        StateNamingVisitor stateNamingVisitor = new StateNamingVisitor(transitionSystem);
        StateNamingVisitor.ExplicitNamingVisitor explicitNamingVisitor = stateNamingVisitor.new ExplicitNamingVisitor();
        explicitNamingVisitor.visit(tree);

        StateNamingVisitor.ImplicitNamingVisitor implicitNamingVisitor = stateNamingVisitor.new ImplicitNamingVisitor();
        implicitNamingVisitor.visit(tree);

        // Collect global state naming (name -> global state declarator)
        GlobalStateNamingVisitor globalStateNamingVisitor = new GlobalStateNamingVisitor(transitionSystem);
        GlobalStateNamingVisitor.ExplicitNamingVisitor globalExplicitNamingVisitor = globalStateNamingVisitor.new ExplicitNamingVisitor();
        globalExplicitNamingVisitor.visit(tree);

        GlobalStateNamingVisitor.ImplicitNamingVisitor globalImplicitNamingVisitor = globalStateNamingVisitor.new ImplicitNamingVisitor();
        globalImplicitNamingVisitor.visit(tree);

        // Collect all propositions
        PropositionVisitor propositionVisitor = new PropositionVisitor(transitionSystem);
        propositionVisitor.visit(tree);

        // Construct transition rule base
        TransitionRuleVisitor transitionRuleVisitor = new TransitionRuleVisitor(transitionSystem);
        transitionRuleVisitor.visit(tree);

        // Collect all transitions, inferred states, initial states and actions
        TransitionVisitor transitionVisitor = new TransitionVisitor(transitionSystem);
        transitionVisitor.visit(tree);


        // Check legacy
        legacyCheck(transitionSystem);

        return transitionSystem;
    }

    private void legacyCheck(TransitionSystem ts) {
        if (ts.getInitState() == null) {
            throw new StateException(ts.getIdentifier(), "Lack initial states.");
        }
    }

}
