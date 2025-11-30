package Task_9.Extras.Subtask_2;

import java.util.List;

public class PrintableList {
    public <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }
}
