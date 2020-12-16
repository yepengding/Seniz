package org.veritasopher.seniz.core.model.domain;

public enum Type {
    NULL, BOOLEAN, INTEGER, FLOAT, STRING, VARIABLE;

    /**
     * Get type by type name
     *
     * @param typeName type name defined in lexer
     * @return corresponding Type
     */
    public static Type getType(String typeName) {
        switch (typeName) {
            case "bool": return BOOLEAN;
            case "int": return INTEGER;
            case "float": return FLOAT;
            case "string": return STRING;
        }
        return NULL;
    }

}
