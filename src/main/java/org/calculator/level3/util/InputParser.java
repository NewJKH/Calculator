package org.calculator.level3.util;

public class InputParser {
    /*
    여기서는 입력값 ( 1번째 값 , (기호) , ( 2번째 값 ) 으로 받기

    1,2 번째 값
        - 1. 숫자인지 Number 확인
        - 2. 문자열이라면 throw

    기호
        - [- + - / *] 가 아니라면 재입력 창 출력
     */
    public <T extends Number> Number parseNumber(T number){
        return number;
    }
}
