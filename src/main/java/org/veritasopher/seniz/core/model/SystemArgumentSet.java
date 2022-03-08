package org.veritasopher.seniz.core.model;

import org.veritasopher.seniz.core.model.common.SystemArgument;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * System Argument Set
 *
 * @author Yepeng Ding
 * @date 12/16/2020
 */
public class SystemArgumentSet {

    // Argument map <Name, System Argument>
    private final Map<String, SystemArgument> arguments;

    public SystemArgumentSet() {
        this.arguments = new HashMap<>();
    }

    /**
     * Add a system argument
     *
     * @param systemArgument system argument
     */
    public void addArgument(SystemArgument systemArgument) {
        this.arguments.put(systemArgument.getName(), systemArgument);
    }

    /**
     * Get a system argument by name
     *
     * @param name argument name
     * @return system argument
     */
    public SystemArgument getArgument(String name) {
        return this.arguments.get(name);
    }

    /**
     * Get the set of system arguments
     *
     * @return set of system arguments
     */
    public Set<SystemArgument> getArgumentSet() {
        return new HashSet<>(this.arguments.values());
    }

    /**
     * Look up if argument exists.
     *
     * @param name argument name
     * @return true if state exists. Otherwise, false.
     */
    public boolean hasArgument(String name) {
        return this.arguments.containsKey(name);
    }
}
