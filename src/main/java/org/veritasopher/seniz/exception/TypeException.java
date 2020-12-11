package org.veritasopher.seniz.exception;

public class TypeException extends BaseException {

    public TypeException(String message) {
        super(message);
    }

    public TypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TypeException(int line, String message) {
        super(line, message);
    }

    public TypeException(int line, int col, String message) {
        super(line, col, message);
    }
}
