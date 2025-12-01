package Task_6.Subtask_4;

public class Shark extends Beast {
    public Shark(String name, String speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println("Акула плавает " + this.getSpeed());
    }
}
