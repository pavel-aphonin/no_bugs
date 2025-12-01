package Task_8.ArrayDeque;

import java.util.*;

public class Tasks {
    private final ArrayDeque<String> tasks;

    public Tasks() {
        this.tasks = new ArrayDeque<>();
    }

    public void addTask(String task) {
        tasks.addLast(task);
    }

    public void doingTasks() {
        while (!tasks.isEmpty()) {
            tasks.pollLast();
            System.out.println(tasks);
        }
    }

    public void printTasks() {
        System.out.println(tasks);
    }
}
