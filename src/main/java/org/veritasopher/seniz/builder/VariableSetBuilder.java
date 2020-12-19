package org.veritasopher.seniz.builder;

import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.model.StateVariableSet;

/**
 * Variable Set Builder
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class VariableSetBuilder {

    /**
     * Build variable set
     *
     * @param stateVariableSet defined variable set
     * @param tree parse tree
     * @return built variable set
     */
    public StateVariableSet build(StateVariableSet stateVariableSet, ParseTree tree) {
        if (stateVariableSet == null) {
            stateVariableSet = new StateVariableSet();
        }
        // TODO may allow defining variable in system body
        return stateVariableSet;
    }
}
