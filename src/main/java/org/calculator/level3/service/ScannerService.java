package org.calculator.level3.service;

import org.calculator.level3.enums.OperatorType;
import org.calculator.level3.util.InputParser;

import java.util.Scanner;

public class ScannerService {
    private final Scanner scanner;
    private final InputParser inputParser;

    public ScannerService(Scanner scanner) {
        this.scanner = scanner;
        this.inputParser = new InputParser();
    }

    public Number getNumber(String message) {
        System.out.print(message);
        return inputParser.parseNumber(scanner.next());
    }

    public OperatorType getOperator(String message) {
        System.out.print(message);
        return inputParser.parseOperatorType(scanner.next());
    }

    public boolean askContinue() {
        System.out.print(" \n계속 진행하시겠습니까?(exit 입력시 종료): ");
        String str = scanner.next();
        if ( str.equalsIgnoreCase("EXIT")){
            System.out.println("\n계산기가 종료 됩니다.");
            return false;
        }
        return true;
    }
}
