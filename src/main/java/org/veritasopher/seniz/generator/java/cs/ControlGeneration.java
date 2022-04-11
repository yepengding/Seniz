package org.veritasopher.seniz.generator.java.cs;

import com.google.common.collect.Streams;
import org.veritasopher.seniz.core.model.ControlSystem;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.ControlStatement;
import org.veritasopher.seniz.exception.type.GeneratorException;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.veritasopher.seniz.generator.java.dict.SourceFile.*;
import static org.veritasopher.seniz.generator.java.util.Template.*;
import static org.veritasopher.seniz.generator.java.util.Transform.*;
import static org.veritasopher.seniz.util.FileUtil.writeToFile;

/**
 * Control Files Generation
 *
 * @author Yepeng Ding
 * @date 4/10/2022
 */
public record ControlGeneration(GlobalEnvironment env,
                                ControlSystem cs, String rootNamespace,
                                Path root) {

    public void generate() {
        generateArgument();
        generateGlobalVariable();
        generateSync();
        generateSystemExecutorThread();
        generateControlSystemExecutor();
    }

    /**
     * Generate system argument file
     */
    public void generateArgument() {
        String arguments = cs.getSystemArguments().stream()
                .map(arg -> "%s(\"%s\", %s)"
                        .formatted(toJavaArgumentName(arg.getName()),
                                arg.getName(),
                                toJavaTypeClass(arg.getPrimaryType())))
                .collect(Collectors.joining("," + System.lineSeparator()));

        String argumentProgram = generateArgumentFromTemplate(ARGUMENT.getNamespace(rootNamespace), arguments);

        writeToFile(argumentProgram, ARGUMENT.getFilePath(root));
    }

    /**
     * Generate GlobalVariable
     */
    public void generateGlobalVariable() {
        // State variables of a control system are global state variables of its transition systems.
        String globalVariables = cs.getStateVariables().getVariableSet().stream()
                .map(v -> "%s(\"%s\", %s)"
                        .formatted(toJavaVariableName(v.getName()),
                                v.getName(),
                                toJavaTypeClass(v.getPrimaryType())))
                .collect(Collectors.joining("," + System.lineSeparator()));

        String globalVariableProgram = generateGlobalVariableFromTemplate(GLOBAL_VARIABLE.getNamespace(rootNamespace), globalVariables);

        writeToFile(globalVariableProgram, GLOBAL_VARIABLE.getFilePath(root));
    }

    /**
     * Generate Sync
     */
    public void generateSync() {
        String program = generateSyncFromTemplate(SYNC.getNamespace(rootNamespace));
        writeToFile(program, SYNC.getFilePath(root));
    }

    /**
     * Generate SystemExecutorThread file
     */
    public void generateSystemExecutorThread() {
        String program = generateSystemExecutorThreadFromTemplate(
                SYSTEM_EXECUTOR_THREAD.getNamespace(rootNamespace)
        );
        writeToFile(program, SYSTEM_EXECUTOR_THREAD.getFilePath(root));
    }

    /**
     * Generate ControlSystemExecutor
     */
    public void generateControlSystemExecutor() {
        String program = generateControlSystemExecutorFromTemplate(
                CONTROL_SYSTEM_EXECUTOR.getNamespace(rootNamespace),
                toJavaImport(rootNamespace, ARGUMENT, false),
                toJavaImport(rootNamespace, ARGUMENT, true),
                toJavaImport(rootNamespace, GLOBAL_VARIABLE, false),
                toJavaImport(rootNamespace, GLOBAL_VARIABLE, true),
                toJavaImport(rootNamespace, SYSTEM_EXECUTOR_THREAD, false),
                generateInitControlVariable(),
                generateInitSystemExecutor(),
                generateInitCallable()
        );

        writeToFile(program, CONTROL_SYSTEM_EXECUTOR.getFilePath(root));
    }

    /**
     * Generate InitControlVariable
     *
     * @return InitControlVariable statement
     */
    private String generateInitControlVariable() {
        return cs.getStateVariableSet().stream()
                .map(v -> "gVarSet.put(%s, %s);".formatted(toJavaVariableName(v.getName()), toJavaEvaluation(cs, v.getEvaluation())))
                .collect(Collectors.joining(System.lineSeparator()));
    }

    /**
     * Generate InitSystemExecutor
     *
     * @return InitSystemExecutor statement
     */
    private String generateInitSystemExecutor() {
        Map<String, String> subSystemNamespaceMap = new HashMap<>();
        cs.getControlStatement().getSubsystems()
                .forEach(sys -> subSystemNamespaceMap.put(sys.alias(), "%s.%s".formatted(rootNamespace, sys.identifier().toLowerCase())));

        return cs.getControlStatement().getSubsystems().stream()
                .map(sys -> """
                        ConcurrentMap<%1$s.Argument, Object> %2$sArgSet = new ConcurrentHashMap<>();
                        %3$s
                        %4$s.SystemExecutor %2$s = new %4$s.SystemExecutor("%2$s", %2$sArgSet, gVarSet);
                        """.formatted(
                        ARGUMENT.getNamespace(subSystemNamespaceMap.get(sys.alias())),
                        sys.alias(),
                        generateInitArg(sys.alias()),
                        SYSTEM_EXECUTOR.getNamespace(subSystemNamespaceMap.get(sys.alias()))
                ))
                .collect(Collectors.joining(System.lineSeparator()));
    }

    private String generateInitArg(String alias) {
        ControlStatement.SubSystem subSystem = cs.getControlStatement().getSubsystemByAlias(alias).orElseThrow(() ->
                new GeneratorException("Subsystem with alias (%s) is undefined.".formatted(alias)));
        TransitionSystem ts = env.getTransitionSystem(subSystem.identifier()).orElseThrow(() ->
                new GeneratorException("System (%s) is undefined.".formatted(subSystem.identifier())));

        return Streams.zip(ts.getSystemArguments().stream(), subSystem.argEvaluations().stream(), (arg, eval) ->
                        "%sArgSet.put(%s, %s);".formatted(
                                alias,
                                "%s.Argument.%s".formatted(
                                        ARGUMENT.getNamespace("%s.%s".formatted(rootNamespace, subSystem.identifier().toLowerCase())),
                                        toJavaArgumentName(arg.getName())
                                ),
                                toJavaEvaluation(ts, eval)
                        ))
                .collect(Collectors.joining(System.lineSeparator()));
    }

    /**
     * Generate InitCallable
     *
     * @return InitCallable statement
     */
    private String generateInitCallable() {
        return cs.getControlStatement().getSubsystemAliasList().stream()
                .map("callables.add(%s);"::formatted)
                .collect(Collectors.joining(System.lineSeparator()));
    }

}
