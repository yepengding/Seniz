package org.veritasopher.seniz.exception.type;

import org.veritasopher.seniz.exception.BaseException;

public class PrecompileException extends BaseException {

    public PrecompileException(String message) {
        super(message);
    }

    public PrecompileException(String source, String message) {
        super(source, message);
    }

    public PrecompileException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public PrecompileException(String source, int line, String message) {
        super(source, line, message);
    }

    public PrecompileException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
