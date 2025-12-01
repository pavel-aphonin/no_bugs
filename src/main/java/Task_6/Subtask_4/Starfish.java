package Task_6.Subtask_4;

public class Starfish extends Beast {
    public Starfish(String name, String speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println("Морская звезда "  + this.getSpeed() + " ползает по дну");
    }
}
