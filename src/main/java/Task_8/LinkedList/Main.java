package Task_8.LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> taskIntData = new LinkedList<>();
        NumbersStorage taskIntStorage = new NumbersStorage(taskIntData);

        // Наполнение элементами и вывод в терминал (задача 1)
        taskIntStorage.print();
        taskIntStorage.addElement(1);
        taskIntStorage.addElement(2);
        taskIntStorage.addElement(3);
        taskIntStorage.addElement(4);
        taskIntStorage.addElement(5);

        taskIntStorage.print();

        Collection<String> taskQueueData = new LinkedList<>();
        QueueStorage taskQueueStorage = new QueueStorage(taskQueueData);

        // Наполнение очереди задачами (задача 2)
        taskQueueStorage.print();
        taskQueueStorage.addTask("Задача 1");
        taskQueueStorage.addTask("Задача 2");
        taskQueueStorage.addTask("Задача 3");
        taskQueueStorage.print();

        taskQueueStorage.processTask("Задача 1");
        taskQueueStorage.print();
        taskQueueStorage.processTask("Задача 2");
        taskQueueStorage.print();
        taskQueueStorage.processTask("Задача 3");
        taskQueueStorage.print();

        LinkedList<String> taskStringData = new LinkedList<>(Arrays.asList(
                "Первая строка",
                "Вторая строка",
                "Третья строка",
                "Четвёртая строка",
                "Пятая строка"
        ));
        StringStorage taskStringStorage = new StringStorage(taskStringData);

        // Печать первого и последнего элементов (задача 3)
        taskStringStorage.printFirstAndLastElements();

        // Подсчёт суммы элементов (задача 4)
        taskIntStorage.calculateSum();

        // Обход в прямом и обратном направлении
        taskIntStorage.listIteratorInBothDirections();
    }
}
