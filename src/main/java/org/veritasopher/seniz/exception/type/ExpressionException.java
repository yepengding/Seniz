package org.veritasopher.seniz.exception.type;

import org.veritasopher.seniz.exception.BaseException;

public class ExpressionException extends BaseException {

    public ExpressionException(String source, String message) {
        super(source, message);
    }

    public ExpressionException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public ExpressionException(String source, int line, String message) {
        super(source, line, message);
    }

    public ExpressionException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
