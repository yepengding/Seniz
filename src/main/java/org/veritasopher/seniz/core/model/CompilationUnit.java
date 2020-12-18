package org.veritasopher.seniz.core.model;

import lombok.Data;

@Data
public class CompilationUnit {

    private String identifier;

    private TransitionSystem transitionSystem;

    private String systemParameter;

    private StateVariableSet stateVariableSet;

}
