package org.veritasopher.seniz.exception;

public class ExpressionException extends BaseException {
    public ExpressionException(String message) {
        super(message);
    }

    public ExpressionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExpressionException(int line, String message) {
        super(line, message);
    }

    public ExpressionException(int line, int col, String message) {
        super(line, col, message);
    }
}
