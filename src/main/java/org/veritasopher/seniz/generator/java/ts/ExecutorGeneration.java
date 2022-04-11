package org.veritasopher.seniz.generator.java.ts;

import lombok.AllArgsConstructor;
import org.veritasopher.seniz.core.model.TransitionSystem;

import java.nio.file.Path;
import java.util.stream.Collectors;

import static org.veritasopher.seniz.generator.java.dict.SourceFile.*;
import static org.veritasopher.seniz.generator.java.util.Template.generateActionEffectFromTemplate;
import static org.veritasopher.seniz.generator.java.util.Template.generateSystemExecutorFromTemplate;
import static org.veritasopher.seniz.generator.java.util.Transform.toJavaImport;
import static org.veritasopher.seniz.generator.java.util.Transform.toJavaStateName;
import static org.veritasopher.seniz.util.FileUtil.writeToFile;

/**
 * Java Executor Generation
 *
 * @author Yepeng Ding
 * @date 4/10/2022
 */
public record ExecutorGeneration(TransitionSystem ts,
                                 String globalNamespace, String rootNamespace,
                                 Path root) {

    public void generate() {
        generateActionEffect();
        generateSystemExecutor();
    }

    /**
     * Generate ActionEffect file
     */
    public void generateActionEffect() {
        String actionEffects = ts.getActionSet().stream()
                .filter(action -> !action.isEpsilon())
                .map(a -> """
                        @Override
                        public void %s() {
                                                
                        }
                        """.formatted(a.getName()))
                .collect(Collectors.joining(System.lineSeparator()));
        String program = generateActionEffectFromTemplate(
                ACTION_EFFECT.getNamespace(rootNamespace),
                toJavaImport(rootNamespace, ACTION_EXECUTOR, false),
                toJavaImport(rootNamespace, ARGUMENT, true),
                toJavaImport(rootNamespace, VARIABLE, true),
                actionEffects
        );
        writeToFile(program, ACTION_EFFECT.getFilePath(root));
    }

    /**
     * Generate SystemExecutor file
     */
    public void generateSystemExecutor() {
        String program = generateSystemExecutorFromTemplate(
                SYSTEM_EXECUTOR.getNamespace(rootNamespace),
                toJavaImport(rootNamespace, STATE, false),
                toJavaImport(rootNamespace, ARGUMENT, false),
                toJavaImport(rootNamespace, VARIABLE, false),
                toJavaImport(globalNamespace, GLOBAL_VARIABLE, false),
                toJavaImport(globalNamespace, SYNC, false),
                toJavaImport(globalNamespace, SYSTEM_EXECUTOR_THREAD, false),
                toJavaStateName(ts.getInitState())
        );
        writeToFile(program, SYSTEM_EXECUTOR.getFilePath(root));
    }

}
