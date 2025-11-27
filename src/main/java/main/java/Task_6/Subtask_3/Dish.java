package main.java.Task_6.Subtask_3;

public abstract class Dish {
    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
    }

    private final String name;
    private final String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public abstract void showDescription();
}
