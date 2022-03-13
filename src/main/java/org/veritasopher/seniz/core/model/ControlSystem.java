package org.veritasopher.seniz.core.model;

import lombok.Getter;
import lombok.Setter;
import org.veritasopher.seniz.core.model.common.ControlStatement;
import org.veritasopher.seniz.core.model.common.SystemArgument;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Compilation Unit
 *
 * @author Yepeng Ding
 * @date 3/11/2022
 */
@Getter
public class ControlSystem {

    // System identifier
    private final String identifier;

    // Dependent variable set name
    @Setter
    private String dependentVariableSetName;

    // Global (Shared) variable set name
    @Setter
    private String globalVariableSetName;

    // State variable set
    @Setter
    private VariableSet stateVariables;

    // Global (Shared) state variable set
    @Setter
    private VariableSet globalStateVariables;

    // Argument map <Name, System Argument>
    private final Map<String, SystemArgument> arguments;

    // Control statement
    @Setter
    private ControlStatement controlStatement;

    public ControlSystem(String identifier) {
        this.identifier = identifier;
        this.arguments = new HashMap<>();
    }

    /**
     * Add a system argument
     *
     * @param systemArgument system argument
     */
    public void addSystemArgument(SystemArgument systemArgument) {
        this.arguments.put(systemArgument.getName(), systemArgument);
    }

    /**
     * Look up if system argument exists.
     *
     * @param name a system argument name
     * @return true if system argument exists. Otherwise, false.
     */
    public boolean hasSystemArgument(String name) {
        return this.arguments.containsKey(name);
    }

    /**
     * Get system argument set
     *
     * @return system argument set
     */
    public Set<SystemArgument> getSystemArgumentSet() {
        return new HashSet<>(this.arguments.values());
    }

    /**
     * Get system argument name set
     *
     * @return system argument name set
     */
    public Set<String> getSystemArgumentNameSet() {
        return this.arguments.keySet();
    }

}
