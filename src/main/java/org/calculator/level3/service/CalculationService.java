package org.calculator.level3.service;

import org.calculator.level3.enums.OperatorType;
import org.calculator.level3.model.ArithmeticCalculator;

public class CalculationService {
    private final ArithmeticCalculator arithmeticCalculator;

    public CalculationService() {
        this.arithmeticCalculator = new ArithmeticCalculator();
    }
    public Number calculate(Number num1, Number num2, OperatorType type){
        return arithmeticCalculator.calculate(num1,num2,type);
    }
}
