package main.java.Task_3;

public class Person {
    Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    private String firstName;
    private String lastName;
    private final String ssn;

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getSsn() {
        return this.ssn;
    }

    void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    void printPersonInfo() {
        String text = "Имя: " + this.firstName + ", Фамилия: " + this.lastName + ", SSN: " + this.ssn;
        System.out.println(text);
    }

    public static void main(String[] args) {
        Person person_1 = new Person("Иван", "Иванов", "123-45-6789");
        Person person_2 = new Person("Пётр", "Петров", "000-11-1234");
        Person person_3 = new Person("Сергей", "Сергеев", "99-88-7654");

        person_1.printPersonInfo();
        person_2.printPersonInfo();
        person_3.printPersonInfo();

        person_2.setFirstName("Павел");

        person_1.printPersonInfo();
        person_2.printPersonInfo();
        person_3.printPersonInfo();
    }
}
