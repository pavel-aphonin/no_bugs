package Task_10.Part_4.Subtask_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "apple",
                "avocado",
                "apricot",
                "banana",
                "blueberry",
                "blackberry",
                "cherry",
                "cranberry",
                "coconut",
                "date",
                "dragonfruit",
                "durian",
                "elderberry",
                "fig",
                "grape",
                "guava",
                "kiwi",
                "kumquat",
                "lemon",
                "lime",
                "mango",
                "melon",
                "nectarine",
                "orange",
                "papaya",
                "peach",
                "pear",
                "pineapple",
                "plum",
                "raspberry",
                "strawberry",
                "tangerine",
                "watermelon"
        ));

        // Группируем строки по первой букве
        System.out.println(Grouper.groupByFirstLetter(list));
    }
}
