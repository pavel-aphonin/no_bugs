package Task_8.LinkedHashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringStorage taskStringStorage = new StringStorage();

        // Добавляем элементы в LinkedHashSet и выводим их (задача 1)
        taskStringStorage.print();
        taskStringStorage.addElement("Первое");
        taskStringStorage.addElement("Второе");
        taskStringStorage.addElement("Третье");
        taskStringStorage.addElement("Четвёртое");
        taskStringStorage.addElement("Пятое");
        taskStringStorage.print();

        // Добавляем дубликаты и проверяем, что они не добавились (задача 2)
        taskStringStorage.addElement("Пятое");
        taskStringStorage.addElement("Первое");
        taskStringStorage.addElement("Третье");
        taskStringStorage.print();
    }
}
