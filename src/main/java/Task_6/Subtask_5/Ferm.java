package Task_6.Subtask_5;

public class Ferm {
    public void add(Animal animal) {
        System.out.println("Животное '" + animal.getName() + "' появилось на ферме");
    }

    public void control(Animal animal) {
        animal.getCare();
        animal.executeFunction();
    }
}
