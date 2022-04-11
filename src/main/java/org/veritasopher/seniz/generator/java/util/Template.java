package org.veritasopher.seniz.generator.java.util;

import static org.veritasopher.seniz.util.FileUtil.readFromFileInResource;

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
        return readFromFileInResource("template/core/Argument").formatted(
                namespace,
                arguments);
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
        return readFromFileInResource("template/core/Variable").formatted(
                namespace,
                variables);
    }

    /**
     * Generate GlobalVariable
     *
     * @param namespace
     * @param globalVariables
     * @return GlobalVariable program
     */
    public static String generateGlobalVariableFromTemplate(
            String namespace,
            String globalVariables
    ) {
        return readFromFileInResource("template/core/GlobalVariable").formatted(
                namespace,
                globalVariables);
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
        return readFromFileInResource("template/core/Action").formatted(
                namespace,
                actions);
    }

    /**
     * Generate State
     *
     * @param namespace
     * @param importActionExecutor
     * @param importStateBehavior
     * @param importArgument
     * @param importVariable
     * @param importGlobalVariable
     * @param importGlobalVariableStatic
     * @param stateProgramBody
     * @return State program
     */
    public static String generateStateFromTemplate(
            String namespace,
            String importActionExecutor,
            String importStateBehavior,
            String importArgument,
            String importVariable,
            String importGlobalVariable,
            String importGlobalVariableStatic,
            String stateProgramBody
    ) {
        return readFromFileInResource("template/core/State").formatted(
                namespace,
                importActionExecutor,
                importStateBehavior,
                importArgument,
                importVariable,
                importGlobalVariable,
                importGlobalVariableStatic,
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
        return readFromFileInResource("template/base/ActionExecutor").formatted(namespace,
                importAction,
                importArgument,
                importVariable);
    }

    /**
     * Generate StateBehavior
     *
     * @param namespace
     * @param importState
     * @param importArgument
     * @param importVariable
     * @param importGlobalVariable
     * @return
     */
    public static String generateStateBehaviorFromTemplate(
            String namespace,
            String importState,
            String importArgument,
            String importVariable,
            String importGlobalVariable
    ) {
        return readFromFileInResource("template/base/StateBehavior").formatted(
                namespace,
                importState,
                importArgument,
                importVariable,
                importGlobalVariable
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
        return readFromFileInResource("template/ActionEffect").formatted(
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
     * @param importArgument
     * @param importVariable
     * @param importGlobalVariable
     * @param importSync
     * @param importSystemExecutorThread
     * @param initStateName
     * @return SystemExecutor program
     */
    public static String generateSystemExecutorFromTemplate(
            String namespace,
            String importState,
            String importArgument,
            String importVariable,
            String importGlobalVariable,
            String importSync,
            String importSystemExecutorThread,
            String initStateName
    ) {
        return readFromFileInResource("template/SystemExecutor").formatted(
                namespace,
                importState,
                importArgument,
                importVariable,
                importGlobalVariable,
                importSync,
                importSystemExecutorThread,
                initStateName
        );
    }

    /**
     * Generate Sync
     *
     * @param namespace
     * @return Sync program
     */
    public static String generateSyncFromTemplate(
            String namespace
    ) {
        return readFromFileInResource("template/sdk/Sync").formatted(
                namespace
        );
    }

    /**
     * Generate SystemExecutorThread
     *
     * @param namespace
     * @return SystemExecutorThread program
     */
    public static String generateSystemExecutorThreadFromTemplate(
            String namespace
    ) {
        return readFromFileInResource("template/sdk/SystemExecutorThread").formatted(
                namespace
        );
    }

    /**
     * Generate ControlSystemExecutor
     *
     * @param namespace
     * @param importArgument
     * @param importArgumentStatic
     * @param importGlobalVariable
     * @param importGlobalVariableStatic
     * @param importSystemExecutorThread
     * @param initControlVariable
     * @param initSystemExecutor
     * @param initCallables
     * @return ControlSystemExecutor program
     */
    public static String generateControlSystemExecutorFromTemplate(
            String namespace,
            String importArgument,
            String importArgumentStatic,
            String importGlobalVariable,
            String importGlobalVariableStatic,
            String importSystemExecutorThread,
            String initControlVariable,
            String initSystemExecutor,
            String initCallables
    ) {
        return readFromFileInResource("template/ControlSystemExecutor").formatted(
                namespace,
                importArgument,
                importArgumentStatic,
                importGlobalVariable,
                importGlobalVariableStatic,
                importSystemExecutorThread,
                initControlVariable,
                initSystemExecutor,
                initCallables
        );
    }
}
