package Task_2;

public class Teacher {
    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public static void main(String[] args) {
        Teacher teacher_1 = new Teacher("Марина Ивановна", "Русский Язык");
        teacher_1.setSubject("Математика");
        teacher_1.printInfo();
    }

    String name;
    String subject;

    String getName() {
        return this.name;
    }

    String getSubject() {
        return this.subject;
    }

    void setName(String newName) {
        this.name = newName;
    }

    void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    void printInfo() {
        System.out.println(this.name + " - " + this.subject);
    }
}
