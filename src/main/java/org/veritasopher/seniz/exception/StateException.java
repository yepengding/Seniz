package org.veritasopher.seniz.exception;

public class StateException extends BaseException {

    public StateException(String message) {
        super(message);
    }

    public StateException(String message, Throwable cause) {
        super(message, cause);
    }

    public StateException(int line, String message) {
        super(line, message);
    }
}
