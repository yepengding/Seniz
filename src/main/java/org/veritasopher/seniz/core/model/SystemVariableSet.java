package org.veritasopher.seniz.core.model;

import org.veritasopher.seniz.core.model.common.SystemVariable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * System Variable Set
 *
 * @author Yepeng Ding
 * @date 12/16/2020
 */
public class SystemVariableSet {

    // Variable map <Name, System variable>
    private final Map<String, SystemVariable> variables;

    public SystemVariableSet() {
        this.variables = new HashMap<>();
    }

    /**
     * Add a state variable
     *
     * @param systemVariable
     */
    public void addVariable(SystemVariable systemVariable) {
        this.variables.put(systemVariable.getName(), systemVariable);
    }

    /**
     * Get a system variable by name
     *
     * @param name variable name
     * @return
     */
    public SystemVariable getVariable(String name) {
        return this.variables.get(name);
    }

    /**
     * Get the set of system variables
     *
     * @return set of system variables
     */
    public Set<SystemVariable> getVariableSet() {
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
