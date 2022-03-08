package org.veritasopher.seniz.exception.type;

import org.veritasopher.seniz.exception.BaseException;

public class FormalParameterException extends BaseException {

    public FormalParameterException(String source, String message) {
        super(source, message);
    }

    public FormalParameterException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public FormalParameterException(String source, int line, String message) {
        super(source, line, message);
    }

    public FormalParameterException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
