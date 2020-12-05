package org.veritasopher.seniz.core.model;

import lombok.Data;

import java.util.Set;

@Data
public class CompilationUnit {

    private Set<String> dependencies;

    private TransitionSystem transitionSystem;

    private String systemParameter;

    private VariableSet variableSet;

}
