package org.calculator.level3.repository;

import org.calculator.level3.model.Result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ResultRepository {
    private final Map<Integer, Result> results;

    public ResultRepository() {
        this.results = new HashMap<>();
    }

    public Optional<Result> getResultById(int id){
        return Optional.ofNullable(results.get(id));
    }

    public List<Result> getAllLogs(){
        return results.values()
                .stream()
                .toList();
    }

    public Map<Integer, Result> getResults() {
        return results;
    }

    public void addLog(int id, Result result){
        results.put(id,result);
    }
    public void removeLog(int id){
        results.remove(id);
    }
}
