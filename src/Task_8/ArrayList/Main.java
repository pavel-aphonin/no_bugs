package Task_8.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> taskIntData = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        NumbersStorage taskIntStorage = new NumbersStorage(taskIntData);

        // Выводим данные после создания (задача 1)
        taskIntStorage.print();

        // Добавляем элемент и выводим данные (задача 1)
        taskIntStorage.addElement(6);
        taskIntStorage.print();

        // Ищем все чётные числа (задача 2)
        taskIntStorage.findEvenNumbers();

        Collection<String> taskStringData = new ArrayList<String>(Arrays.asList(
                "Это первая строка",
                "Это вторая строка",
                "Это третья строка",
                "Это четвёртая строка самая длинная",
                "Это пятая строка",
                "Это шестая строка длинная"
        ));
        StringStorage taskStringStorage = new StringStorage(taskStringData);

        // Ищем самую длинную строку (задача 3)
        taskStringStorage.findLongestString();

        // Складываем все числа (задача 4)
        taskIntStorage.sumAllElements();

        // Находим самое большое число (задача 5)
        taskIntStorage.findMaxNumber();
    }
}
