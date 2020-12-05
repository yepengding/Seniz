package org.veritasopher.seniz.builder;

import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.model.VariableSet;

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
     * @param variableSet defined variable set
     * @param tree parse tree
     * @return built variable set
     */
    public VariableSet build(VariableSet variableSet, ParseTree tree) {
        // TODO may allow defining variable in system body
        return variableSet;
    }
}
