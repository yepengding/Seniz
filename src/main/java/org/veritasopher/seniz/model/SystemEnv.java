package org.veritasopher.seniz.model;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import lombok.Data;
import org.veritasopher.seniz.model.domain.State;
import org.veritasopher.seniz.model.domain.StateVariable;
import org.veritasopher.seniz.model.domain.Transition;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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

    // Transition map <HashCode, Transition>
    private Map<Integer, Transition> transitions;

    public SystemEnv() {
        this.variables = new HashMap<>();
        this.states = new HashMap<>();
        this.stateNames = HashBiMap.create();
        this.transitions = new HashMap<>();
    }

    public SystemEnv(String identifier) {
        this.identifier = identifier;
        this.variables = new HashMap<>();
        this.states = new HashMap<>();
        this.stateNames = HashBiMap.create();
        this.transitions = new HashMap<>();
    }

    /**
     * Add a state variable
     *
     * @param stateVariable
     */
    public void addVar(StateVariable stateVariable) {
        this.variables.put(stateVariable.getName(), stateVariable);
    }


    /**
     * Get a state variable by name
     *
     * @param name
     * @return
     */
    public StateVariable getVar(String name) {
        return this.variables.get(name);
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

}
