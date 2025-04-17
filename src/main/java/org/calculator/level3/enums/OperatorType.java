package org.calculator.level3.enums;

public enum OperatorType {
    PLUS,
    MINUS,
    MULTIPLY,
    DIVIDE;

    public static String format(OperatorType type){
        switch (type){
            case PLUS -> {
                return "+";
            }
            case MINUS -> {
                return "-";
            }
            case DIVIDE -> {
                return "/";
            }
            case MULTIPLY -> {
                return "*";
            }
        }
        return "NaN";
    }
}
