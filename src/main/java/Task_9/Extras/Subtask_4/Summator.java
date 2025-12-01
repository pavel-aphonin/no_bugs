package Task_9.Extras.Subtask_4;

import java.util.List;

public class Summator {
    public static <T extends Number> void sum(List<T> list) {
        int sum = 0;

        for (T item : list) {
            sum += item.intValue();
        }

        System.out.println(sum);
    }
}
