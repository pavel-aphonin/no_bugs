package main.java.Task_6.Subtask_7;

public class Park {
    public void add(Attraction attraction) {
        System.out.println("Аттракцион '" + attraction.getName() + "' был установлен в парке");
    }

    public void control(Attraction attraction) {
        attraction.check();
        attraction.service();
    }

    public void getInfo(Attraction attraction) {
        System.out.println("Аттракцион '" + attraction.getName() + "' открыт для посетителей");
    }
}
