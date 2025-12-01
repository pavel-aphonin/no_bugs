package Task_9.Generics.Subtask_1;

public class Main {
    public static void main(String[] args) {
        // Объект для строк
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Простая текстовая строка");

        // Объект для чисел
        Box<Integer> numberBox = new Box<>();
        numberBox.setItem(5);

        // Получаем и выводим значения
        System.out.println(stringBox.getItem());
        System.out.println(numberBox.getItem());
    }
}
