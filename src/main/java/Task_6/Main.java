package Task_6;

import Task_6.Subtask_8.Manuscript;
import Task_6.Subtask_8.Museum;
import Task_6.Subtask_8.Sculpture;

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

//        Aquarium aquarium = new Aquarium();
//        Shark shark = new Shark("Акула", "быстро и агрессивно");
//        Starfish starfish = new Starfish("Морская звезда", "медленно");
//
//        aquarium.add(shark);
//        aquarium.add(starfish);
//
//        aquarium.show(shark);
//        aquarium.show(starfish);

//        Ferm ferm = new Ferm();
//        Cow cow = new Cow("Корова");
//        Chicken chicken = new Chicken("Курица");
//
//        ferm.add(cow);
//        ferm.add(chicken);
//
//        ferm.control(cow);
//        ferm.control(chicken);

//        Garden garden = new Garden();
//        Orchid orchid = new Orchid("Орхидея", "много", "частый");
//        Cactus cactus = new Cactus("Кактус", "мало", "редкий");
//
//        garden.add(orchid);
//        garden.add(cactus);
//
//        garden.getCare(orchid);
//        garden.getCare(cactus);

//        Park park = new Park();
//        RollerCoaster rollerCoaster = new RollerCoaster("Американские горки");
//        Carousel carousel = new Carousel("Карусель");
//
//        park.add(rollerCoaster);
//        park.add(carousel);
//
//        park.control(rollerCoaster);
//        park.control(carousel);
//
//        park.getInfo(rollerCoaster);
//        park.getInfo(carousel);

        Museum museum = new Museum();
        Sculpture sculpture = new Sculpture("Скульптура", 25, 50, "История скульптуры");
        Manuscript manuscript = new Manuscript("Древний манускрипт", 15, 20, "История древнего манускрипта");

        museum.add(sculpture);
        museum.add(manuscript);

        museum.getInformation(sculpture);
        museum.getInformation(manuscript);

        museum.service(sculpture);
        museum.service(manuscript);
    }
}
