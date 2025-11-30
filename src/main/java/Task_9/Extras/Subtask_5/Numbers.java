package Task_9.Extras.Subtask_5;

import java.util.List;

public class Numbers {
    private static List<? super Integer> list;

    public static void setList(List<? super Integer> list) {
        Numbers.list = list;
    }

    public static List<? super Integer> getList() {
        return list;
    }
}
