package Task_8.Extra.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Наполняем справочник контактами
        phoneBook.showAllContacts();
        phoneBook.addContact(2229645, "Павел");
        phoneBook.addContact(5493747, "Сергей");
        phoneBook.addContact(4698152, "Дарья");
        phoneBook.addContact(3650975, "Александра");
        phoneBook.addContact(1298456, "Дмитрий");
        phoneBook.showAllContacts();

        // Пробуем добавить дубли
        phoneBook.addContact(2229645, "Павел");
        phoneBook.addContact(4698152, "Дарья");
        phoneBook.showAllContacts();

        // Обновляем контакты
        phoneBook.updateContact(3650975, "Саша");
        phoneBook.updateContact(1298456, "Дима");
        phoneBook.showAllContacts();

        // Пробуем обновить несуществующий контакт
        phoneBook.updateContact(5612345, "Иван");
        phoneBook.showAllContacts();

        // Находим контакт по номеру телефона
        phoneBook.findContact(2229645);
        phoneBook.findContact(5493747);

        phoneBook.removeContact(1298456);
        phoneBook.showAllContacts();
        phoneBook.removeContact(4698152);
        phoneBook.showAllContacts();

        // Очищаем адресную книгу
        phoneBook.clearPhoneBook();
        phoneBook.showAllContacts();
    }
}
