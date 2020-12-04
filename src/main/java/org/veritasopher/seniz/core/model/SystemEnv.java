package org.veritasopher.seniz.core.model;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import lombok.Data;
import org.veritasopher.seniz.core.model.domain.State;
import org.veritasopher.seniz.core.model.domain.StateVariable;
import org.veritasopher.seniz.core.model.domain.Transition;

import java.util.*;
import java.util.stream.Collectors;

/**
 * System Environment
 *
 * @author Yepeng Ding
 * @date 12/2/2020
 */
@Data
public class SystemEnv {

    private String identifier;

    // Variable map <Name, State variable>
    private Map<String, StateVariable> variables;

    // State map <HashCode, State>
    private Map<Integer, State> states;

    // State naming map <HashCode, Name>
    private BiMap<Integer, String> stateNames;

    // Initial state set <HashCode>
    private Set<Integer> initStates;

    // Transition map <HashCode, Transition>
    private Map<Integer, Transition> transitions;

    public SystemEnv() {
        this.variables = new HashMap<>();
        this.states = new HashMap<>();
        this.stateNames = HashBiMap.create();
        this.transitions = new HashMap<>();
        this.initStates = new HashSet<>();
    }

    public SystemEnv(String identifier) {
        this.identifier = identifier;
        this.variables = new HashMap<>();
        this.states = new HashMap<>();
        this.stateNames = HashBiMap.create();
        this.transitions = new HashMap<>();
        this.initStates = new HashSet<>();
    }

    /**
     * Add a state variable
     *
     * @param stateVariable
     */
    public void addVariable(StateVariable stateVariable) {
        this.variables.put(stateVariable.getName(), stateVariable);
    }


    /**
     * Get a state variable by name
     *
     * @param name variable name
     * @return
     */
    public StateVariable getVariable(String name) {
        return this.variables.get(name);
    }

    /**
     * Look up if variable exists.
     *
     * @param name variable name
     * @return true if state exists. Otherwise false.
     */
    public boolean haveVariable(String name) {
        return this.getVariables().containsKey(name);
    }

    /**
     * Get the set of state variables
     *
     * @return set of state variables
     */
    public Set<StateVariable> getVariableSet() {
        return new HashSet<>(this.variables.values());
    }

    /**
     * Add a state with name
     *
     * @param name
     * @param state
     */
    public void addState(String name, State state) {
        this.states.put(state.hashCode(), state);
        this.stateNames.put(state.hashCode(), name);
    }

    /**
     * Get a state by name
     *
     * @param name
     * @return
     */
    public Optional<State> getState(String name) {
        return Optional.ofNullable(states.get(stateNames.inverse().get(name)));
    }

    /**
     * Look up if state exists.
     *
     * @param state
     * @return true if state exists. Otherwise false.
     */
    public boolean haveState(State state) {
        return this.states.containsKey(state.hashCode());
    }

    /**
     * Get a state name
     *
     * @param state
     * @return state name if exists. Otherwise null;
     */
    public String getStateName(State state) {
        return this.stateNames.get(state.hashCode());
    }

    /**
     * Add a transition relation
     *
     * @param transition
     */
    public void addTransition(Transition transition) {
        this.transitions.put(transition.hashCode(), transition);
    }

    /**
     * Look up if transition exists.
     *
     * @param transition
     * @return true if transition exists. Otherwise false.
     */
    public boolean haveTransition(Transition transition) {
        return this.transitions.containsKey(transition.hashCode());
    }

    /**
     * Add an initial state
     *
     * @param state initial state
     */
    public void addInitState(State state) {
        this.initStates.add(state.hashCode());
    }

}
