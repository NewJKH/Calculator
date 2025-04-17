package org.calculator.level3.util;

import org.calculator.level3.enums.OperatorType;

public class InputParser {
    /*
    여기서는 입력값 ( 1번째 값 , (기호) , ( 2번째 값 ) 으로 받기

    1,2 번째 값
        - 1. 숫자인지 Number 확인
        - 2. 문자열이라면 throw

    기호
        - [- + - / *] 가 아니라면 재입력 창 출력
     */

    /**
     * @param obj 일단 모든 값을 String 이든 Number 이든 다 받게 설정하고 안에서 파싱
     *            근데 어차피.... Scanner 에서는 String 이라면 Number 을 인식해도 되는건가?
     * @return Number 또는 에외
     */
    public Number parseNumber(Object obj) {
        if (obj instanceof Number number) return number;
        if (obj instanceof String str)
            try { return Double.parseDouble(str); }
            catch (NumberFormatException ignored) {  }

        throw new IllegalArgumentException("숫자 타입이 아닙니다.");
    }

    /**
     * @param symbol String 형태로 받고 Upper 하여 대문자로 비교
     * @return NONE 반환 가능성
     */
    public OperatorType parseOperatorType(String symbol){
        switch (symbol.toUpperCase()){
            case "+", "PLUS", "ADD" -> {
                return OperatorType.PLUS;
            }
            case "-", "MINUS", "REMOVE" -> {
                return OperatorType.MINUS;
            }
            case "/", "DIVIDE", "DV" -> {
                return OperatorType.DIVIDE;
            }
            case "*", "X", "MULTI" -> {
                return OperatorType.MULTIPLY;
            }
            default -> {
                return OperatorType.NONE;
            }
        }
    }
}
