package Task_9.Exceptions.Subtask_4;

import Task_9.Exceptions.Subtask_3.InvalidUserAgeException;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;

public class Email {
    private final String email;

    public Email(String email) {
        this.email = email;
    }

    public void validateEmail() throws InvalidUserAgeException {
        try {
            InternetAddress internetAddress = new InternetAddress(this.email);
            internetAddress.validate();
            System.out.println("Допустимый email: \"" + this.email + "\"");
        } catch (AddressException error) {
            throw new InvalidUserAgeException("Недопустимый email \"" + this.email + "\": " + error.getMessage());
        }
    }
}
