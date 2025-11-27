package main.java.Task_6.Subtask_3;

public class HotDish extends Dish {
    public HotDish(String name, String description, int temperature) {
        super(name, description);
        this.temperature = temperature;
    }

    private final int temperature;

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void showDescription() {
        System.out.println("Горячее блюдо - '" + this.getName() + "'");
        System.out.println("Описание блюда: " + this.getDescription());
        System.out.println("Температура подачи: " + this.getTemperature() + " C");
    }
}
