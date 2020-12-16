package org.veritasopher.seniz.core.model.domain;

import org.veritasopher.seniz.core.base.SenizLexer;

/**
 * Operator Enum
 *
 * @author Yepeng Ding
 * @date 12/16/2020
 */
public enum Operator {

    ADD("+"), SUB("-"), MUL("*"), DIV("/"), NOT("!"), EQ("=="), NEQ("!="),
    GT(">"), LT("<"), GE(">="), LE("<="), AND("&&"), OR("||");

    private final String value;

    Operator(String value) {
        this.value = value;
    }

    public static Operator getOperator(int type) {
        switch (type) {
            case SenizLexer.ADD:
                return ADD;
            case SenizLexer.SUB:
                return SUB;
            case SenizLexer.MUL:
                return MUL;
            case SenizLexer.DIV:
                return DIV;
            case SenizLexer.NOT:
                return NOT;
            case SenizLexer.EQ:
                return EQ;
            case SenizLexer.NEQ:
                return NEQ;
            case SenizLexer.GT:
                return GT;
            case SenizLexer.LT:
                return LT;
            case SenizLexer.GE:
                return GE;
            case SenizLexer.LE:
                return LE;
            case SenizLexer.AND:
                return AND;
            case SenizLexer.OR:
                return OR;
        }
        return null;
    }

    public String getValue() {
        return value;
    }
}
