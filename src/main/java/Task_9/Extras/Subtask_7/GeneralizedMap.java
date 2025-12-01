package Task_9.Extras.Subtask_7;

import java.util.Map;

public class GeneralizedMap {
    public static <K, V> void printMap(Map<K, V> map) {
        map.forEach((key, value) -> {
            System.out.print(key + " - ");
            System.out.print(value);
            System.out.println();
        });
    }
}
