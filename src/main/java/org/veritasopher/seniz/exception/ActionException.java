package org.veritasopher.seniz.exception;

public class ActionException extends BaseException {

    public ActionException(String message) {
        super(message);
    }

    public ActionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ActionException(int line, String message) {
        super(line, message);
    }

    public ActionException(int line, int col, String message) {
        super(line, col, message);
    }
}
