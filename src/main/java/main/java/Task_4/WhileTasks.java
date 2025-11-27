package main.java.Task_4;

import java.util.Scanner;

public class WhileTasks {
    public static void main(String[] args) {
        // Расчёт факториала
        printFactorial();

        // Вывод всех чётных чисел до выбранного числа
        printEvenNumbers();

        // Обратный отчёт
        countdown();
    }

    public static void printFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для расчёта факториала: ");
        int number = scanner.nextInt();

        int i = 1;
        int result = 1;

        while (i <= number) {
            result = result * i;
            i += 1;
        }

        System.out.println("Факториал " + number + " равен " + result);

        scanner.close();
    }

    public static void printEvenNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, до которого будут выведены все чётные числа: ");
        int number = scanner.nextInt();

        int i = 1;

        while (i <= number) {
            if (i % 2 == 0 && i < number) {
                System.out.print(i + ", ");
            }

            if (i % 2 == 0 && i == number) {
                 System.out.print(i);
            }

            i += 1;
        }
    }

    public static void countdown() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, от которого будет выполнен обратный отчёт: ");
        int number = scanner.nextInt();

        while (number >= 0) {
            System.out.println(number);
            number -= 1;
        }
    }
}
