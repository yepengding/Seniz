package org.veritasopher.seniz.core.model;

import lombok.Data;
import org.veritasopher.seniz.core.model.common.StateVariable;

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
public class VariableSet {

    private String identifier;

    // Variable map <Name, State variable>
    private final Map<String, StateVariable> variables;

    public VariableSet() {
        this.variables = new HashMap<>();
    }

    /**
     * Add a state variable
     *
     * @param stateVariable state variable
     */
    public void addVariable(StateVariable stateVariable) {
        this.variables.put(stateVariable.getName(), stateVariable);
    }

    /**
     * Update the evaluation of a state variable
     *
     * @param stateVariable new state variable
     */
    public void updateVariable(StateVariable stateVariable) {
        this.variables.get(stateVariable.getName()).setEvaluation(stateVariable.getEvaluation());
    }

    /**
     * Get a state variable by name
     *
     * @param name variable name
     * @return state variable
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
