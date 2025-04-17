package org.calculator.level3;

import org.calculator.level3.service.CalculationService;
import org.calculator.level3.service.ScannerService;

import java.util.Scanner;

public class App {
    /*
     * 플로우차트
     * [app.App]                       메인 시작점
        |
        v
    [util.InputParser]             사용자 입력 파싱 (숫자 + 연산자)
        |
        v
    [service.CalculationService]   계산 흐름 관리 (계산 + 결과 저장/조회)
        |
        |---> [calculator.ArithmeticCalculator]   실제 계산 수행
        |
        |---> [model.Result]                      계산 결과 객체 생성
        |
        |---> [repository.ResultRepository]       결과 저장 및 조회
        |
     */
    public static void main(String[] args) {
        ScannerService scannerService = new ScannerService(new Scanner(System.in));
        CalculationService calculationService = new CalculationService();

        do {


        }while (scannerService);
    }
}
