package org.calculator.level3.util;

import org.calculator.level3.enums.OperatorType;

public class InputParser {
    /**
     * @param t 일단 모든 값을 String 이든 Number 이든 다 받게 설정하고 안에서 파싱
     *            근데 어차피.... Scanner 에서는 String 이라면 Number 을 인식해도 되는건가?
     * @return Number 또는 에외
     */
    public <T> Number parseNumber(T t) {
        if (t instanceof Number number) return number;
        if (t instanceof String str)
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
        }
        throw new IllegalArgumentException("연산자 타입이 아닙니다.");
    }
}
