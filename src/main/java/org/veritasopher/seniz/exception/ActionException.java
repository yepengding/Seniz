package org.veritasopher.seniz.exception;

public class ActionException extends BaseException {

    public ActionException(String source, String message) {
        super(source, message);
    }

    public ActionException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public ActionException(String source, int line, String message) {
        super(source, line, message);
    }

    public ActionException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
