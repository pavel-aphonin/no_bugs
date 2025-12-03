package Task_10.Part_4.Subtask_2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouper {
    public static Map<String, List<Integer>> groupByEven(List<Integer> list) {
        return list.stream()
                .collect(
                        Collectors.groupingBy(item -> (item % 2 == 0) ? "even" : "odd")
                );
    }
}
