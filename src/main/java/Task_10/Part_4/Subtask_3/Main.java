package Task_10.Part_4.Subtask_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                100, 101, 999, 1000,
                -1, -2, -50, -51, -100,
                0,
                4, 4, 5, 5, 10
        ));

        System.out.println(CalculateAverage.calculate(list));
    }
}
