package org.veritasopher.seniz.core.mapper;


public class TypeMapper {

    public static int map(String type) {
        int t = Type.NULL;
        switch (type) {
            case "int": {
                t = Type.INTEGER;
                break;
            }
            case "float": {
                t = Type.FLOAT;
                break;
            }
            case "bool": {
                t = Type.BOOLEAN;
                break;
            }
            case "string": {
                t = Type.STRING;
                break;
            }
        }
        return t;
    }

    public static String map(int type) {
        String t = "null";
        switch (type) {
            case Type.INTEGER: {
                t = "int";
                break;
            }
            case Type.FLOAT: {
                t = "float";
                break;
            }
            case Type.BOOLEAN: {
                t = "bool";
                break;
            }
            case Type.STRING: {
                t = "string";
                break;
            }
        }
        return t;
    }
    
}
