package main.java.Task_6.Subtask_4;

public abstract class Beast {
    public Beast(String name, String speed) {
        this.name = name;
        this.speed = speed;
    }

    private final String name;
    private final String speed;

    public String getName() {
        return name;
    }

    public String getSpeed() {
        return speed;
    }

    public abstract void move();
}
