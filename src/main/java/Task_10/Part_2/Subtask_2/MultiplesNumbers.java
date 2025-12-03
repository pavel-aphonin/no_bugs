package Task_10.Part_2.Subtask_2;

import java.util.List;

public class MultiplesNumbers {
    public static List<Integer> multipleFilter(List<Integer> list, Integer divider) {
        return list.stream()
                .filter((number) -> number % divider == 0)
                .toList();
    }
}
