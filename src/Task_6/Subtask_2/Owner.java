package Task_6.Subtask_2;

public class Owner {
    public void add(Pet pet) {
        System.out.println("Домашний питомец '" + pet.getName() + "' нашёл хозяина");
    }

    public void care(Pet pet) {
        pet.move();
        pet.eat();
    }
}
