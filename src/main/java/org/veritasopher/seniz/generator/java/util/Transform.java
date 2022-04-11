package org.veritasopher.seniz.generator.java.util;

import org.veritasopher.seniz.core.model.BaseSystem;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.Evaluation;
import org.veritasopher.seniz.core.model.common.State;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.exception.type.GeneratorException;
import org.veritasopher.seniz.generator.java.dict.SourceFile;

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
            case BOOLEAN -> javaType = "boolean";
            case INTEGER -> javaType = "int";
            case FLOAT -> javaType = "float";
            case STRING -> javaType = "String";
            default -> throw new GeneratorException("", "Unknown type is found.");
        }
        return javaType;
    }

    /**
     * Get corresponding Java type class by primary type
     *
     * @param type primary type
     * @return Java type class
     */
    public static String toJavaTypeClass(PrimaryType type) {
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
     * Get corresponding Java evaluation
     * Because Seniz uses the same symbol for operands, no need to create a transformation table.
     *
     * @param bs         base system
     * @param evaluation Seniz evaluation
     * @return evaluated Java string
     */
    public static String toJavaEvaluation(BaseSystem bs, Evaluation evaluation) {
        return evaluation.getInfixList().stream()
                .map(t -> switch (t.getType()) {
                    case OPERATOR -> t.getOperator().getValue();
                    case OPERAND -> switch (t.getOperand().primaryType()) {
                        case VARIABLE -> "(%s) varSet.get(%s)".formatted(
                                toJavaType(
                                        bs.getStateVariable(t.getOperand().value().toString()).orElseThrow(() -> {
                                            throw new GeneratorException(bs.getIdentifier(), "Unknown state variable is found");
                                        }).getPrimaryType()),
                                toJavaVariableName(t.getOperand().value().toString()));
                        case GLOBAL_VARIABLE -> "(%s) gVarSet.get(%s)".formatted(
                                toJavaType(
                                        bs.getGlobalStateVariable(t.getOperand().value().toString()).orElseThrow(() -> {
                                            throw new GeneratorException(bs.getIdentifier(), "Unknown global state variable is found");
                                        }).getPrimaryType()),
                                toJavaVariableName(t.getOperand().value().toString()));
                        case ARGUMENT -> toJavaEvaluation(bs, bs.getSystemArgument(t.getOperand().value().toString()).orElseThrow(() -> {
                            throw new GeneratorException(bs.getIdentifier(), "Unknown system argument is found");
                        }).getEvaluation());
                        case STRING -> "".equals(t.getOperand().value()) ?
                                "\"\"" : t.getOperand().value().toString();
                        default -> t.getOperand().value().toString();
                    };
                    case PARENTHESIS -> t.getParenthesis();
                }).collect(Collectors.joining());
    }

    /**
     * Get corresponding argument name in Java
     *
     * @param name argument name
     * @return argument name in Java
     */
    public static String toJavaArgumentName(String name) {
        return name.toUpperCase();
    }

    /**
     * Get corresponding variable name in Java
     *
     * @param name variable name
     * @return variable name in Java
     */
    public static String toJavaVariableName(String name) {
        return name.toUpperCase();
    }

    /**
     * Get corresponding state name in Java
     *
     * @param state a state
     * @return state name
     */
    public static String toJavaStateName(State state) {
        return "$%s".formatted(state.hashCode()).replace("-", "_");
    }

    /**
     * Generate import statement
     *
     * @param rootNamespace root namespace
     * @param sourceFile    name of the import source file
     * @param isStaticEnum  source file is an enum
     * @return import statement
     */
    public static String toJavaImport(String rootNamespace, SourceFile sourceFile, boolean isStaticEnum) {
        return isStaticEnum ?
                "import static %s.%s.*;".formatted(sourceFile.getNamespace(rootNamespace), sourceFile.getName()) :
                "import %s.%s;".formatted(sourceFile.getNamespace(rootNamespace), sourceFile.getName());
    }

}
