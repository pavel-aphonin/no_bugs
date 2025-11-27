package main.java.Task_6.Subtask_1;

public class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Слон ходит");
    }

    @Override
    public void speak() {
        System.out.println("Слон трубит");
    }
}
