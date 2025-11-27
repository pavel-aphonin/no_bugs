package main.java.Task_4;

import java.util.Scanner;

public class SwitchTasks {
    public static void main(String[] args) {
        // Печать наименования дня недели
        // printDayOfWeek();

        // Печать стоимости билета
        // calculateTicketCost();

        // Перевод оценок из чисел в буквы
        //convertNumberEvaluateToChar();

        // Обработка текстовых команд
        // printTextCommand();

        // Простой калькулятор
        calculator();
    }

    public static void printDayOfWeek() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня недели: ");
        int day = scanner.nextInt();

        switch(day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");

            default -> System.out.println("Неизвестный день недели");
        }

        scanner.close();
    }

    public static void calculateTicketCost() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня недели: ");
        int day = scanner.nextInt();

        switch(day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Стоимость билета - 300 рублей");
                break;
            case 6: case 7:
                System.out.println("Стоимость билета - 450 рублей");
                break;

            default:
                System.out.println("Неизвестный день недели");
        }

        scanner.close();
    }

    public static void convertNumberEvaluateToChar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Вашу оценку: ");
        int evaluate = scanner.nextInt();

        if (evaluate <= 100 && evaluate >= 90) {
            System.out.println("A");
        } else if (evaluate >= 80 && evaluate <= 89) {
            System.out.println("B");
        } else if (evaluate >= 70 && evaluate <= 79) {
            System.out.println("C");
        } else if (evaluate >= 60 && evaluate <=90) {
            System.out.println("D");
        } else if (evaluate < 60) {
            System.out.println("F");
        } else {
            System.out.println("Недопустимая оценка");
        }
        scanner.close();
    }

    public static void printTextCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String command = scanner.nextLine();

        String status = "Программа запущена";

        switch (command) {
            case "start": {
                System.out.println("Программа запущена");
                status = "Программа запущена";
                break;
            }
            case "stop": {
                System.out.println("Программа остановлена");
                status = "Программа остановлена";
                break;
            }

            case "restart": {
                System.out.println("Программа перезапущена");
                status = "Программа запущена";
                break;
            }

            case "status": {
                System.out.println(status);
                break;
            }

            default: {
                System.out.println("Неизвестная команда '" + command + "'");
            }
        }
    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int X = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int Y = scanner.nextInt();

        System.out.print("Задайте операцию: ");
        String operation = scanner.next();

        switch(operation) {
            case "+": {
                System.out.println(X + Y);
                break;
            }
            case "-": {
                System.out.println(X - Y);
                break;
            }
            case "*": {
                System.out.println(X * Y);
                break;
            }
            case "/": {
                if (Y != 0) {
                    System.out.println(X / Y);
                } else {
                    System.out.println("Деление на ноль запрещено");
                }
                break;
            }

            default: {
                System.out.println("Неизвестная математическая операция '" + operation + "'");
            }
        }
    }
}
