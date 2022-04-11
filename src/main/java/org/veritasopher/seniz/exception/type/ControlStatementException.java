package org.veritasopher.seniz.exception.type;

import org.veritasopher.seniz.exception.BaseException;

public class ControlStatementException extends BaseException {

    public ControlStatementException(String message) {
        super(message);
    }

    public ControlStatementException(String source, String message) {
        super(source, message);
    }

    public ControlStatementException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public ControlStatementException(String source, int line, String message) {
        super(source, line, message);
    }

    public ControlStatementException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
