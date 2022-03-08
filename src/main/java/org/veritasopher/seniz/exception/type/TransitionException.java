package org.veritasopher.seniz.exception.type;

import org.veritasopher.seniz.exception.BaseException;

public class TransitionException extends BaseException {

    public TransitionException(String source, String message) {
        super(source, message);
    }

    public TransitionException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public TransitionException(String source, int line, String message) {
        super(source, line, message);
    }

    public TransitionException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
