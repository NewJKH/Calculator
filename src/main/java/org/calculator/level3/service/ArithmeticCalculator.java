package org.calculator.level3.service;

import org.calculator.level3.enums.OperatorType;
import org.calculator.level3.model.Calculator;

public class ArithmeticCalculator {

    public Number calculate(Number num1, Number num2, OperatorType type){
        Calculator calculator = switch (type) {
            case PLUS -> this::plus;
            case MINUS -> this::minus;
            case MULTIPLY -> this::multiply;
            case DIVIDE -> this::divide;
        };

        return calculator.calculate(num1, num2);
    }
    private double plus(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }

    private double minus(Number a, Number b) {
        return a.doubleValue() - b.doubleValue();
    }

    private double multiply(Number a, Number b) {
        return a.doubleValue() * b.doubleValue();
    }

    private double divide(Number a, Number b) {
        if (b.doubleValue() == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
        return a.doubleValue() / b.doubleValue();
    }
}
