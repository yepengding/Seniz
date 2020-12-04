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

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(int line, String message) {
        super("line " + line + ": " + message);
    }
}
