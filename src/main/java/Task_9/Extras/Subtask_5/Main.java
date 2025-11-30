package Task_9.Extras.Subtask_5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Numbers.setList(List.of(1, 2, 3, 4, 5));
        System.out.println(Numbers.getList());

        Numbers.setList(List.of(6, 7, 8, 9, 10));
        System.out.println(Numbers.getList());
    }
}
