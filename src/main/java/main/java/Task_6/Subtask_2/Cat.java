package main.java.Task_6.Subtask_2;

public class Cat extends Pet {
    public Cat(String name, String feedType) {
        super(name, feedType);
    }

    @Override
    public void move() {
        System.out.println("Кошка играет");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест " + this.getFeedType());
    }
}
