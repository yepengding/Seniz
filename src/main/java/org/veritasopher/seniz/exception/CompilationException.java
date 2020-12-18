package org.veritasopher.seniz.exception;

public class CompilationException extends BaseException {
    public CompilationException(String message) {
        super(message);
    }

    public CompilationException(String message, Throwable cause) {
        super(message, cause);
    }

    public CompilationException(int line, String message) {
        super(line, message);
    }

    public CompilationException(int line, int col, String message) {
        super(line, col, message);
    }
}
