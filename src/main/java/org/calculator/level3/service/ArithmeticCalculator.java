package org.calculator.level3.service;

import org.calculator.level3.enums.OperatorType;
import org.calculator.level3.model.Calculator;

public class ArithmeticCalculator {

    public <T extends Number> Number calculate(T num1, T num2, OperatorType type){
        Calculator calculator = switch (type) {
            case PLUS -> this::plus;
            case MINUS -> this::minus;
        };

        return calculator.calculate(num1, num2);
    }
    private double plus(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }
    private double minus(Number a, Number b) {
        return a.doubleValue() - b.doubleValue();
    }
}
