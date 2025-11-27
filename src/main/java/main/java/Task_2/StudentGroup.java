package main.java.Task_2;

public class StudentGroup {
    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public static void main(String[] args) {
        StudentGroup group_1 = new StudentGroup("A", 25);
        group_1.setStudentCount(30);
        group_1.printInfo();
    }

    String groupName;
    int studentCount;

    String getGroupName() {
        return this.groupName;
    }

    int getStudentCount() {
        return this.getStudentCount();
    }

    void setGroupName(String newName){
        this.groupName = newName;
    }

    void setStudentCount(int newCount) {
        this.studentCount = newCount;
    }

    void printInfo() {
        System.out.println("В группе " + this.groupName + " " + this.studentCount + " студентов");
    }
}
