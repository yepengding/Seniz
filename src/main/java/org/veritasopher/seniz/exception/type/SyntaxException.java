package org.veritasopher.seniz.exception.type;

import org.veritasopher.seniz.exception.BaseException;

public class SyntaxException extends BaseException {
    public SyntaxException(String source, String message) {
        super(source, message);
    }

    public SyntaxException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public SyntaxException(String source, int line, String message) {
        super(source, line, message);
    }

    public SyntaxException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
