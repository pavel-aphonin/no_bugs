package Task_6.Subtask_1;

public class Zoo {
    public void add(Animal animal) {
        System.out.println("Животное '" + animal.getName() + "' принято в зоопарк");
    }

    public void show(Animal animal) {
        animal.move();
        animal.speak();
    }
}
