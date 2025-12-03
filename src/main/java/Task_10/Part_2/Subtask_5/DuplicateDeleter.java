package Task_10.Part_2.Subtask_5;

import java.util.List;

public class DuplicateDeleter<T> {
    public static <T> List<T> deleteDuplicates(List<T> list) {
        return  list.stream()
                .distinct()
                .toList();
    }
}
