package Task_8.Extra.Tasks;

public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();

        // Добавляем задачи в очередь
        tasks.printTasks();
        tasks.addTask("Задача 1");
        tasks.addTask("Задача 2");
        tasks.addTask("Задача 3");
        tasks.addTask("Задача 4");
        tasks.addTask("Задача 5");
        tasks.printTasks();

        // Обрабатываем одну задачу
        System.out.println(tasks.processedNextTask());
        tasks.printTasks();
        System.out.println(tasks.processedNextTask());
        tasks.printTasks();

        // Удаляем задачу из очереди
        System.out.println(tasks.removeTask("Задача 4"));
        System.out.println(tasks.removeTask("Задача 6"));
        System.out.println(tasks.removeTask("Задача 1"));
        tasks.printTasks();

        // Обрабатываем все задачи
        tasks.addTask("Задача 1");
        tasks.addTask("Задача 2");
        tasks.addTask("Задача 3");
        tasks.printTasks();
        tasks.processedAllTasks();
        tasks.printTasks();

        // Чистим очередь задач
        tasks.addTask("Задача 1");
        tasks.addTask("Задача 2");
        tasks.addTask("Задача 3");
        tasks.printTasks();
        tasks.clearAllTasks();
        tasks.printTasks();
    }
}
