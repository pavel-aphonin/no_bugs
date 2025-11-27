package main.java.Task_8.LinkedList;

import java.util.*;

public class NumbersStorage {
    private final List<Integer> storage;

    public NumbersStorage(List<Integer> data) {
        this.storage = data;
    }

    public void addElement(Integer element) {
        storage.add(element);
    }

    public void print() {
        System.out.println(storage);
    }

    public void calculateSum(){
        int sum = 0;

        for (Integer element : storage) {
            sum += element;
        }

        System.out.println(sum);
    }

    public void listIteratorInBothDirections() {
        ListIterator<Integer> iterator = storage.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
