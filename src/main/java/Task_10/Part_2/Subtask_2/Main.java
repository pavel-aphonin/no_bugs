package Task_10.Part_2.Subtask_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(MultiplesNumbers.multipleFilter(numbers, 5));
    }
}
