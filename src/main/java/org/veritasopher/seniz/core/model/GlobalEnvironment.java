package org.veritasopher.seniz.core.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Global Environment
 *
 * @author Yepeng Ding
 * @date 12/21/2020
 */
public class GlobalEnvironment {

    // Transition System Map<Identifier, Transition System>
    private final Map<String, TransitionSystem> transitionSystems;

    // Control System Map<Identifier, Control System>
    private final Map<String, ControlSystem> controlSystems;

    // State Variable Set Map<Identifier, State Variable Set>
    private final Map<String, VariableSet> stateVariableSets;

    @Getter
    @Setter
    private String mainSystemIdentifier;

    public GlobalEnvironment() {
        this.transitionSystems = new HashMap<>();
        this.controlSystems = new HashMap<>();
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
     * @return either a transition system or null
     */
    public Optional<TransitionSystem> getTransitionSystem(String identifier) {
        return Optional.ofNullable(this.transitionSystems.get(identifier));
    }

    /**
     * Add a control system to global environment
     *
     * @param cs control system
     */
    public void addControlSystem(ControlSystem cs) {
        this.controlSystems.put(cs.getIdentifier(), cs);
    }

    /**
     * Get a control system
     *
     * @param identifier control system identifier
     * @return either a control system or null
     */
    public Optional<ControlSystem> getControlSystem(String identifier) {
        return Optional.ofNullable(this.controlSystems.get(identifier));
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
     * @return either a state variable set or null
     */
    public Optional<VariableSet> getStateVariableSet(String identifier) {
        return Optional.ofNullable(this.stateVariableSets.get(identifier));
    }
}
