package Task_9.Generics.Subtask_2;

public class Main {
    public static void main(String[] args) {
        PrintableArray array = new PrintableArray();

        // Подготавливаем массивы
        String[] stringArray = {"Один", "Два", "Три", "Четыре", "Пять"};
        Integer[] integerArray = {1, 2, 3, 4, 5};

        // Выводим массивы в консоль
        array.printArray(stringArray);
        array.printArray(integerArray);
    }
}
