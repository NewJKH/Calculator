package org.calculator.level3;

import org.calculator.level3.enums.OperatorType;
import org.calculator.level3.repository.ResultRepository;
import org.calculator.level3.service.CalculationService;
import org.calculator.level3.service.ResultService;
import org.calculator.level3.service.ScannerService;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ResultRepository resultRepository = new ResultRepository();

        ScannerService scannerService = new ScannerService(new Scanner(System.in));
        CalculationService calculationService = new CalculationService();
        ResultService resultService = new ResultService(resultRepository);
        do {
            try {
                Number val1 = scannerService.getNumber(" 첫번째 숫자를 입력해주세요: ");
                OperatorType type = scannerService.getOperator(" 연산자 [ + , -, *, / ]: ");
                Number val2 = scannerService.getNumber(" 두번째 숫자를 입력해주세요: ");

                Number result = calculationService.calculate(val1,val2,type);
                System.out.println(result.doubleValue());
                resultService.writeLog(val1,val2,type,result);
                resultService.printLog(0);


            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }while (scannerService.askContinue());
    }
}
