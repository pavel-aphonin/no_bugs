package main.java.Task_8.Extra.PhoneBook;

import java.util.HashMap;

public class PhoneBook {
    private final HashMap<Integer, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addContact(Integer phone, String name) {
        if (phoneBook.get(phone) != null) {
            System.out.println("Контакт с номером телефона \"" + phone + "\" уже существует");
        } else {
            phoneBook.put(phone, name);
        }
    }

    public void updateContact(Integer phone, String newName) {
        if (phoneBook.get(phone) == null) {
            System.out.println("Контакт с номером телефона \"" + phone + "\" не был найден");
        } else {
            phoneBook.put(phone, newName);
        }
    }

    public void findContact(Integer phone) {
        if (phoneBook.get(phone) == null) {
            System.out.println("Контакт с номером телефона \"" + phone + "\" не был найден");
        } else {
            System.out.println(phoneBook.get(phone));
        }
    }

    public void removeContact(Integer phone) {
        if (phoneBook.get(phone) == null) {
            System.out.println("Контакт с номером телефона \"" + phone + "\" не был найден");
        } else {
            phoneBook.remove(phone);
        }
    }

    public void showAllContacts() {
        System.out.println(phoneBook);
    }

    public void clearPhoneBook() {
        phoneBook.clear();
    }
}
