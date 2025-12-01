package Task_4;

import java.util.Scanner;

public class DoWhileTasks {
    public static void main(String[] args) {
        // Ожидание целого числа
        askPositiveNumber();

        // Проверка пароля
        checkPassword();

        // Вывод чисел от 1 до 10
        printNumbersFrom1To10();

        // Ожидание команды "exit"
        askExitCommand();

        // Счётчик цифр в числе
        countNumbers();
    }

    public static void askPositiveNumber() {
        Scanner scanner = new Scanner(System.in);

        boolean isNumberFound = false;

        do {
            System.out.print("Введите целое число: ");

            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println("Введённое число является положительным");
                isNumberFound = true;

                scanner.close();
            }

        } while (!isNumberFound);
    }

    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);

        String expectedPassword = "123456";
        boolean isPasswordCorrect = false;

        do {
            System.out.print("Введите пароль: ");

            String actualPassword = scanner.nextLine();

            if (actualPassword.equals(expectedPassword)) {
                System.out.println("Введён правильный пароль");
                isPasswordCorrect = true;

                scanner.close();

            } else {
                System.out.println("Введён неправильный пароль");
            }

        } while (!isPasswordCorrect);
    }

    public static void printNumbersFrom1To10() {
        int number = 1;

        do {
            System.out.println(number);
            number += 1;
        } while(number <= 10);
    }

    public static void askExitCommand() {
        Scanner scanner = new Scanner(System.in);

        boolean isExitCommandReceived = false;

        do {
            System.out.print("Введите команду: ");

            String command = scanner.nextLine();

            if (command.equals("exit")) {
                System.out.println("Завершение работы программы");
                isExitCommandReceived = true;

                scanner.close();
            }

        } while (!isExitCommandReceived);
    }

    public static void countNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        boolean isCountingFinished = false;
        int numberCount = 0;

        do {
            if (number >= 1) {
                number = number / 10;
                numberCount += 1;
            } else {
                isCountingFinished = true;
                scanner.close();
            }
        } while (!isCountingFinished);

        System.out.println("Количество цифр: " + numberCount);
    }
}
