package Task_9.Exceptions.Subtask_3;

public class Main {
    public static void main(String[] args) throws InvalidUserAgeException {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();

        // Задаём возраст пользователям
        user1.setAge(0);
        user2.setAge(50);
        user3.setAge(150);
        user4.setAge(-1);
        user5.setAge(151);
    }
}
