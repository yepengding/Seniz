package org.veritasopher.seniz.core.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Global Environment
 *
 * @author Yepeng Ding
 * @date 12/18/2020
 */
public final class GlobalEnvironment {

    private static GlobalEnvironment INSTANCE;

    private final Map<String, TransitionSystem> transitionSystems;

    // State Variable Map<Identifier, State Variable Set>
    private final Map<String, StateVariableSet> stateVariableSets;

    private GlobalEnvironment() {
        this.transitionSystems = new HashMap<>();
        this.stateVariableSets = new HashMap<>();
    }

    public synchronized static GlobalEnvironment getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GlobalEnvironment();
        }

        return INSTANCE;
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
     * Add a state variable set to global environment
     *
     * @param varset state variable set
     */
    public void addStateVariableSet(StateVariableSet varset) {
        this.stateVariableSets.put(varset.getIdentifier(), varset);
    }

    /**
     * Get a state variable set
     *
     * @param identifier state variable set identifier
     * @return state variable set
     */
    public StateVariableSet getStateVariableSet(String identifier) {
        return this.stateVariableSets.get(identifier);
    }
}
