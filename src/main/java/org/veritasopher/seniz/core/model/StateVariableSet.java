package org.veritasopher.seniz.core.model;

import lombok.Data;
import org.veritasopher.seniz.core.model.domain.StateVariable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * State Variable Set
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
@Data
public class StateVariableSet {

    private String identifier;

    // Variable map <Name, State variable>
    private final Map<String, StateVariable> variables;

    public StateVariableSet() {
        this.variables = new HashMap<>();
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
     * Get the set of state variables
     *
     * @return set of state variables
     */
    public Set<StateVariable> getVariableSet() {
        return new HashSet<>(this.variables.values());
    }

    /**
     * Look up if variable exists.
     *
     * @param name variable name
     * @return true if state exists. Otherwise false.
     */
    public boolean hasVariable(String name) {
        return this.variables.containsKey(name);
    }

}
