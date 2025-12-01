package Task_8.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Создаём карту и наполняем её данными, выводим значения (задача 1)
        StudentsPoints points = new StudentsPoints();
        points.printStudentsPoints();
        points.addPoint("Павел", 10);
        points.addPoint("Сергей", 9);
        points.addPoint("Дарья", 8);
        points.addPoint("Александра", 5);
        points.addPoint("Дмитрий", 7);
        points.printStudentsPoints();

        // Находим наибольший и наименьший элементы в дереве (задача 2)
        Numbers numbers = new Numbers();
        numbers.addNumber(-100);
        numbers.addNumber(300);
        numbers.addNumber(15);
        numbers.addNumber(7);
        numbers.addNumber(1000000);

        numbers.findMin();
        numbers.findMax();

        // Находим ближайший больший идентификатор (задача 3)
        Employee employee = new Employee();
        employee.addEmployee(1, "Павел");
        employee.addEmployee(2, "Сергей");
        employee.addEmployee(3, "Дарья");
        employee.addEmployee(4, "Александра");
        employee.addEmployee(5, "Дмитрий");
        employee.addEmployee(6, "Олег");
        employee.addEmployee(7, "Иван");
        employee.addEmployee(8, "Пётр");
        employee.addEmployee(9, "Светлана");
        employee.addEmployee(10, "Ольга");

        employee.findNearGreatId(1);
        employee.findNearGreatId(4);
        employee.findNearGreatId(9);
        employee.findNearGreatId(10);
    }
}
