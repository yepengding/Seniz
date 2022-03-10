package org.veritasopher.seniz.exception.type;

import org.veritasopher.seniz.exception.BaseException;

public class PropositionException extends BaseException {
    public PropositionException(String source, String message) {
        super(source, message);
    }

    public PropositionException(String source, String message, Throwable cause) {
        super(source, message, cause);
    }

    public PropositionException(String source, int line, String message) {
        super(source, line, message);
    }

    public PropositionException(String source, int line, int col, String message) {
        super(source, line, col, message);
    }
}
