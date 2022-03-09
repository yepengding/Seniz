package org.veritasopher.seniz.generator.java.util;

import org.veritasopher.seniz.core.model.common.State;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.exception.type.GeneratorException;
import org.veritasopher.seniz.generator.java.dict.SourceFile;

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
