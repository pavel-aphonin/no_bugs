package main.java.Task_8.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        // Создаём коллекцию и наполняем её пятью записями (задача 1)
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.printPhoneBook();
        phoneBook.addPhoneNumber(2223487, "Павел");
        phoneBook.addPhoneNumber(2396509, "Дарья");
        phoneBook.addPhoneNumber(4568912, "Сергей");
        phoneBook.addPhoneNumber(6538967, "Александра");
        phoneBook.addPhoneNumber(9993435, "Дмитрий");
        phoneBook.printPhoneBook();

        // Добавляем ещё контакты и ищем любой по номеру телефона (задача 2)
        phoneBook.addPhoneNumber(3281616, "Пётр");
        phoneBook.addPhoneNumber(5657893, "Иван");
        phoneBook.addPhoneNumber(2517453, "Светлана");
        phoneBook.findContactByNumber(2223487);
        phoneBook.findContactByNumber(2517453);
        phoneBook.findContactByNumber(1010111);

        // Создаём и наполняем историю просмотров (задача 3)
        UserViewHistory userViewHistory = new UserViewHistory();
        userViewHistory.printViewHistory();
        userViewHistory.addView("/index", "Главная");
        userViewHistory.addView("/register", "Регистрация");
        userViewHistory.addView("/login", "Вход");
        userViewHistory.addView("/users", "Пользователи");
        userViewHistory.addView("/search", "Поиск");
        userViewHistory.addView("/index", "Главная");
        userViewHistory.addView("/topics", "Список тем");
        userViewHistory.addView("/topic=123", "Тема 1");
        userViewHistory.addView("/topic=456", "Тема 2");
        userViewHistory.addView("/topic=789", "Тема 3");
        userViewHistory.printViewHistory();

        // Проверяем, что нельзя хранить более 10 записей
        userViewHistory.addView("/chat", "Чат");
        userViewHistory.addView("/index", "Главная");
        userViewHistory.addView("/logout", "Выход");
        userViewHistory.printViewHistory();
    }
}
