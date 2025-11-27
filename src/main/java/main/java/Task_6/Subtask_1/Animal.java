package main.java.Task_6.Subtask_1;

public abstract class Animal {
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private final String name;

    public abstract void move();

    public abstract void speak();
}
