package Task_9.Extras.Subtask_1;

public class Main {
    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>("Тестовая строка");
        Storage<Integer> integerStorage = new Storage<>(1000);

        // Выводим содержимое
        System.out.println(stringStorage.getElement());
        System.out.println(integerStorage.getElement());
    }
}
