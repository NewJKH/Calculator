package org.calculator.level2;

import java.util.ArrayList;
import java.util.List;

import static org.calculator.level2.App.ERROR_NUMBER;

public class Calculator {
    private List<Double> log;

    public Calculator() {
        log = new ArrayList<>();
    }

    public List<Double> getLog() {
        return log;
    }

    public void setLog(List<Double> log) {
        this.log = log;
    }

    public void addLog(double value){
        this.log.add(value);
    }

    public void removeLog(){
        if ( !log.isEmpty() ) this.log.remove(0);
    }

    public double calculate(int num, int num2, char symbol) {
        switch (symbol) {
            case '+' -> {
                return num + num2;
            }
            case '-' -> {
                return num - num2;
            }
            case '/' -> {
                return (double) num / num2;
            }
            case '*' -> {
                return num * num2;
            }
        }
        return ERROR_NUMBER;
    }
}

