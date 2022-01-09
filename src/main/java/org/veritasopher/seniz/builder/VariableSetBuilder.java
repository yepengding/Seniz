package org.veritasopher.seniz.builder;

import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.model.StateVariableSet;
import org.veritasopher.seniz.core.model.SystemVariableSet;
import org.veritasopher.seniz.core.model.common.StateVariable;
import org.veritasopher.seniz.exception.StateVariableException;

/**
 * Variable Set Builder
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class VariableSetBuilder {

    /**
     * Build variable set for TS with var set
     *
     * @param stateVariableSet defined variable set
     * @param tree             parse tree
     * @return built variable set
     */
    public StateVariableSet build(StateVariableSet stateVariableSet, ParseTree tree) {
        if (stateVariableSet == null) {
            stateVariableSet = new StateVariableSet();
        }
        // TODO may allow defining variable in system body
        return stateVariableSet;
    }

    /**
     * Build variable set for single TS
     *
     * @param stateVariableSet defined variable set
     * @param tree             parse tree
     * @return built variable set
     */
    public StateVariableSet build(StateVariableSet stateVariableSet, SystemVariableSet systemVariableSet, ParseTree tree) {
        if (stateVariableSet == null) {
            return new StateVariableSet();
        }
        for (StateVariable var :
                stateVariableSet.getVariableSet()) {
            if (systemVariableSet.hasVariable(var.getName())) {
                throw new StateVariableException(stateVariableSet.getIdentifier(), "Cannot use occupied system variable name (" + var.getName() + ").");
            }
        }
        return stateVariableSet;
    }
}
