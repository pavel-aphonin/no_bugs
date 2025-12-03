package Task_10.Part_3.Subtask_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of(
                "Анна",
                "Борис",
                "Владимир",
                "Григорий",
                "Богдан",
                "Яна"
        ));
        List<String> list2 = new ArrayList<>(List.of());

        // Ищем имя на заданную букву
        System.out.println(FindFirstElement.startWithLetter(list1, "Б"));
        System.out.println(FindFirstElement.startWithLetter(list2, "Б"));
    }
}
