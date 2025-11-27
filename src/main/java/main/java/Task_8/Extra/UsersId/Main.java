package main.java.Task_8.Extra.UsersId;

public class Main {
    public static void main(String[] args) {
        UsersId usersId = new UsersId();

        // Наполняем хранилище
        usersId.printUsersIds();
        usersId.addUserId(1);
        usersId.addUserId(2);
        usersId.addUserId(3);
        usersId.addUserId(4);
        usersId.addUserId(5);
        usersId.printUsersIds();

        // Пробуем добавить дубли
        usersId.addUserId(5);
        usersId.addUserId(1);
        usersId.printUsersIds();

        // Ищем нужного пользователя
        System.out.println(usersId.findUserId(1));
        System.out.println(usersId.findUserId(5));
        System.out.println(usersId.findUserId(10));
        System.out.println(usersId.findUserId(0));
        System.out.println(usersId.findUserId(3));

        // Удаляем пользователя
        usersId.removeUserId(5);
        System.out.println(usersId.findUserId(5));
        System.out.println(usersId.removeUserId(10));
        usersId.removeUserId(2);
        usersId.printUsersIds();
    }
}
