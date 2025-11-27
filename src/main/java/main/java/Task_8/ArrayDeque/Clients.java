package main.java.Task_8.ArrayDeque;

import java.util.*;

public class Clients {
    private final ArrayDeque<String> clients;

    public Clients() {
        this.clients = new ArrayDeque<>();
    }

    public void addClientFirst(String client) {
        clients.addFirst(client);
    }

    public void addClientLast(String client) {
        clients.addLast(client);
    }

    public void removeFirstClient() {
        clients.pollFirst();
    }

    public void removeLastClient() {
        clients.pollLast();
    }

    public void print() {
        System.out.println(clients);
    }
}
