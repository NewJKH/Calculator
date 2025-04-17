package org.calculator.level3;

import org.calculator.level3.util.InputParser;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputParser parser = new InputParser();
        Number number = parser.parseNumber(scanner.next());

    }
}
