package main.java.Task_6.Subtask_2;

public abstract class Pet {
    public Pet(String name, String feedType) {
        this.name = name;
        this.feedType = feedType;
    }
    private final String name;
    private final String feedType;

    public String getName() {
        return name;
    }

    public String getFeedType() {
        return feedType;
    }

    public abstract void move();
    public abstract void eat();
}
