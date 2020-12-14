package org.veritasopher.seniz.exception;

/**
 * Variable Exception
 *
 * @author Yepeng Ding
 * @date 12/2/2020
 */
public class StateVariableException extends BaseException {

    public StateVariableException(String message) {
        super(message);
    }

    public StateVariableException(String message, Throwable cause) {
        super(message, cause);
    }

    public StateVariableException(int line, String message) {
        super(line, message);
    }

    public StateVariableException(int line, int col, String message) {
        super(line, col, message);
    }
}
