package Task_10.Part_3.Subtask_5;

import java.util.List;
import java.util.function.Predicate;

public class ElementsChecker {
    // Первый вариант, как я сделал сначала
    public static Integer hasAnyEvenNumber(List<Integer> list) {
        return list.stream()
                .filter(item -> item % 2 == 0)
                .findFirst()
                .orElse(null);
    }

    // Второй вариант, правильный
    public static <T> Boolean hasAnyElementWithCondition(List<T> list, Predicate<T> predicate) {
        return list.stream().anyMatch(predicate);
    }
}
