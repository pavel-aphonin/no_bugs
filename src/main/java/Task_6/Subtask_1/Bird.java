package Task_6.Subtask_1;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Птица летает");
    }

    @Override
    public void speak() {
        System.out.println("Птица чирикает");
    }
}
