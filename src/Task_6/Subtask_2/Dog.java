package Task_6.Subtask_2;

public class Dog extends Pet {
    public Dog(String name, String feedType) {
        super(name, feedType);
    }

    @Override
    public void move() {
        System.out.println("Собака гуляет");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест " + this.getFeedType());
    }
}
