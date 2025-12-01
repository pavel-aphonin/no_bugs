package Task_9.Exceptions.Subtask_4;

import Task_9.Exceptions.Subtask_3.InvalidUserAgeException;

public class Main {
    public static void main(String[] args) throws InvalidUserAgeException {
        Email email1 = new Email("pavel.aphonin@gmail.com");
        Email email2 = new Email("pavel.aphonin.gmail.com");
        Email email3 = new Email("@gmail.com");
        Email email4 = new Email("");
        Email email5 = new Email("pavel.aphonin#gmail.com");

        // Выполняем проверку email
        email1.validateEmail();
        email2.validateEmail();
        email3.validateEmail();
        email4.validateEmail();
        email5.validateEmail();
    }
}
