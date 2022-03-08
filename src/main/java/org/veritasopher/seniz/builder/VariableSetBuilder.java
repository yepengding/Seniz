package org.veritasopher.seniz.builder;

import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.model.SystemArgumentSet;
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
     * Build variable set for TS with var set
     *
     * @param variableSet defined variable set
     * @param tree        parse tree
     * @return built variable set
     */
    public VariableSet build(VariableSet variableSet, ParseTree tree) {
        if (variableSet == null) {
            variableSet = new VariableSet();
        }
        // TODO may allow defining variable in system body
        return variableSet;
    }

    /**
     * Build variable set for single TS
     *
     * @param variableSet defined variable set
     * @param tree             parse tree
     * @return built variable set
     */
    public VariableSet build(VariableSet variableSet, SystemArgumentSet systemArgumentSet, ParseTree tree) {
        if (variableSet == null) {
            return new VariableSet();
        }
        for (StateVariable var :
                variableSet.getVariableSet()) {
            if (systemArgumentSet.hasArgument(var.getName())) {
                throw new StateVariableException(variableSet.getIdentifier(), "Cannot use occupied system argument name (" + var.getName() + ").");
            }
        }
        return variableSet;
    }
}
