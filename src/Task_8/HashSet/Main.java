package Task_8.HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> taskIntData = new HashSet<>();
        NumbersStorage taskIntStorage = new NumbersStorage(taskIntData);

        // Наполняем множество и выводим содержимое (задача 1)
        taskIntStorage.print();
        taskIntStorage.addElement(1);
        taskIntStorage.addElement(2);
        taskIntStorage.addElement(3);
        taskIntStorage.addElement(4);
        taskIntStorage.addElement(5);
        taskIntStorage.print();

        // Проверяем, содержится ли элемент в множестве
        taskIntStorage.addElement(6);
        taskIntStorage.addElement(7);
        taskIntStorage.addElement(8);
        taskIntStorage.addElement(9);
        taskIntStorage.addElement(10);
        taskIntStorage.containsElement(10);
        taskIntStorage.containsElement(11);

        // Превращаем List в Set (задача 3)
        List<String> taskStringData = new ArrayList<>(Arrays.asList(
                "Первый элемент",
                "Второй элемент",
                "Повтор",
                "Третий элемент",
                "Повтор",
                "Повтор",
                "Четвёртый элемент",
                "Первый элемент",
                "Второй элемент",
                "Пятый элемент"
        ));
        StringStorage taskStringStorage = new StringStorage();
        System.out.println(taskStringStorage.convertListToSet(taskStringData));

        // Проверяем наличие имени в множестве имён (задача 4)
        Set<String> taskNamesData = new HashSet<>(List.of(
                "Павел",
                "Сергей",
                "Иван",
                "Дмитрий",
                "Пётр"
        ));
        NamesStorage taskNameStorage = new NamesStorage(taskNamesData);
        taskNameStorage.findName("Павел");
        taskNameStorage.findName("Александр");
        taskNameStorage.findName("Олег");
    }
}
