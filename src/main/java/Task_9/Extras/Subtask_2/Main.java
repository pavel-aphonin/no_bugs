package Task_9.Extras.Subtask_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrintableList stringList = new PrintableList();
        PrintableList integerList = new PrintableList();

        // Добавляем и печатаем элементы
        stringList.printList(List.of("1", "2", "3", "4", "5"));
        integerList.printList(List.of(1, 2, 3, 4, 5));
    }
}
