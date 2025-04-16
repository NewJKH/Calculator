package org.calculator.level2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> history;

    public Calculator() {
        history = new ArrayList<>();
    }

    public List<Double> getHistory() {
        return history;
    }

    public void setHistory(List<Double> history) {
        this.history = history;
    }

    public void addHistory(double value){
        this.history.add(value);
    }

    public void removeHistory(){
        this.history.remove(0);
    }

    public double calculate(int num, int num2, char symbol){
        switch (symbol){
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
    }
}

