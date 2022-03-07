package org.veritasopher.seniz.exception;


public class GeneratorException extends BaseException {
    public GeneratorException(String source, String message) {
        super(source, message);
    }

    public GeneratorException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public GeneratorException(String source, int line, String message) {
        super(source, line, message);
    }

    public GeneratorException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
