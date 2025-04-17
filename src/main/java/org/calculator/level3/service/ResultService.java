package org.calculator.level3.service;

import org.calculator.level3.enums.OperatorType;
import org.calculator.level3.model.Result;
import org.calculator.level3.repository.ResultRepository;

public class ResultService {
    private final ResultRepository resultRepository;

    public ResultService(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    public void writeLog(Number val1, Number val2, OperatorType type, Number val3) {
        int size = resultRepository.getAllLogs().size();
        resultRepository.addLog(
                size == 0 ? 0:size-1,
                new Result(val1, val2, type, val3)
        );
    }

    public void printLog(int id){
        resultRepository.getResultById(id)
                .ifPresentOrElse(
                        log->
                            System.out.println(log.firstValue().doubleValue()
                                            +" "+log.type().getSign()
                                            +" "+log.secValue().doubleValue()
                                            +" ="+log.result().doubleValue()),
                        ()-> System.out.println(" 해당 로그는 존재하지 않습니다. "));

    }

    private void printAllLog(){
        resultRepository.getAllLogs()
                .forEach(log->
                    System.out.println(log.firstValue().doubleValue()
                            +" "+log.type().getSign()
                            +" "+log.secValue().doubleValue()
                            +" ="+log.result().doubleValue()));
    }
}
