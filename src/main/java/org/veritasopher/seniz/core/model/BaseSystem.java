package org.veritasopher.seniz.core.model;

import lombok.Getter;
import lombok.Setter;
import org.veritasopher.seniz.core.model.common.StateVariable;
import org.veritasopher.seniz.core.model.common.SystemArgument;
import org.veritasopher.seniz.exception.type.InternalException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Base System
 *
 * @author Yepeng Ding
 * @date 3/11/2022
 */
@Getter
public abstract class BaseSystem {

    // System identifier
    protected final String identifier;

    // Dependent variable set name
    @Setter
    protected String dependentVariableSetName;

    // Global (Shared) variable set name
    @Setter
    protected String globalVariableSetName;

    // System Argument list
    protected final List<SystemArgument> systemArguments;

    // State variable set
    @Setter
    protected VariableSet stateVariables;

    // Global (Shared) state variable set
    @Setter
    protected VariableSet globalStateVariables;

    public BaseSystem(String identifier) {
        this.identifier = identifier;
        this.systemArguments = new ArrayList<>();

        this.stateVariables = new VariableSet();
        this.globalStateVariables = new VariableSet();
    }

    /**
     * Add a system argument
     *
     * @param systemArgument system argument
     */
    public void addSystemArgument(SystemArgument systemArgument) {
        this.systemArguments.add(systemArgument);
    }

    /**
     * Get a system argument by name
     *
     * @param name system argument name
     * @return either a system argument or null
     */
    public Optional<SystemArgument> getSystemArgument(String name) {
        return this.systemArguments.stream().filter(arg -> arg.getName().equals(name)).findAny();
    }

    /**
     * Get system argument name set
     *
     * @return system argument name set
     */
    public Set<String> getSystemArgumentNameSet() {
        return this.systemArguments.stream().map(SystemArgument::getName).collect(Collectors.toSet());
    }


    /**
     * Look up if system argument exists.
     *
     * @param name a system argument name
     * @return true if system argument exists. Otherwise, false.
     */
    public boolean hasSystemArgument(String name) {
        return this.systemArguments.stream().anyMatch(arg -> arg.getName().equals(name));
    }

    /**
     * Get a state variable by name
     *
     * @param name state variable name
     * @return either a state variable or null
     */
    public Optional<StateVariable> getStateVariable(String name) {
        return Optional.ofNullable(this.stateVariables.getVariable(name));
    }

    /**
     * Update the evaluation of a state variable
     *
     * @param stateVariable new state variable
     */
    public void updateStateVariable(StateVariable stateVariable) {
        this.getStateVariable(stateVariable.getName()).orElseThrow(() ->
                        new InternalException("Cannot update the evaluation of undefined variable (%s)".formatted(stateVariable.getName()))).
                setEvaluation(stateVariable.getEvaluation());
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
     * Get a global state variable
     *
     * @param name global state variable name
     * @return either a global state variable or null
     */
    public Optional<StateVariable> getGlobalStateVariable(String name) {
        return Optional.ofNullable(this.globalStateVariables.getVariable(name));
    }
}
