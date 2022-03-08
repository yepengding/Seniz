package org.veritasopher.seniz.exception.type;

import org.veritasopher.seniz.exception.BaseException;

public class BuilderException extends BaseException {
    public BuilderException(String source, String message) {
        super(source, message);
    }

    public BuilderException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public BuilderException(String source, int line, String message) {
        super(source, line, message);
    }

    public BuilderException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
