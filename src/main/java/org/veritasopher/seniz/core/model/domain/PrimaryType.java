package org.veritasopher.seniz.core.model.domain;

public enum PrimaryType {
    NULL, BOOLEAN, INTEGER, FLOAT, STRING, VARIABLE, ARGUMENT, SYSTEM, PROPOSITION;

    /**
     * Get type by type name
     *
     * @param typeName type name defined in lexer
     * @return corresponding Type
     */
    public static PrimaryType getType(String typeName) {
        return switch (typeName) {
            case "bool" -> BOOLEAN;
            case "int" -> INTEGER;
            case "float" -> FLOAT;
            case "string" -> STRING;
            default -> NULL;
        };
    }

}
