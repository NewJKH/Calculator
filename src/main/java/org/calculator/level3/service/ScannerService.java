package org.calculator.level3.service;

import org.calculator.level3.util.InputParser;

import java.util.Scanner;

public class ScannerService {
    private final Scanner scanner;
    private final InputParser inputParser;

    public ScannerService(Scanner scanner) {
        this.scanner = scanner;
        this.inputParser = new InputParser();
    }

}
