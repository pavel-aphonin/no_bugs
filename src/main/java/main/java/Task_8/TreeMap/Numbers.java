package main.java.Task_8.TreeMap;

import java.util.*;

public class Numbers {
    private final TreeMap<Integer, Integer> numbers;

    public Numbers() {
        this.numbers = new TreeMap<>();
    }

    public void addNumber(Integer number) {
        numbers.put(number, number);
    }

    public void findMin() {
        System.out.println(numbers.firstEntry().getValue());
    }

    public void findMax() {
        System.out.println(numbers.lastEntry().getValue());
    }
}
