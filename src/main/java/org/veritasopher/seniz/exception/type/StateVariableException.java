package org.veritasopher.seniz.exception.type;

import org.veritasopher.seniz.exception.BaseException;

/**
 * Variable Exception
 *
 * @author Yepeng Ding
 * @date 12/2/2020
 */
public class StateVariableException extends BaseException {

    public StateVariableException(String source, String message) {
        super(source, message);
    }

    public StateVariableException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public StateVariableException(String source, int line, String message) {
        super(source, line, message);
    }

    public StateVariableException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
