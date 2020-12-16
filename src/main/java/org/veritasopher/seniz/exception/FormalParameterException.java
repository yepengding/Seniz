package org.veritasopher.seniz.exception;

public class FormalParameterException extends BaseException {
    public FormalParameterException(String message) {
        super(message);
    }

    public FormalParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public FormalParameterException(int line, String message) {
        super(line, message);
    }

    public FormalParameterException(int line, int col, String message) {
        super(line, col, message);
    }
}
