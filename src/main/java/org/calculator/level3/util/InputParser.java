package org.calculator.level3.util;

import org.calculator.level3.enums.OperatorType;

public class InputParser {

    public <T> Number parseNumber(T t) {
        if (t instanceof Number number) return number;
        if (t instanceof String str)
            try { return Double.parseDouble(str); }
            catch (NumberFormatException ignored) {  }

        throw new IllegalArgumentException("숫자 타입이 아닙니다.");
    }


    public OperatorType parseOperatorType(String symbol){
        return OperatorType.of(symbol.toUpperCase());
    }
}
