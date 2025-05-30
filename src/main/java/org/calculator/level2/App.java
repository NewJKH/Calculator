package org.calculator.level2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static final int ERROR_NUMBER = -99999;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        do {
            int num = getNumberInput(" 첫번째 정수를 입력하세요: ",scanner);
            int num2 = getNumberInput(" 두번째 정수를 입력하세요: ",scanner);
            char symbol = getOperatorInput(" 기호(➕,➖,✖\uFE0F,➗) 선택: ",scanner);

            if ( !validateInput(num, num2, symbol) ){
                System.out.println("값이 잘못 입력되어 계산기를 다시 실행합니다.");
                continue;
            }

            double result = calculator.calculate(num, num2, symbol);
            printResult(result);
            addLog(calculator, result);
        } while (isExitCommand(scanner));
    }

    private static int getNumberInput(String message, Scanner scanner) {
        try {
            System.out.print(message);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("️ 숫자만 입력해주세요.");
            return ERROR_NUMBER;
        }
    }

    private static char getOperatorInput(String message, Scanner scanner) {
        try {
            System.out.print(message);
            return scanner.next().charAt(0);
        } catch (InputMismatchException e) {
            System.out.println("️ 기호만 입력해주세요.");
            return '0';
        }
    }

    private static boolean validateInput(int num1, int num2, char symbol) {
        if ( num1 == ERROR_NUMBER || num2 == ERROR_NUMBER ){
            System.out.println(" 정수부분에서 잘못된 값을 받았습니다. ");
            return false;
        }
        if (num2 <= 0 && symbol == '/') {
            System.out.println(" 나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
            return false;
        }
        if ( !(symbol=='+' || symbol=='-' ||symbol =='/' || symbol=='*')){
            System.out.println("  기호(➕,➖,✖\\uFE0F,➗) 만 선택해주세요. ");
            return false;

        }
        return true;
    }

    private static void printResult(double result){
        System.out.println(" 결과: " + result);
    }

    private static void addLog(Calculator calculator, double result) {
        calculator.addLog(result);
//        List<Double> logs = new ArrayList<>(calculator.getLog());
//        logs.add(result);
//        calculator.setLog(logs);
    }

    private static boolean isExitCommand(Scanner scanner){
        System.out.print(" 계산을 더 진행할까요? ( exit 입력시 종료 ): ");
        String exit = scanner.next();
        if (exit.equals("exit")) {
            System.out.println(" 계산기를 종료 합니다. ");
            return false;
        }
        return true;
    }
}
