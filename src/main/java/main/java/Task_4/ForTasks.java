package main.java.Task_4;

import java.util.Scanner;

public class ForTasks {
    public static void main(String[] args) {
        // Печать чисел, которые делятся на 3
        printNumbersDivisibleBy3();

        // Сумма чисел от 1 до N
        sumNumbers();

        // Печать таблицы умножения для числа
        printMultiplyTables();

        // Проверка на простое число
        checkNumberSimple();

        // Печать чисел от 1 до 10
        printNumbers();
    }

    public static void printNumbersDivisibleBy3() {
        for (int i = 1; i <= 100; i += 1) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void sumNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, до которого будет произведено сложение: ");
        int N = scanner.nextInt();

        int summ = 0;

        for (int i = 1; i <= N; i += 1) {
            summ += i;
        }

        System.out.println("Результат: " + summ);

        scanner.close();
    }

    public static void printMultiplyTables() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, для которого нужна таблица умножения: ");
        int N = scanner.nextInt();

        for (int i = 0; i <= 10; i += 1) {
            System.out.println(N + " x " + i + " = " + (i * N));
        }

        scanner.close();
    }

    public static void checkNumberSimple() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите проверяемое число число: ");
        int N = scanner.nextInt();
        boolean isNumberSimple = true;

        for (int i = 2; i < Math.abs(N); i += 1) {
            if (N % i == 0) {
                isNumberSimple = false;
                break;
            }
        }

        System.out.println((isNumberSimple) ? "Число является простым" : "Число является составным");

        scanner.close();
    }

    public static void printNumbers() {
        for (int i = 1; i <= 10; i += 1) {
            System.out.print((i < 10) ? i + ", " : i);
        }
    }
}
