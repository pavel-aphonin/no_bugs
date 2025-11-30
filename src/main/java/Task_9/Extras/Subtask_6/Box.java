package Task_9.Extras.Subtask_6;

import java.util.ArrayList;
import java.util.List;

public class Box<T> implements Container<T> {
    private final List<T> box = new ArrayList<>();

    @Override
    public void add(T item) {
        box.add(item);
    }

    @Override
    public T get() {
        return box.get(0);
    }
}
