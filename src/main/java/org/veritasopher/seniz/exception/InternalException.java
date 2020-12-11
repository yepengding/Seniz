package org.veritasopher.seniz.exception;

public class InternalException extends BaseException {

    public InternalException(String message) {
        super(message);
    }

    public InternalException(String message, Throwable cause) {
        super(message, cause);
    }

    public InternalException(int line, String message) {
        super(line, message);
    }

    public InternalException(int line, int col, String message) {
        super(line, col, message);
    }
}
