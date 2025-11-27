package main.java.Task_8.ArrayDeque;

import java.util.*;

public class Orders {
    private final ArrayDeque<Integer> orders;

    public Orders() {
        this.orders = new ArrayDeque<>();
    }

    public void addOrder(Integer id) {
        orders.add(id);
    }

    public void print() {
        System.out.println(orders);
    }
}
