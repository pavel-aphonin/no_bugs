package Task_10.Part_3.Subtask_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1));
        List<Integer> list2 = new ArrayList<>(List.of());

        // Вычисляем суммы
        System.out.println(Summator.calculateSum(list1));
        System.out.println(Summator.calculateSum(list2));
    }
}
