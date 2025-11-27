package main.java.Task_8.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Создаём очередь, наполняем её и выводим элементы в порядке их обработки (задача 1)
        Orders orders = new Orders();
        orders.addOrder(1);
        orders.addOrder(3);
        orders.addOrder(5);
        orders.addOrder(2);
        orders.addOrder(4);
        orders.processedAndPrintOrders();
    }
}
