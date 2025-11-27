package main.java.Task_8.ArrayList;

import java.util.*;

public class NumbersStorage {
    private final Collection<Integer> storage;
    private final List<Integer> evenNumbers;
    private int sum;
    private int maxNumber;

    public NumbersStorage(Collection<Integer> data) {
        this.storage = data;
        this.evenNumbers = new ArrayList<>();
    }

    public void addElement(Integer element) {
        storage.add(element);
    }

    public void print() {
        System.out.println(storage);
    }

    public void findEvenNumbers() {
        evenNumbers.clear();
        storage.forEach(
                element -> {
                    if (element % 2 == 0) {
                        evenNumbers.add(element);
                    }
                }
        );

        System.out.println(evenNumbers);
    }

    public void sumAllElements() {
        sum = 0;
        storage.forEach(
                element -> {
                    sum += element;
                }
        );

        System.out.println(sum);
    }

    public void findMaxNumber() {
        Iterator<Integer> iterator = storage.iterator();
        maxNumber = iterator.next();

        storage.forEach(
                element -> {
                    if (element > maxNumber) {
                        maxNumber = element;
                    }
                }
        );

        System.out.println(maxNumber);
    }
}
