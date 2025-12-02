package Task_10.Part_3.Subtask_2;

import java.util.Comparator;
import java.util.List;

public class MinNumberFounder {
    public static Integer findMin(List<Integer> list) {
        return list.stream()
                .min(Comparator.naturalOrder())
                .orElse(null);
    }
}
