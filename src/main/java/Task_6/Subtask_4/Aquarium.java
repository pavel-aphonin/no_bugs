package Task_6.Subtask_4;

public class Aquarium {
    public void add(Beast beast) {
        System.out.println("В аквариуме появилось новое животное: '" + beast.getName() + "'");
    }

    public void show(Beast beast) {
        beast.move();
    }
}
