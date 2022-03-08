package org.veritasopher.seniz.core.model.common;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.veritasopher.seniz.core.model.domain.Operator;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.core.model.domain.TermType;

import java.util.Objects;

/**
 * Term
 * Basic component of an expression
 *
 * @author Yepeng Ding
 * @date 12/16/2020
 */
@Getter
@ToString
@EqualsAndHashCode
public class Term {

    private final TermType type;

    private Value operand;

    private Operator operator;

    private String parenthesis;

    public Term(Value operand) {
        this.type = TermType.OPERAND;
        this.operand = operand;
    }

    public Term(Operator operator) {
        this.type = TermType.OPERATOR;
        this.operator = operator;
    }

    public Term(String parenthesis) {
        this.type = TermType.PARENTHESIS;
        this.parenthesis = parenthesis;
    }

}
