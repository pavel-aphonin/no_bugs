package Task_10.Part_3.Subtask_3;

import java.util.List;

public class Summator {
    public static Integer calculateSum(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
