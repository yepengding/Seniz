package org.veritasopher.seniz.exception;

public class TransitionException extends BaseException {

    public TransitionException(String message) {
        super(message);
    }

    public TransitionException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransitionException(int line, String message) {
        super(line, message);
    }

    public TransitionException(int line, int col, String message) {
        super(line, col, message);
    }
}
