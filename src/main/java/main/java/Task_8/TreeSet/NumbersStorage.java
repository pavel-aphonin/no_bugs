package main.java.Task_8.TreeSet;

import java.util.*;

public class NumbersStorage {
    private final TreeSet<Integer> storage;

    public NumbersStorage() {
        this.storage = new TreeSet<>();
    }

    public void addElement(Integer element) {
        storage.add(element);
    }

    public void print() {
        System.out.println(storage);
    }

    public void findLowerAndHigherElements(Integer element) {
        Integer min = storage.lower(element);
        Integer max = storage.higher(element);

        if (min == null ) {
            System.out.println("Меньшее значение: нет, большее значение: " + max);
        } else if (max == null) {
            System.out.println("Меньшее значение: " + min + " , большее значение: нет");
        } else {
            System.out.println("Меньшее значение: " + min + " , большее значение: " + max);
        }
    }
}
