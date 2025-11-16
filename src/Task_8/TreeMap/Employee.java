package Task_8.TreeMap;

import java.util.TreeMap;

public class Employee {
    private final TreeMap<Integer, String> employee;

    public Employee() {
        this.employee = new TreeMap<>();
    }

    public void addEmployee(Integer id, String name) {
        employee.put(id, name);
    }

    public void findNearGreatId(Integer id) {
        if (employee.higherEntry(id) != null) {
            System.out.println(employee.higherEntry(id));
        } else {
            System.out.println("Не найдено сотрудников с большим ID");
        }
    }
}
