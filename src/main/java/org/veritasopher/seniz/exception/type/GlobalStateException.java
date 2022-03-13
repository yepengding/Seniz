package org.veritasopher.seniz.exception.type;

import org.veritasopher.seniz.exception.BaseException;

public class GlobalStateException extends BaseException {
    public GlobalStateException(String message) {
        super(message);
    }

    public GlobalStateException(String source, String message) {
        super(source, message);
    }

    public GlobalStateException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public GlobalStateException(String source, int line, String message) {
        super(source, line, message);
    }

    public GlobalStateException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
