package org.veritasopher.seniz.exception;

/**
 * Variable Exception
 *
 * @author Yepeng Ding
 * @date 12/2/2020
 */
public class VariableException extends BaseException {

    public VariableException(String message) {
        super(message);
    }

    public VariableException(String message, Throwable cause) {
        super(message, cause);
    }

    public VariableException(int line, String message) {
        super(line, message);
    }
}
