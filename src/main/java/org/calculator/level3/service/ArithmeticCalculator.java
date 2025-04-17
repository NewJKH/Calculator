package org.calculator.level3.service;

import org.calculator.level3.enums.OperatorType;
import org.calculator.level3.model.Calculator;

public class ArithmeticCalculator {

    public <T extends Number> Number calculate(T num1, T num2, OperatorType type){
        Calculator calculator = switch (type) {
            case PLUS -> this::plus;
            case MINUS -> this::minus;
            case MULTIPLY -> this::multiply;
            case DIVIDE -> (x, y) -> (y.doubleValue() == 0) ? null : divide(x, y);
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
        if (b.doubleValue() == 0) return Double.NaN;
        return a.doubleValue() / b.doubleValue();
    }
}
