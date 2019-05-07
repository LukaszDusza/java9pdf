package asseco.zadanie3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class VisitCounter {

    public Map<Long,Long> count(Map<String, UserStats> stats) {
        Map<Long,Long> result = new HashMap<>();
        for (Map.Entry<String, UserStats> entry: stats.entrySet()) {
            if(entry.getValue().visitCount.isPresent()) {
                result.put(Long.parseLong(entry.getKey()), entry.getValue().visitCount.get());
            }
        }
        return result;
    }
}

//todo zamockuj listę stats i przekaz do metody count.
// Przyjmujemy, ze String to jest UserID do przeksztalcenia na Long
//todo odfiltruj z UserStats liczbę odwiedzin i dodaj tę liczbę do mapy <UserID, Long>
//todo Zwróc nową mapę z elementami <Log, Long>
//   Long counter = stats.get("jakis klucz").visitCount.get();
//  if(stats.get("service").visitCount.isPresent()) {
//todo put to map
//  }

//  stats.get("service").visitCount.orElseThrow(() -> new RuntimeException());
//  stats.get("service").visitCount.ifPresent(System.out::println);
//  stats.get("service").visitCount.orElse(0L);

//sposob 2
//   Long userID =  Long.parseLong(entry.getKey());
//   Long visit = entry.getValue().visitCount.get();
//   result.put(userID, visit);


