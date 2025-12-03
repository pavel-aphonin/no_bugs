package Task_10.Part_1.Subtask_1;

public class Main {
    public static void main(String[] args) {
        // Реализуем интерфейс
        MathOperation add = (x, y) -> x + y;
        MathOperation substraction = (x, y) -> x - y;
        MathOperation multiplication = (x, y) -> x * y;
        MathOperation division = (x, y) -> (double) x / y;

        // Вызываем реализации
        System.out.println(add.operate(20, 30));
        System.out.println(substraction.operate(20, 30));
        System.out.println(multiplication.operate(20, 30));
        System.out.println(division.operate(20, 30));
    }
}
