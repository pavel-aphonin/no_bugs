package main.java.Task_8.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        // Создаём очередь, наполняем её и выводим на печать (задача 1)
        Orders orders = new Orders();
        orders.print();
        orders.addOrder(2);
        orders.addOrder(5);
        orders.addOrder(1);
        orders.addOrder(4);
        orders.addOrder(3);
        orders.print();

        // Создаём стек, наполняем его и обрабатываем (задача 2)
        Tasks tasks = new Tasks();
        tasks.addTask("Простая задача");
        tasks.addTask("Задача на подумать");
        tasks.addTask("Сложная задача");
        tasks.addTask("Ещё одна задача");
        tasks.addTask("Творческая задача");
        tasks.printTasks();

        tasks.doingTasks();

        // Создаём очередь, наполняем её клиентами с обеих сторон, удаляем клиентов с обеих сторон (задача 3)
        Clients clients = new Clients();
        clients.print();
        clients.addClientFirst("Павел");
        clients.print();
        clients.addClientFirst("Сергей");
        clients.print();
        clients.addClientLast("Дарья");
        clients.print();
        clients.addClientLast("Александра");
        clients.print();
        clients.removeFirstClient();
        clients.print();
        clients.removeLastClient();
        clients.print();
        clients.removeFirstClient();
        clients.print();
        clients.removeLastClient();
        clients.print();
    }
}
