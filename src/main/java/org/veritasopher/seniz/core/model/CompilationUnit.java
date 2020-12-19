package org.veritasopher.seniz.core.model;

import lombok.Data;

/**
 * Compilation Unit
 *
 * @author Yepeng Ding
 * @date 12/19/2020
 */
@Data
public class CompilationUnit {

    private String identifier;

    private String systemParameter;

    private TransitionSystem transitionSystem;

    private StateVariableSet stateVariableSet;

}
