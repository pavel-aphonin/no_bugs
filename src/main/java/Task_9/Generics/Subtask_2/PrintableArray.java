package Task_9.Generics.Subtask_2;

public class PrintableArray {
    public <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}
