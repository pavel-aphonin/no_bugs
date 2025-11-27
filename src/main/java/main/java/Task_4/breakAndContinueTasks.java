package main.java.Task_4;

import java.util.Scanner;

public class breakAndContinueTasks {
    public static void main(String[] args) {
        // Сумма всех чисел
        sum();

        // Вывод всех чисел, не делящихся на 3
        printNumbersNotDividingTo3();

        // Вывод всех положительных чисел
        printPositiveNumbers();

        // Ожидание команды "stop"
        waitStopCommand();
    }

    public static void sum() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            sum += number;

            if (number < 0) {
              break;
            }
        }

        System.out.println("Сумма всех чисел: " + sum);
    }

    public static void printNumbersNotDividingTo3() {
        int number = 1;

        while (number <= 20) {
            if (number % 3 == 0) {
                number += 1;
                continue;
            }

            if (number != 20) {
                System.out.print(number + ", ");
            } else {
                System.out.print(number);
            }

            number += 1;
        }
    }

    public static void printPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println(number);
            } else if (number < 0) {
                continue;
            } else {
                System.out.println("Завершение работы программы");
                break;
            }
        }
    }

    public static void waitStopCommand() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите команду: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                System.out.println("Завершение работы программы");
                break;
            }
        }
    }
}
