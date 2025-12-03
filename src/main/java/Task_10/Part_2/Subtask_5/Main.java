package Task_10.Part_2.Subtask_5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(0, 0, 0, 1, 2, 3, 1, 4, 5, 2, 3, 6, 7, 4, 8, 9, 10, 10, 10));
        System.out.println(DuplicateDeleter.deleteDuplicates(numbers));
    }
}
