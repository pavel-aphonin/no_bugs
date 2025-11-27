package main.java.Task_8.LinkedHashMap;

import java.util.*;

public class PhoneBook {
    private final Map<Integer, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new LinkedHashMap<>();
    }

    public void addPhoneNumber(Integer number, String name) {
        if (!phoneBook.containsKey(number)) {
            phoneBook.put(number, name);
        } else {
            System.out.println("Запись с номером телефона \"" + number + "\" уже есть в телефонной книге");
        }
    }

    public void editPhoneNumber(Integer number, String name) {
        if (phoneBook.containsKey(number)) {
            phoneBook.put(number, name);
        } else {
            System.out.println("Записи с номером телефона \"" + number + "\" не найдено в телефонной книге");
        }
    }

    public void deletePhoneNumber(Integer number) {
        if (phoneBook.containsKey(number)) {
            phoneBook.remove(number);
        } else {
            System.out.println("Записи с номером телефона \"" + number + "\" не найдено в телефонной книге");
        }
    }

    public void findContactByNumber(Integer number) {
        if (phoneBook.containsKey(number)) {
            System.out.println(phoneBook.get(number));
        } else {
            System.out.println("Записи с номером телефона \"" + number + "\" не найдено в телефонной книге");
        }
    }

    public void printPhoneBook() {
        System.out.println(phoneBook);
    }


}
