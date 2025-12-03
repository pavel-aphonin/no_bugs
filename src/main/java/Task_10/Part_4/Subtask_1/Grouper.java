package Task_10.Part_4.Subtask_1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouper {
    public static Map<Character, List<String>> groupByFirstLetter(List<String> list) {
        return list.stream()
                .collect(
                        Collectors.groupingBy(string -> string.charAt(0),
                                Collectors.toList())
                );
    }
}
