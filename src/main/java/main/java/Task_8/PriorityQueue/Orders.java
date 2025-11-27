package main.java.Task_8.PriorityQueue;

import java.util.*;

public class Orders {
    private final PriorityQueue<Integer> orders;

    public Orders() {
        this.orders = new PriorityQueue<>();
    }

    public void addOrder(Integer id) {
        orders.add(id);
    }

    public void processedAndPrintOrders() {
        while (!orders.isEmpty()) {
            System.out.println(orders.poll());
        }
    }
}
