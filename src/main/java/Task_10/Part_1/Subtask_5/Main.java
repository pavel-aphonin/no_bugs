package Task_10.Part_1.Subtask_5;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printer = (string) -> System.out.println(string);

        // Печатаем строку в консоль
        printer.accept("Тестовая строка");
        printer.accept("");
        printer.accept("Длинная тестовая строка с большим числом буквенных символов  и без цифр и специальных символов");
        printer.accept("1234567890");
        printer.accept("Тестовая строка № 1");
    }
}
