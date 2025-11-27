package main.java.Task_3;

public class Company {
    Company(String employeeName, int employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }
    static String companyName = "Apple";

    String employeeName;
    final int employeeID;

    static void printCompanyName() {
        System.out.println(companyName);
    }

    String getEmployeeName() {
        return this.employeeName;
    }
    void setEmployeeName(String newName) {
        this.employeeName = newName;
    }

    public static void main(String[] args) {
        Company ivan = new Company("Иван", 1);
        Company petr = new Company("Пётр", 2);
        Company sergey = new Company("Сергей", 3);
        Company.printCompanyName();

        Company.companyName = "Microsoft";
        Company.printCompanyName();
        // Непправильный вызов из экземпляра класса, так пиисать не рекомендовано, но работать будет
        // ivan.printCompanyName();

        // Ошибка компиляции: "java: cannot assign a value to final variable employeeID"
        // ivan.employeeID = 4;
    }
}
