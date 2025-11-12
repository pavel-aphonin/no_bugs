package Task_8.ArrayList;

import java.util.*;

public class NumbersStorage {
    private final Collection<Integer> storage;
    private final List<Integer> evenNumbers;
    private int sum;
    private int maxNumber;

    public NumbersStorage(Collection<Integer> data) {
        this.storage = data;
        this.evenNumbers = new ArrayList<>();
        this.sum = 0;
        this.maxNumber = 0;
    }

    public void addElement(Integer element) {
        storage.add(element);
    }

    public void print() {
        System.out.println(storage);
    }

    public void findEvenNumbers() {
        storage.forEach(
                element -> {
                    if (element % 2 == 0) evenNumbers.add(element);
                }
        );

        System.out.println(this.evenNumbers);
    }

    public void sumAllElements() {
        storage.forEach(
                element -> {
                    this.sum += element;
                }
        );

        System.out.println(this.sum);
    }

    public void findMaxNumber() {
        this.storage.forEach(
                element -> {
                    if (element > this.maxNumber) {
                        this.maxNumber = element;
                    }
                }
        );

        System.out.println(this.maxNumber);
    }
}
