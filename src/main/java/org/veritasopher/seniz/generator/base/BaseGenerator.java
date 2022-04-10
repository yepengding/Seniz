package org.veritasopher.seniz.generator.base;

import org.veritasopher.seniz.core.model.GlobalEnvironment;
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

    // Main system identifier
    protected final String systemIdentifier;

    /**
     * Constructor with main system identifier
     *
     * @param globalEnvironment global environment
     */
    public BaseGenerator(GlobalEnvironment globalEnvironment) {
        this.env = globalEnvironment;
        this.systemIdentifier = env.getMainSystemIdentifier();
    }

    /**
     * Constructor with assigned system identifier
     *
     * @param globalEnvironment global environment
     * @param systemIdentifier  system identifier
     */
    public BaseGenerator(GlobalEnvironment globalEnvironment, String systemIdentifier) {
        this.env = globalEnvironment;
        this.systemIdentifier = systemIdentifier;
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
            throw new GeneratorException(systemIdentifier, String.format("Cannot create path (%s).", path));
        }
    }

}
