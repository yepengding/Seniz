package org.veritasopher.seniz.core.model.common;

import lombok.Getter;
import lombok.ToString;
import org.veritasopher.seniz.core.model.domain.Operator;

/**
 * Term
 * Basic component of an expression
 *
 * @author Yepeng Ding
 * @date 12/16/2020
 */
@Getter
@ToString
public class Term {

    private Value operand;

    private Operator operator;

    public Term(Value operand) {
        this.operand = operand;
    }

    public Term(Operator operator) {
        this.operator = operator;
    }

    /**
     * Is an operand
     *
     * @return true if this is an operand. Otherwise false.
     */
    public boolean isOperand() {
        return operand != null;
    }

    /**
     * Is an operator
     *
     * @return true if this is an operator. Otherwise false.
     */
    public boolean isOperator() {
        return operator != null;
    }

}
