package org.veritasopher.seniz.generator.java.ts;

import java.nio.file.Path;

import static org.veritasopher.seniz.generator.java.dict.SourceFile.*;
import static org.veritasopher.seniz.generator.java.util.Template.*;
import static org.veritasopher.seniz.generator.java.util.Transform.*;
import static org.veritasopher.seniz.util.FileUtil.writeToFile;

/**
 * Java Base Package Generation
 *
 * @author Yepeng Ding
 * @date 4/10/2022
 */
public record BaseGeneration(String globalNamespace, String rootNamespace,
                             Path root) {

    public void generate() {
        generateActionExecutor();
        generateStateBehavior();
    }

    /**
     * Generate ActionExecutor file
     */
    public void generateActionExecutor() {
        String program = generateActionExecutorFromTemplate(
                ACTION_EXECUTOR.getNamespace(rootNamespace),
                toJavaImport(rootNamespace, ACTION, false),
                toJavaImport(rootNamespace, ARGUMENT, false),
                toJavaImport(rootNamespace, VARIABLE, false)
        );
        writeToFile(program, ACTION_EXECUTOR.getFilePath(root));
    }

    /**
     * Generate StateBehavior file
     */
    public void generateStateBehavior() {
        String program = generateStateBehaviorFromTemplate(
                STATE_BEHAVIOR.getNamespace(rootNamespace),
                toJavaImport(rootNamespace, STATE, false),
                toJavaImport(rootNamespace, ARGUMENT, false),
                toJavaImport(rootNamespace, VARIABLE, false),
                toJavaImport(globalNamespace, GLOBAL_VARIABLE, false)
        );
        writeToFile(program, STATE_BEHAVIOR.getFilePath(root));
    }

}
