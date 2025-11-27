package main.java.Task_8.TreeSet;

public class Main {
    public static void main(String[] args) {
        NumbersStorage taskIntStorage = new NumbersStorage();

        // Наполняем дерево элементами и выводим (задача 1)
        taskIntStorage.print();
        taskIntStorage.addElement(1);
        taskIntStorage.addElement(25);
        taskIntStorage.addElement(-10);
        taskIntStorage.addElement(1000);
        taskIntStorage.addElement(-5000);
        taskIntStorage.print();

        // Добавляем дубликаты и убеждаемся, что они не добавились (задача 2)
        taskIntStorage.addElement(-5000);
        taskIntStorage.addElement(1);
        taskIntStorage.addElement(1000);
        taskIntStorage.print();

        // Находим ближайшее большее и ближайшее меньшее к заданному (задача 3)
        taskIntStorage.findLowerAndHigherElements(25);
        taskIntStorage.findLowerAndHigherElements(-5000);
        taskIntStorage.findLowerAndHigherElements(1000);
    }
}
