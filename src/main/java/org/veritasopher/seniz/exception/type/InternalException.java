package org.veritasopher.seniz.exception.type;

import org.veritasopher.seniz.exception.BaseException;

public class InternalException extends BaseException {

    public InternalException(String source, String message) {
        super(source, message);
    }

    public InternalException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public InternalException(String source, int line, String message) {
        super(source, line, message);
    }

    public InternalException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
