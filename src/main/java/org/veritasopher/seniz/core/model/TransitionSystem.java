package org.veritasopher.seniz.core.model;

import lombok.Getter;
import lombok.Setter;
import org.veritasopher.seniz.core.model.common.Action;
import org.veritasopher.seniz.core.model.common.State;
import org.veritasopher.seniz.core.model.common.StateVariable;
import org.veritasopher.seniz.core.model.common.Transition;

import java.util.*;

/**
 * Transition System
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
@Getter
public class TransitionSystem {

    private final String identifier;

    @Setter
    private StateVariableSet variables;

    // State map <HashCode, State>
    private final Map<Integer, State> states;

    // Action map <HashCode, Action>
    private final Map<Integer, Action> actions;

    // Initial state set <HashCode>
    private final Set<Integer> initStates;

    // Transition map <HashCode, Transition>
    private final Map<Integer, Transition> transitions;

    // State naming map <Name, State>
    private final Map<String, State> stateNames;

    public TransitionSystem(String identifier) {
        this.identifier = identifier;
        this.variables = new StateVariableSet();
        this.states = new HashMap<>();
        this.actions = new HashMap<>();
        this.transitions = new HashMap<>();
        this.initStates = new HashSet<>();
        this.stateNames = new HashMap<>();
    }

    /**
     * Get a state variable by name
     *
     * @param name variable name
     * @return
     */
    public StateVariable getVariable(String name) {
        return this.variables.getVariable(name);
    }

    /**
     * Look up if variable exists.
     *
     * @param name variable name
     * @return true if state exists. Otherwise false.
     */
    public boolean hasVariable(String name) {
        return this.variables.hasVariable(name);
    }

    /**
     * Get the set of state variables
     *
     * @return set of state variables
     */
    public Set<StateVariable> getVariableSet() {
        return this.variables.getVariableSet();
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

    /**
     * Get action by hashcode
     *
     * @param hashCode
     * @return either Action or null
     */
    public Optional<Action> getAction(Integer hashCode) {
        return Optional.ofNullable(this.actions.get(hashCode));
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
