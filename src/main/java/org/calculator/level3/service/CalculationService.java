package org.calculator.level3.service;

import org.calculator.level3.enums.OperatorType;
import org.calculator.level3.model.ArithmeticCalculator;
import org.calculator.level3.repository.ResultRepository;

public class CalculationService {
    private final ArithmeticCalculator arithmeticCalculator;
    private final ResultRepository resultRepository;

    public CalculationService(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
        this.arithmeticCalculator = new ArithmeticCalculator();
    }
    public Number calculate(Number num1, Number num2, OperatorType type){
        return arithmeticCalculator.calculate(num1,num2,type);
    }
    public void writeResult(Number resultValue){

    }
}
