package org.veritasopher.seniz.generator.java.ts;

import lombok.AllArgsConstructor;
import org.veritasopher.seniz.core.model.TransitionSystem;

import java.nio.file.Path;

import static org.veritasopher.seniz.generator.java.dict.SourceFile.*;
import static org.veritasopher.seniz.generator.java.util.Template.generateSyncFromTemplate;
import static org.veritasopher.seniz.generator.java.util.Template.generateSystemExecutorThreadFromTemplate;
import static org.veritasopher.seniz.generator.java.util.Transform.toJavaImport;
import static org.veritasopher.seniz.util.FileUtil.writeToFile;

/**
 * Java SDK Generation
 *
 * @author Yepeng Ding
 * @date 4/11/2022
 */
@AllArgsConstructor
public class SDKGeneration {

    private String globalNamespace;

    private String rootNamespace;

    private Path root;

    public void generate() {
        generateSystemExecutorThread();
        if (globalNamespace.equals(rootNamespace)) {
            // Only generate Sync file if no global system exists
            generateSync();
        }
    }

    /**
     * Generate Sync file
     */
    public void generateSync() {
        String program = generateSyncFromTemplate(
                SYNC.getNamespace(rootNamespace)
        );
        writeToFile(program, SYNC.getFilePath(root));
    }

    /**
     * Generate SystemExecutorThread file
     */
    public void generateSystemExecutorThread() {
        String program = generateSystemExecutorThreadFromTemplate(
                SYSTEM_EXECUTOR_THREAD.getNamespace(rootNamespace),
                toJavaImport(rootNamespace, ACTION_EFFECT, false),
                toJavaImport(rootNamespace, ARGUMENT, false),
                toJavaImport(rootNamespace, VARIABLE, false)
        );
        writeToFile(program, SYSTEM_EXECUTOR_THREAD.getFilePath(root));
    }

}
