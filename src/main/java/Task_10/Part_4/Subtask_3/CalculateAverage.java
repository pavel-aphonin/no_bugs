package Task_10.Part_4.Subtask_3;

import java.util.List;
import java.util.stream.Collectors;

public class CalculateAverage {
    public static Double calculate(List<Integer> list) {
        return list.stream()
                .collect(Collectors.averagingInt(Integer::intValue)
                );
    }
}
