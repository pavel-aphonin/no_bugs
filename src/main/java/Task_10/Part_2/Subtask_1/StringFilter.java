package Task_10.Part_2.Subtask_1;

import java.util.List;

public class StringFilter {
    public static List<String> filterString(List<String> list, Integer symbolsCount) {
        return list.stream()
                .filter((item) -> item.length() > symbolsCount)
                .toList();
    }
}
