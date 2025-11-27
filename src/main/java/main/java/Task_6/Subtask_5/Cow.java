package main.java.Task_6.Subtask_5;

public class Cow implements Animal {
    public Cow(String name) {
        this.name = name;
    }

    private final String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void executeFunction() {
        System.out.println(this.getName() + " даёт молоко");
    }

    @Override
    public void getCare() {
        System.out.println(this.getName() + " находится на выпасе");
    }
}
