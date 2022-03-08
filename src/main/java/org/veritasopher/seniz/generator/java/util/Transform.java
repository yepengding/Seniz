package org.veritasopher.seniz.generator.java.util;

import org.veritasopher.seniz.core.model.common.Evaluation;
import org.veritasopher.seniz.core.model.common.State;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.exception.type.GeneratorException;

import java.util.stream.Collectors;

/**
 * Java Transform Tool
 *
 * @author Yepeng Ding
 * @date 3/8/2022
 */
public class Transform {

    /**
     * Get corresponding Java type by primary type
     *
     * @param type primary type
     * @return Java type
     */
    public static String toJavaType(PrimaryType type) {
        String javaType;
        switch (type) {
            case BOOLEAN -> javaType = "Boolean.class";
            case INTEGER -> javaType = "Integer.class";
            case FLOAT -> javaType = "Float.class";
            case STRING -> javaType = "String.class";
            default -> throw new GeneratorException("", "Unknown type is found.");
        }
        return javaType;
    }

    /**
     * Get Java evaluation
     * Because Seniz uses the same symbol for operands, no need to create a transformation table.
     *
     * @param evaluation Seniz evaluation
     * @return evaluated Java string
     */
    public static String toJavaEvaluation(Evaluation evaluation) {
        return evaluation.getInfixList().stream()
                .map(t -> switch (t.getType()) {
                    case OPERATOR -> t.getOperator().getValue();
                    case OPERAND -> switch (t.getOperand().primaryType()) {
                        case VARIABLE -> "varSet.get(%s)".formatted(t.getOperand().value().toString());
                        case STRING -> "".equals(t.getOperand().value()) ?
                                "\"\"" : t.getOperand().value().toString();
                        default -> t.getOperand().value().toString();
                    };
                    case PARENTHESIS -> t.getParenthesis();
                }).collect(Collectors.joining());
    }

    public static String toJavaStateName(State state) {
        return "$%s".formatted(state.hashCode()).replace("-", "_");
    }
}
