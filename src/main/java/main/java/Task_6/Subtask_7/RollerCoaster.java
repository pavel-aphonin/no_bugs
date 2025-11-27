package main.java.Task_6.Subtask_7;

public class RollerCoaster implements Attraction {
    public RollerCoaster(String name) {
        this.name = name;
    }

    private final String name;

    @Override
    public void service() {
        System.out.println("Было выполнено обслуживание аттракциона '" + this.getName() + "'");
    }

    @Override
    public void check() {
        System.out.println("Была выполнена проверка аттракциона '" + this.getName() + "'");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
