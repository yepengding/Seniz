package org.veritasopher.seniz.exception;

public class TypeException extends BaseException {

    public TypeException(String source, String message) {
        super(source, message);
    }

    public TypeException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public TypeException(String source, int line, String message) {
        super(source, line, message);
    }

    public TypeException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
