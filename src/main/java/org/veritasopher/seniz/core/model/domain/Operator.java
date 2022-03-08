package org.veritasopher.seniz.core.model.domain;

import lombok.Getter;
import org.veritasopher.seniz.core.base.SenizLexer;

/**
 * Operator Enum
 *
 * @author Yepeng Ding
 * @date 12/16/2020
 */
public enum Operator {

    ADD("+", 2), SUB("-", 2), MUL("*", 2), DIV("/", 2),
    NOT("!", 1), EQ("==", 2), NEQ("!=", 2), GT(">", 2),
    LT("<", 2), GE(">=", 2), LE("<=", 2), AND("&&", 2),
    OR("||", 2), MOD("%", 2), EXP("^", 2);

    // Operator symbol
    @Getter
    private final String value;

    // Number of required operands
    @Getter
    private final int number;

    Operator(String value, int number) {
        this.value = value;
        this.number = number;
    }

    public static Operator getOperator(int type) {
        return switch (type) {
            case SenizLexer.ADD -> ADD;
            case SenizLexer.SUB -> SUB;
            case SenizLexer.MUL -> MUL;
            case SenizLexer.DIV -> DIV;
            case SenizLexer.MOD -> MOD;
            case SenizLexer.CARET -> EXP;
            case SenizLexer.BANG -> NOT;
            case SenizLexer.EQ -> EQ;
            case SenizLexer.NEQ -> NEQ;
            case SenizLexer.GT -> GT;
            case SenizLexer.LT -> LT;
            case SenizLexer.GE -> GE;
            case SenizLexer.LE -> LE;
            case SenizLexer.AND -> AND;
            case SenizLexer.OR -> OR;
            default -> null;
        };
    }

}
