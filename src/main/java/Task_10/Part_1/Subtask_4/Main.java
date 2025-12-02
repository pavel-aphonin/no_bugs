package Task_10.Part_1.Subtask_4;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = (string) -> string.length();

        // Получаем длину строк
        System.out.println(stringLength.apply("Тестовая строка"));
        System.out.println(stringLength.apply(""));
        System.out.println(stringLength.apply("Длинная тестовая строка с большим числом буквенных символов  и без цифр и специальных символов"));
        System.out.println(stringLength.apply("1234567890"));
        System.out.println(stringLength.apply("Тестовая строка № 1"));
    }
}
