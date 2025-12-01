package Task_6.Subtask_7;

public class Carousel implements Attraction {
    public Carousel(String name) {
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
