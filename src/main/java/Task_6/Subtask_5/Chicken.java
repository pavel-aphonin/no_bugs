package Task_6.Subtask_5;

public class Chicken implements Animal {
    public Chicken(String name) {
        this.name = name;
    }

    private final String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void executeFunction() {
        System.out.println(this.getName() + " несёт яйца");
    }

    @Override
    public void getCare() {
        System.out.println(this.getName() + " ест корм с зерном");
    }
}
