package org.veritasopher.seniz.exception;

public class PrecompileException extends BaseException {
    public PrecompileException(String message) {
        super(message);
    }

    public PrecompileException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrecompileException(int line, String message) {
        super(line, message);
    }

    public PrecompileException(int line, int col, String message) {
        super(line, col, message);
    }
}
