package org.veritasopher.seniz.generator.java.ts;

import java.nio.file.Path;

import static org.veritasopher.seniz.generator.java.dict.SourceFile.SYNC;
import static org.veritasopher.seniz.generator.java.dict.SourceFile.SYSTEM_EXECUTOR_THREAD;
import static org.veritasopher.seniz.generator.java.util.Template.generateSyncFromTemplate;
import static org.veritasopher.seniz.generator.java.util.Template.generateSystemExecutorThreadFromTemplate;
import static org.veritasopher.seniz.util.FileUtil.writeToFile;

/**
 * Java SDK Generation
 *
 * @author Yepeng Ding
 * @date 4/11/2022
 */
public record SDKGeneration(String globalNamespace, String rootNamespace, Path root) {

    public void generate() {
        if (globalNamespace.equals(rootNamespace)) {
            // Only generate SDK files if no global system exists
            generateSync();
            generateSystemExecutorThread();
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
                SYSTEM_EXECUTOR_THREAD.getNamespace(rootNamespace)
        );
        writeToFile(program, SYSTEM_EXECUTOR_THREAD.getFilePath(root));
    }

}
