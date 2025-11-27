package main.java.Task_8.HashMap;

public class Main {
    public static void main(String[] args) {
        // Создаём карту и наполняем её пользователями, печатаем пользователей (задача 1)
        Users users = new Users();
        users.print();
        users.addUser("Павел", 34);
        users.addUser("Дарья", 25);
        users.addUser("Александра", 14);
        users.addUser("Сергей", 18);
        users.addUser("Дмитрий", 17);
        users.print();

        // Ищем нужного пользователя по имени (задача 2)
        users.findUserByName("Павел");
        users.findUserByName("Пётр");
        users.findUserByName("Дарья");

        // Печать всех пользователей моложе 18 лет (задача 3)
        users.printUsersYoungerThan(18);
    }
}
