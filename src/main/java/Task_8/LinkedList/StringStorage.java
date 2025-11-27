package Task_8.LinkedList;

import java.util.*;

public class StringStorage {
    private final List<String> storage;

    public StringStorage(List<String> storage) {
        this.storage = storage;
    }

    public void printFirstAndLastElements() {
        String firstElement = storage.getFirst();
        String lastElement = storage.getLast();

        System.out.println("Первый элемент: \"" + firstElement + "\", последний элемент: \"" + lastElement + "\"");
    }
}
