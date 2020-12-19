package org.veritasopher.seniz.exception;

public class StateException extends BaseException {

    public StateException(String source, String message) {
        super(source, message);
    }

    public StateException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public StateException(String source, int line, String message) {
        super(source, line, message);
    }

    public StateException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
