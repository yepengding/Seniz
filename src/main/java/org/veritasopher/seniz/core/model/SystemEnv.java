package org.veritasopher.seniz.core.model;

import lombok.Data;
import org.veritasopher.seniz.core.model.domain.Action;
import org.veritasopher.seniz.core.model.domain.State;
import org.veritasopher.seniz.core.model.domain.StateVariable;
import org.veritasopher.seniz.core.model.domain.Transition;

import java.util.*;

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

    // Action map <HashCode, Action>
    private Map<Integer, Action> actions;

    // Initial state set <HashCode>
    private Set<Integer> initStates;

    // Transition map <HashCode, Transition>
    private Map<Integer, Transition> transitions;

    // State naming map <Name, State>
    private Map<String, State> stateNames;

    public SystemEnv() {
        this.variables = new HashMap<>();
        this.states = new HashMap<>();
        this.actions = new HashMap<>();
        this.transitions = new HashMap<>();
        this.initStates = new HashSet<>();
        this.stateNames = new HashMap<>();
    }

    public SystemEnv(String identifier) {
        this.identifier = identifier;
        this.variables = new HashMap<>();
        this.states = new HashMap<>();
        this.actions = new HashMap<>();
        this.transitions = new HashMap<>();
        this.initStates = new HashSet<>();
        this.stateNames = new HashMap<>();
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
    public boolean hasVariable(String name) {
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
     * Add a state
     *
     * @param state
     */
    public void addState(State state) {
        this.states.put(state.hashCode(), state);
    }

    /**
     * Get a state by hash code
     *
     * @param hashCode
     * @return
     */
    public State getState(int hashCode) {
        return this.states.get(hashCode);
    }

    /**
     * Look up if state exists.
     *
     * @param state
     * @return true if state exists. Otherwise false.
     */
    public boolean hasState(State state) {
        return this.states.containsKey(state.hashCode());
    }

    /**
     * Add an action
     *
     * @param action
     */
    public void addAction(Action action) {
        this.actions.put(action.hashCode(), action);
    }

    public Action getAction(int hashCode) {
        return this.actions.get(hashCode);
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
    public boolean hasTransition(Transition transition) {
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

    /**
     * Look up if initial state exists.
     *
     * @param state
     * @return true if initial state exists. Otherwise false.
     */
    public boolean hasInitState(State state) {
        return this.getInitStates().contains(state.hashCode());
    }

    /**
     * Add a state name
     *
     * @param name
     * @param state
     */
    public void addStateName(String name, State state) {
        this.stateNames.put(name, state);
    }

    /**
     * Get a named state
     *
     * @param name state name
     * @return Either a named state or null
     */
    public Optional<State> getStateName(String name) {
        return Optional.ofNullable(this.stateNames.get(name));
    }

    /**
     * Look up if state name exists.
     *
     * @param name state name
     * @return true if state name exists. Otherwise false.
     */
    public boolean hasStateName(String name) {
        return this.stateNames.containsKey(name);
    }

}
