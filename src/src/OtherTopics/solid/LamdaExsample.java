package OtherTopics.solid;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaExsample {
    public static void main(String[] args) {
        List<Integer> nummbers = new ArrayList<>();
        nummbers.add(3);
        nummbers.add(2);
        nummbers.add(5);
        nummbers.add(20);
       List<Integer> result = nummbers.stream().filter(i -> i%2 == 0)
                .collect(Collectors.toList());
        System.out.println(result);

        List<Integer> oddNum = nummbers.stream().filter(i -> i%2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddNum);

    }

}
