package org.veritasopher.seniz.core.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Global Environment
 *
 * @author Yepeng Ding
 * @date 12/21/2020
 */
public class GlobalEnvironment {

    // Transition System Map<Identifier, Transition System>
    private final Map<String, TransitionSystem> transitionSystems;

    // State Variable Map<Identifier, State Variable Set>
    private final Map<String, VariableSet> stateVariableSets;

    @Getter
    @Setter
    private TransitionSystem mainTS;

    public GlobalEnvironment() {
        this.transitionSystems = new HashMap<>();
        this.stateVariableSets = new HashMap<>();
    }


    /**
     * Add a transition system to global environment
     *
     * @param ts transition system
     */
    public void addTransitionSystem(TransitionSystem ts) {
        this.transitionSystems.put(ts.getIdentifier(), ts);
    }

    /**
     * Get a transition system
     *
     * @param identifier transition system identifier
     * @return transition system
     */
    public TransitionSystem getTransitionSystem(String identifier) {
        return this.transitionSystems.get(identifier);
    }

    /**
     * Add a state variable set to global environment
     *
     * @param varset state variable set
     */
    public void addStateVariableSet(VariableSet varset) {
        this.stateVariableSets.put(varset.getIdentifier(), varset);
    }

    /**
     * Get a state variable set
     *
     * @param identifier state variable set identifier
     * @return state variable set
     */
    public VariableSet getStateVariableSet(String identifier) {
        return this.stateVariableSets.get(identifier);
    }
}
