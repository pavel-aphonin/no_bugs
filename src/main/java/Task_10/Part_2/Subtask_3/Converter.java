package Task_10.Part_2.Subtask_3;

import java.util.Collection;
import java.util.List;

public class Converter {
    public static Collection<Integer> convertToLength(List<String> list) {
        return list.stream()
                .map(String::length)
                .toList();
    }
}
