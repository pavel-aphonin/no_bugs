package Task_10.Part_1.Subtask_2;

public class Main {
    public static void main(String[] args) {
        Runnable printer = () -> System.out.println("Hello from anonymous class!");
        printer.run();
    }
}
