package Task_10.Part_3.Subtask_1;

import java.util.Comparator;
import java.util.List;

public class MaxNumberFounder {
    public static Integer findMax(List<Integer> list) {
        return list.stream()
                .max(Comparator.naturalOrder())
                .orElse(null);
    }
}
