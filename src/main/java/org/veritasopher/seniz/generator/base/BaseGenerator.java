package org.veritasopher.seniz.generator.base;

import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.exception.type.GeneratorException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Base Generator
 *
 * @author Yepeng Ding
 * @date 3/7/2022
 */
public abstract class BaseGenerator {

    protected final GlobalEnvironment env;
    protected final TransitionSystem ts;

    public BaseGenerator(GlobalEnvironment globalEnvironment, TransitionSystem transitionSystem) {
        this.env = globalEnvironment;
        this.ts = transitionSystem;
    }

    /**
     * Initialize a given directory path (create it if not exists)
     *
     * @param path directory path
     */
    protected void initDir(Path path) {
        try {
            Files.createDirectories(path);
        } catch (IOException e) {
            e.printStackTrace();
            throw new GeneratorException(ts.getIdentifier(), String.format("Cannot create path (%s).", path));
        }
    }

    protected void writeToFile(String content, Path pathToFile) {
        try {
            Files.createDirectories(pathToFile.getParent());

            Files.writeString(pathToFile, content);

            // Test writing
            String fileContent = Files.readString(pathToFile);
            System.out.println(fileContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
