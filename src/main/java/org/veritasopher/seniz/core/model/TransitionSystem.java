package org.veritasopher.seniz.core.model;

import lombok.Getter;
import lombok.Setter;
import org.veritasopher.seniz.core.model.common.*;

import java.util.*;

/**
 * Transition System
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
@Getter
public class TransitionSystem {

    // System identifier
    private final String identifier;

    // State variable set
    @Setter
    private StateVariableSet stateVariables;

    // System variable set
    private final SystemVariableSet systemVariables;

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

    // True if is control system
    private final boolean isControl;

    // List of system identifiers in control system
    @Setter
    @Getter
    private List<String> controlSystemIds;

    public TransitionSystem(String identifier, boolean isControl) {
        this.identifier = identifier;
        this.stateVariables = new StateVariableSet();
        this.systemVariables = new SystemVariableSet();
        this.states = new HashMap<>();
        this.actions = new HashMap<>();
        this.transitions = new HashMap<>();
        this.initStates = new HashSet<>();
        this.stateNames = new HashMap<>();
        this.isControl = isControl;
    }

    /**
     * Get a state variable by name
     *
     * @param name state variable name
     * @return
     */
    public StateVariable getStateVariable(String name) {
        return this.stateVariables.getVariable(name);
    }

    /**
     * Look up if state variable exists.
     *
     * @param name state variable name
     * @return true if state variable exists. Otherwise false.
     */
    public boolean hasStateVariable(String name) {
        return this.stateVariables.hasVariable(name);
    }

    /**
     * Get the set of state variables
     *
     * @return set of state variables
     */
    public Set<StateVariable> getStateVariableSet() {
        return this.stateVariables.getVariableSet();
    }

    /**
     * Add a state variable
     *
     * @param systemVariable system variable
     */
    public void addSystemVariable(SystemVariable systemVariable) {
        this.systemVariables.addVariable(systemVariable);
    }

    /**
     * Look up if system variable exists.
     *
     * @param systemVariable
     * @return true if system variable exists. Otherwise false.
     */
    public boolean hasSystemVariable(SystemVariable systemVariable) {
        return this.systemVariables.hasVariable(systemVariable.getName());
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
        this.stateNames.put(getGlobalStateName(name), state);
    }

    /**
     * Get a named state
     *
     * @param name state name
     * @return Either a named state or null
     */
    public Optional<State> getStateName(String name) {
        return Optional.ofNullable(this.stateNames.get(getGlobalStateName(name)));
    }

    /**
     * Look up if state name exists.
     *
     * @param name state name
     * @return true if state name exists. Otherwise false.
     */
    public boolean hasStateName(String name) {
        return this.stateNames.containsKey(getGlobalStateName(name));
    }

    private String getGlobalStateName(String name) {
        return identifier + "." + name;
    }

}
