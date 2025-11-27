package main.java.Task_8.LinkedHashSet;

import java.util.*;

public class StringStorage {
    private final Set<String> storage;

    public StringStorage() {
        this.storage = new LinkedHashSet<>();
    }

    public void print() {
        System.out.println(storage);
    }

    public void addElement(String element) {
        storage.add(element);
    }
}
