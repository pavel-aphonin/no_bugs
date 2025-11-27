package main.java.Task_8.Extra.Tasks;

import java.util.LinkedList;
import java.util.List;

public class Tasks {
    private final List<String> tasks;

    public Tasks() {
        this.tasks = new LinkedList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void processedAllTasks() {
        while (!tasks.isEmpty()) {
            tasks.removeFirst();
        }
    }

    public String processedNextTask() {
        return tasks.removeFirst();
    }

    public Boolean removeTask(String task) {
        return tasks.remove(task);
    }

    public void printTasks() {
        System.out.println(tasks);
    }

    public void clearAllTasks() {
        tasks.clear();
    }
}
