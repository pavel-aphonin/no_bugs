package Task_10.Part_3.Subtask_4;

import java.util.List;

public class FindFirstElement {
    public static String startWithLetter(List<String> list, String character) {
        return list.stream()
                .filter(item -> item.startsWith(character))
                .findFirst()
                .orElse("Был передан пустой список");
    }
}
