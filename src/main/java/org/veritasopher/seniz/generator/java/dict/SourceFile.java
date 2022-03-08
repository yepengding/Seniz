package org.veritasopher.seniz.generator.java.dict;

import java.io.File;
import java.nio.file.Path;

/**
 * Source File Enum for Java Program Generation
 *
 * @author Yepeng Ding
 * @date 3/7/2022
 */
public enum SourceFile {

    ACTION("Action.java") {
        @Override
        public Path getFilePath(Path rootPath) {
            return Path.of(rootPath.toAbsolutePath() + File.separator + "core" + File.separator + getFilename());
        }

        @Override
        public String getNamespace(String rootNamespace) {
            return "%s.core".formatted(rootNamespace);
        }
    },

    VARIABLE("Variable.java") {
        @Override
        public Path getFilePath(Path rootPath) {
            return Path.of(rootPath.toAbsolutePath() + File.separator + "core" + File.separator + getFilename());
        }

        @Override
        public String getNamespace(String rootNamespace) {
            return "%s.core".formatted(rootNamespace);
        }
    },

    STATE("State.java") {
        @Override
        public Path getFilePath(Path rootPath) {
            return Path.of(rootPath.toAbsolutePath() + File.separator + "core" + File.separator + getFilename());
        }

        @Override
        public String getNamespace(String rootNamespace) {
            return "%s.core".formatted(rootNamespace);
        }
    };

    private final String filename;

    SourceFile(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    /**
     * Get a file path
     *
     * @param rootPath root path
     * @return file path
     */
    public abstract Path getFilePath(Path rootPath);

    /**
     * Get namespace
     *
     * @param rootNamespace root namespace
     * @return namespace
     */
    public abstract String getNamespace(String rootNamespace);

}
