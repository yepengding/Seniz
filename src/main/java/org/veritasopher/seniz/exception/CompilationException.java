package org.veritasopher.seniz.exception;

public class CompilationException extends BaseException {

    public CompilationException(String source, String message) {
        super(source, message);
    }

    public CompilationException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public CompilationException(String source, int line, String message) {
        super(source, line, message);
    }

    public CompilationException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
