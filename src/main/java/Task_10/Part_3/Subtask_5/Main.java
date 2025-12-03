package Task_10.Part_3.Subtask_5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1));
        List<Integer> list2 = new ArrayList<>(List.of());

        // Первоначальная реализация, оставил, чтобы было
        System.out.println(ElementsChecker.hasAnyEvenNumber(list1));
        System.out.println(ElementsChecker.hasAnyEvenNumber(list2));

        // Более универсальное и соответствующее подсказкам решение
        System.out.println(ElementsChecker.hasAnyElementWithCondition(list1, (item) -> item % 2 == 0));
        System.out.println(ElementsChecker.hasAnyElementWithCondition(list2, (item) -> item % 2 == 0));
    }
}
