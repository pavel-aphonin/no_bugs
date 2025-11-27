package main.java.Task_8.LinkedList;

import java.util.*;

public class QueueStorage {
    private final Collection<String> storage;

    public QueueStorage(Collection<String> storage) {
        this.storage = storage;
    }

    public void addTask(String task) {
        storage.add(task);
    }

    public void print() {
        System.out.println(storage);
    }

    public void processTask(String task) {
        storage.remove(task);
    }
}
