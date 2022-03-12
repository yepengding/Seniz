package org.veritasopher.seniz.builder;

import org.veritasopher.seniz.core.model.ControlSystem;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.VariableSet;
import org.veritasopher.seniz.core.model.common.StateVariable;
import org.veritasopher.seniz.exception.type.StateVariableException;

/**
 * Variable Set Builder
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class VariableSetBuilder {

    /**
     * Build variable set for the given transition system
     *
     * @param transitionSystem transition system
     * @param variableSet      defined variable set
     * @return built variable set
     */
    public VariableSet build(TransitionSystem transitionSystem, VariableSet variableSet) {
        for (StateVariable var :
                variableSet.getVariableSet()) {
            if (transitionSystem.hasSystemArgument(var.getName())) {
                throw new StateVariableException(variableSet.getIdentifier(), "Cannot use occupied system argument name (" + var.getName() + ").");
            }
        }
        return variableSet;
    }

    /**
     * Build variable set for the given control system
     *
     * @param controlSystem control system
     * @param variableSet   defined variable set
     * @return built variable set
     */
    public VariableSet build(ControlSystem controlSystem, VariableSet variableSet) {
        for (StateVariable var :
                variableSet.getVariableSet()) {
            if (controlSystem.hasSystemArgument(var.getName())) {
                throw new StateVariableException(variableSet.getIdentifier(), "Cannot use occupied system argument name (" + var.getName() + ").");
            }
        }
        return variableSet;
    }
}
