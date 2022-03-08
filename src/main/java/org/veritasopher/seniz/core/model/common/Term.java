package org.veritasopher.seniz.core.model.common;

import lombok.Getter;
import lombok.ToString;
import org.veritasopher.seniz.core.model.domain.Operator;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Term term = (Term) o;
        return type == term.type && Objects.equals(operand, term.operand) && operator == term.operator && Objects.equals(parenthesis, term.parenthesis);
    }

    /**
     * Overriding hash code calculation
     * Using string form of operand as value for hash.
     *
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(type, operator, parenthesis) + (operand == null ? 0 : operand.toString().hashCode());
    }
}
