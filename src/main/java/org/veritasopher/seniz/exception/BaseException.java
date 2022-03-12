package org.veritasopher.seniz.exception;

/**
 * Base Exception
 *
 * @author Yepeng Ding
 * @date 12/2/2020
 */
public class BaseException extends RuntimeException {
    public BaseException(String message) {
        super(message);
    }

    public BaseException(String source, String message) {
        super(source + ": " + message);
    }

    public BaseException(String source, String message, Throwable cause) {
        super(source + ": " + message, cause);
    }

    public BaseException(String source, int line, String message) {
        super(source + ": line " + line + ": " + message);
    }

    public BaseException(String source, int line, int col, String message) {
        super(source + ": line " + line + ":" + col + " " + message);
    }
}
