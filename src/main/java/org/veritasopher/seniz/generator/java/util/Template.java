package org.veritasopher.seniz.generator.java.util;

/**
 * Java Template
 *
 * @author Yepeng Ding
 * @date 3/9/2022
 */
public class Template {

    /**
     * Generate Argument
     *
     * @param namespace Argument namespace
     * @param arguments argument enums
     * @return Argument program
     */
    public static String generateArgumentFromTemplate(
            String namespace,
            String arguments
    ) {
        return """
                package %s;
                import lombok.Getter;
                @Getter
                public enum Argument {
                %s;

                    private final String name;
                    private final Class<?> type;
                    private final Object value;

                    Argument(final String name, final Class<?> type, Object value) {
                        this.name = name;
                        this.type = type;
                        this.value = value;
                    }
                }
                """.formatted(namespace, arguments);
    }

    /**
     * Generate Variable
     *
     * @param namespace Variable namespace
     * @param variables variable enums
     * @return Variable program
     */
    public static String generateVariableFromTemplate(
            String namespace,
            String variables
    ) {
        return """
                package %s;
                import lombok.Getter;
                @Getter
                public enum Variable {
                %s;
                    private final String name;
                    private final Class<?> type;
                    Variable(final String name, final Class<?> type) {
                        this.name = name;
                        this.type = type;
                    }
                }
                """.formatted(namespace, variables);
    }

    /**
     * Generate Action
     *
     * @param namespace Action namespace
     * @param actions   action methods
     * @return Action program
     */
    public static String generateActionFromTemplate(
            String namespace,
            String actions
    ) {
        return """
                package %s;
                public interface Action {
                %s
                }
                """
                .formatted(namespace, actions);
    }

    /**
     * Generate State
     *
     * @param namespace        State namespace
     * @param stateProgramBody state program body
     * @return State program
     */
    public static String generateStateFromTemplate(
            String namespace,
            String importActionExecutor,
            String importStateBehavior,
            String importArgument,
            String importVariable,
            String stateProgramBody
    ) {
        return """
                package %s;
                %s
                %s
                %s
                %s
                import java.util.Map;
                public enum State implements StateBehavior {
                %s
                }
                """.formatted(
                namespace,
                importActionExecutor,
                importStateBehavior,
                importArgument,
                importVariable,
                stateProgramBody);
    }

    /**
     * Generate ActionExecutor
     *
     * @param namespace
     * @param importAction
     * @param importArgument
     * @param importVariable
     * @return ActionExecutor program
     */
    public static String generateActionExecutorFromTemplate(
            String namespace,
            String importAction,
            String importArgument,
            String importVariable) {
        return """
                package %s;
                %s
                %s
                %s
                import lombok.Setter;
                import java.util.Map;
                import java.util.Optional;
                public abstract class ActionExecutor implements Action {
                                
                    @Setter
                    private Map<Variable, Object> variableSet;
                                
                    protected <T> Optional<T> getArgument(Argument argument, Class<T> type) {
                        Object val = argument.getValue();
                        if (val != null) {
                            return Optional.of(type.cast(val));
                        }
                        return Optional.empty();
                    }
                                
                    protected <T> Optional<T> getVariable(Variable variable, Class<T> type) {
                        Object val = this.variableSet.get(variable);
                        if (val != null) {
                            return Optional.of(type.cast(val));
                        }
                        return Optional.empty();
                    }
                }
                """.formatted(namespace,
                importAction,
                importArgument,
                importVariable);
    }

    /**
     * Generate StateBehavior
     *
     * @param namespace
     * @param importState
     * @param importVariable
     * @return StateBehavior program
     */
    public static String generateStateBehaviorFromTemplate(
            String namespace,
            String importState,
            String importVariable
    ) {
        return """
                package %s;
                %s
                %s
                import java.util.Map;
                public interface StateBehavior {
                    void init(Map<Variable, Object> variableSet);
                    State next(ActionExecutor executor, Map<Variable, Object> variableSet);
                }
                """.formatted(
                namespace,
                importState,
                importVariable
        );
    }

    /**
     * Generate ActionEffect
     *
     * @param namespace
     * @param importActionExecutor
     * @param importArgument
     * @param importVariable
     * @param actionEffects
     * @return ActionEffect program
     */
    public static String generateActionEffectFromTemplate(
            String namespace,
            String importActionExecutor,
            String importArgument,
            String importVariable,
            String actionEffects
    ) {
        return """
                package %s;
                %s
                %s
                %s
                public class ActionEffect extends ActionExecutor {
                %s
                }
                """.formatted(
                namespace,
                importActionExecutor,
                importArgument,
                importVariable,
                actionEffects
        );
    }

    /**
     * Generate SystemExecutor
     *
     * @param namespace
     * @param importState
     * @param importVariable
     * @param initStateName
     * @return SystemExecutor program
     */
    public static String generateSystemExecutorFromTemplate(
            String namespace,
            String importState,
            String importVariable,
            String initStateName
    ) {
        return """
                package %s;
                %s
                %s
                import java.util.HashMap;
                import java.util.Map;
                public class SystemExecutor {
                    private final Map<Variable, Object> variableSet;
                    private final ActionEffect actionEffect;
                    public SystemExecutor() {
                        this.variableSet = new HashMap<>();
                        this.actionEffect = new ActionEffect();
                        this.actionEffect.setVariableSet(variableSet);
                    }
                    public void run() {
                        State state = State.%s;
                        while (state != null) {
                            state.init(variableSet);
                            state = state.next(actionEffect, variableSet);
                        }
                    }
                }
                """.formatted(
                namespace,
                importState,
                importVariable,
                initStateName
        );
    }
}
