package OtherTopics.solid;

import java.util.*;
import java.util.stream.Collectors;

public class InterfaceSeggregationPricipal {
    public static void main(String[] args) {
       Map<String,Integer> fruitCalori = new HashMap<>();
       fruitCalori.put("banan",56);
       fruitCalori.put("eple",40);
       fruitCalori.put("appelsin",90);

       Map<String,Integer> friutFilter = fruitCalori.entrySet()
               .stream().filter(entry-> fruitCalori.get() > 50)
               .collect(Collectors.toMap());


    }

}
