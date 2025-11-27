package main.java.Task_4;

import java.util.Scanner;

public class IfElseTasks {
    public static void main(String[] args) {
        // Определение знака числа
         checkNumber();

        // Поиск наибольшего из двух чисел
         findMaxNumber();

        // Печать оценки
         printEvaluate();

        // Проверка чётности числа
         checkParity();

        // Определение размера скидки
         calculateDiscount();

        // Печать оценки за тест
        printTestEvaluating();
    }

    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }

        scanner.close();
    }

    public static void findMaxNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int X = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int Y = scanner.nextInt();

        if (X > Y) {
            System.out.println("Наибольшее число: " + X);
        } else if (Y > X) {
            System.out.println("Наибольшее число: " + Y);
        } else {
            System.out.println("Числа равны");
        }

        scanner.close();
    }

    public static void printEvaluate() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите оценку (от 1 до 5): ");
        int evaluate = scanner.nextInt();

        if (evaluate == 5) {
            System.out.println("Отлично");
        } else if (evaluate == 4) {
            System.out.println("Хорошо");
        } else if (evaluate == 3) {
            System.out.println("Удовлетворительно");
        } else if (evaluate == 2 || evaluate == 1) {
            System.out.println("Неудовлетворительно");
        } else {
            System.out.println("Неизвестная оценка");
        }

        scanner.close();
    }

    public static void checkParity() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число является чётным");
        } else {
            System.out.println("Число является нечётным");
        }
    }

    public static void calculateDiscount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите ваш возраст: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Ваша скидка составляет 25%");
        } else if (age >= 65) {
            System.out.println("Ваша скидка составляет 30%");
        } else {
            System.out.println("Для Вас не предусмотрена скидка");
        }
    }

    public static void printTestEvaluating() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите полученную оценку за тест: ");
        int evaluate = scanner.nextInt();

        if (evaluate >= 90) {
            System.out.println("Отлично");
        } else if (evaluate >= 75 && evaluate < 90) {
            System.out.println("Хорошо");
        } else if (evaluate >= 60 && evaluate < 75) {
            System.out.println("Удовлетворительно");
        } else if (evaluate < 60) {
            System.out.println("Неудовлетворительно");
        }

        scanner.close();
    }
}
