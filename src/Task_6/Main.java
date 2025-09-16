package Task_6;

import Task_6.Subtask_2.Cat;
import Task_6.Subtask_2.Dog;
import Task_6.Subtask_2.Owner;
import Task_6.Subtask_3.Dish;
import Task_6.Subtask_3.Drink;
import Task_6.Subtask_3.HotDish;
import Task_6.Subtask_3.Meny;
import Task_6.Subtask_4.Aquarium;
import Task_6.Subtask_4.Shark;
import Task_6.Subtask_4.Starfish;

public class Main {
    public static void main(String[] args) {
//        Zoo zoo = new Zoo();
//        Elephant elephant = new Elephant("Слон");
//        Bird bird = new Bird("Птица");
//
//        zoo.add(elephant);
//        zoo.add(bird);
//
//        zoo.show(elephant);
//        zoo.show(bird);

//        Owner owner = new Owner();
//        Cat cat = new Cat("Кошка", "влажный корм");
//        Dog dog = new Dog("Собака", "сухой корм");
//
//        owner.add(cat);
//        owner.add(dog);
//
//        owner.care(cat);
//        owner.care(dog);

//        Meny meny = new Meny();
//        HotDish soup = new HotDish("Суп", "описание супа", 80);
//        Drink juice = new Drink("Сок", "описание сока", 1000);
//
//        meny.add(soup);
//        meny.add(juice);
//
//        meny.show(soup);
//        meny.show(juice);

        Aquarium aquarium = new Aquarium();
        Shark shark = new Shark("Акула", "быстро и агрессивно");
        Starfish starfish = new Starfish("Морская звезда", "медленно");

        aquarium.add(shark);
        aquarium.add(starfish);

        aquarium.show(shark);
        aquarium.show(starfish);
    }
}
