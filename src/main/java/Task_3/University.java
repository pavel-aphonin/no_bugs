package Task_3;

public class University {
    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static String universityName = "МГУ";

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    final int studentID;
    String studentName;

    String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        String text = "Студент " + this.studentName + " с личным идентификатором " + this.studentID + " обучается в " + universityName;
        System.out.println(text);
    }
    public static void main(String[] args) {
        University student_1 = new University(1, "Иван");
        University student_2 = new University(2, "Пётр");
        University student_3 = new University(3, "Сергей");

        University.changeUniversityName("СпБГУ");
        student_1.printStudentInfo();
        student_2.printStudentInfo();
        student_3.printStudentInfo();
    }
}
