package Task_6.Subtask_3;

public class Drink extends Dish {
    public Drink(String name, String description, int volume) {
        super(name, description);
        this.volume = volume;
    }

    private final int volume;

    public int getVolume() {
        return volume;
    }

    @Override
    public void showDescription() {
        System.out.println("Напиток - '" + this.getName() + "'");
        System.out.println("Описание напитка: " + this.getDescription());
        System.out.println("Объём: " + this.getVolume() + " мл");
    }
}
