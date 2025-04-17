package org.calculator.level3.enums;

public enum OperatorType {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String sign;

    OperatorType(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return this.sign;
    }

    public static OperatorType of(String s) {
        switch (s) {
            case "+", "PLUS", "ADD" -> {
                return OperatorType.PLUS;
            }
            case "-", "MINUS", "REMOVE" -> {
                return OperatorType.MINUS;
            }
            case "/", "DIVIDE", "DV" -> {
                return OperatorType.DIVIDE;
            }
            case "*", "X", "MULTI" -> {
                return OperatorType.MULTIPLY;
            }
        }
        throw new IllegalArgumentException("연산자 타입이 아닙니다.");
    }
}
