package Task_10.Part_2.Subtask_4;

import java.util.List;

public class Exponentiator {
    public static List<Double> explanationIn(List<Integer> list, Integer exponent) {
        return list.stream()
                .map((item) -> Math.pow(item, exponent))
                .toList();
    }
}
