package org.calculator.level1;

import java.util.Scanner;

public class App {
    /*
    요구 사항
    1. " exit " 입력해야만 종료
    2. 클래스 분리 없이 하나의 클래스로 작성
    3. Scanner 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있다.
    4. 사칙연산 기호(➕,➖,✖️,➗)를 입력받기
    5. Scanner 사용하여 사칙연산 기호를 전달 받을 수 있다.

    error
    연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력

     */
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            // 첫번째 입력...
            System.out.print(" 첫번째 정수를 입력하세요: ");
            String val1 = scanner.next();

            if( val1.equals("exit")) {
                System.out.println(" 계산기를 종료 합니다. ");
                return;
            }
            // 두번째 입력...
            System.out.print(" 두번째 정수를 입력하세요: ");
            String val2 = scanner.next();

            if( val2.equals("exit")) {
                System.out.println(" 계산기를 종료 합니다. ");
                return;
            }
            // 여기서부터... 글자를 숫자로 변환.... 예..외 처리 하...고 싶다..
            int num = Integer.parseInt(val1);
            int num2 = Integer.parseInt(val2);

            System.out.print(" 기호(➕,➖,✖\uFE0F,➗) 선택: ");
            char symbol = scanner.next().charAt(0);

            if ( num2 <= 0 && symbol == '/'){
                System.out.println(" 나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
                continue;
            }

            String result;
            switch (symbol){
                case '+'-> result = String.valueOf(num + num2);
                case '-'-> result = String.valueOf(num - num2);
                case '/'-> result = String.valueOf(num / num2);
                case '*'-> result = String.valueOf(num * num2);
                default-> result = " 기호가 잘못되었습니다. ";
            }
            System.out.println(" 결과 "+result);

            
        }
    }
}
