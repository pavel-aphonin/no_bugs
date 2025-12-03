package Task_10.Part_1.Subtask_3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (number) -> number % 2 == 0;

        // Проверяем набор чисел
        System.out.println(isEven.test(5));
        System.out.println(isEven.test(0));
        System.out.println(isEven.test(1));
        System.out.println(isEven.test(2));
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(-2));
        System.out.println(isEven.test(-1));
        System.out.println(isEven.test(1000000));
        System.out.println(isEven.test(15));
    }
}
