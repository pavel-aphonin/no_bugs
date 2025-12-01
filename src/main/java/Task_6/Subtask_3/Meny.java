package Task_6.Subtask_3;

public class Meny {
    public void add(Dish dish) {
        System.out.println("В меню добавлена новая позиция: " + dish.getName());
    }

    public void show(Dish dish) {
        dish.showDescription();
    }
}
