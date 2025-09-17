package Task_6.Subtask_8;

public class Museum {
    public void add(Exhibit exhibit) {
        System.out.println("Экспонат '" + exhibit.getName() + "' был доставлен в музей");
    }

    public void getInformation(Exhibit exhibit) {
        System.out.println("Экспонат: " + exhibit.getName());
        System.out.println("Историческая справка: " + exhibit.getHistory());
    }

    public void service(Exhibit exhibit) {
        exhibit.environmentControl();
        exhibit.restoration();
    }
}
