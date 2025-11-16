package Task_8.HashMap;

import java.util.*;

public class Users {
    private final Map<String, Integer> storage;

    public Users() {
        this.storage = new HashMap<>();
    }

    public void addUser(String name, Integer age) {
        storage.put(name, age);
    }

    public void print() {
        System.out.println(storage);
    }

    public void findUserByName(String name) {
        boolean isUserExist = storage.containsKey(name);

        if (isUserExist) {
            System.out.println("Пользователь с именем \"" + name + "\" найден");
        } else {
            System.out.println("Пользователь с именем \"" + name + "\" не найден");
        }
    }

    public void printUsersYoungerThan(Integer limit) {
        storage.forEach((name, age) -> {
            if (age < limit) {
                System.out.println(name + " - " + age);
            }
        });
    }
}
