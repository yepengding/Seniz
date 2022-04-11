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

    ACTION("Action") {
        @Override
        public Path getFilePath(Path rootPath) {
            return Path.of(rootPath.toAbsolutePath() + File.separator + "core" + File.separator + getFilename());
        }

        @Override
        public String getNamespace(String rootNamespace) {
            return "%s.core".formatted(rootNamespace);
        }
    },

    ARGUMENT("Argument") {
        @Override
        public Path getFilePath(Path rootPath) {
            return Path.of(rootPath.toAbsolutePath() + File.separator + "core" + File.separator + getFilename());
        }

        @Override
        public String getNamespace(String rootNamespace) {
            return "%s.core".formatted(rootNamespace);
        }
    },

    VARIABLE("Variable") {
        @Override
        public Path getFilePath(Path rootPath) {
            return Path.of(rootPath.toAbsolutePath() + File.separator + "core" + File.separator + getFilename());
        }

        @Override
        public String getNamespace(String rootNamespace) {
            return "%s.core".formatted(rootNamespace);
        }
    },

    GLOBAL_VARIABLE("GlobalVariable") {
        @Override
        public Path getFilePath(Path rootPath) {
            return Path.of(rootPath.toAbsolutePath() + File.separator + "core" + File.separator + getFilename());
        }

        @Override
        public String getNamespace(String rootNamespace) {
            return "%s.core".formatted(rootNamespace);
        }
    },

    STATE("State") {
        @Override
        public Path getFilePath(Path rootPath) {
            return Path.of(rootPath.toAbsolutePath() + File.separator + "core" + File.separator + getFilename());
        }

        @Override
        public String getNamespace(String rootNamespace) {
            return "%s.core".formatted(rootNamespace);
        }
    },

    ACTION_EXECUTOR("ActionExecutor") {
        @Override
        public Path getFilePath(Path rootPath) {
            return Path.of(rootPath.toAbsolutePath() + File.separator + "base" + File.separator + getFilename());
        }

        @Override
        public String getNamespace(String rootNamespace) {
            return "%s.base".formatted(rootNamespace);
        }
    },

    STATE_BEHAVIOR("StateBehavior") {
        @Override
        public Path getFilePath(Path rootPath) {
            return Path.of(rootPath.toAbsolutePath() + File.separator + "base" + File.separator + getFilename());
        }

        @Override
        public String getNamespace(String rootNamespace) {
            return "%s.base".formatted(rootNamespace);
        }
    },

    ACTION_EFFECT("ActionEffect") {
        @Override
        public Path getFilePath(Path rootPath) {
            return Path.of(rootPath.toAbsolutePath() + File.separator + getFilename());
        }

        @Override
        public String getNamespace(String rootNamespace) {
            return "%s".formatted(rootNamespace);
        }
    },

    SYSTEM_EXECUTOR("SystemExecutor") {
        @Override
        public Path getFilePath(Path rootPath) {
            return Path.of(rootPath.toAbsolutePath() + File.separator + getFilename());
        }

        @Override
        public String getNamespace(String rootNamespace) {
            return "%s".formatted(rootNamespace);
        }
    },

    CONTROL_SYSTEM_EXECUTOR("ControlSystemExecutor") {
        @Override
        public Path getFilePath(Path rootPath) {
            return Path.of(rootPath.toAbsolutePath() + File.separator + getFilename());
        }

        @Override
        public String getNamespace(String rootNamespace) {
            return "%s".formatted(rootNamespace);
        }
    },

    SYNC("Sync") {
        @Override
        public Path getFilePath(Path rootPath) {
            return Path.of(rootPath.toAbsolutePath() + File.separator + "sdk" + File.separator + getFilename());
        }

        @Override
        public String getNamespace(String rootNamespace) {
            return "%s.sdk".formatted(rootNamespace);
        }
    },

    SYSTEM_EXECUTOR_THREAD("SystemExecutorThread") {
        @Override
        public Path getFilePath(Path rootPath) {
            return Path.of(rootPath.toAbsolutePath() + File.separator + "sdk" + File.separator + getFilename());
        }

        @Override
        public String getNamespace(String rootNamespace) {
            return "%s.sdk".formatted(rootNamespace);
        }
    };

    private final String name;

    SourceFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    public String getFilename() {
        return getName() + ".java";
    }

}
