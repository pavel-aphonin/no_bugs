package Task_10.Part_2.Subtask_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "Строка",
                "Длинная строка",
                "",
                "Самая длинная строка с самым большим числом символов",
                "1234",
                "1"
        ));

        System.out.println(Converter.convertToLength(list));
    }
}
