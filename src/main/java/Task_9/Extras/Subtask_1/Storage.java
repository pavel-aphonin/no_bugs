package Task_9.Extras.Subtask_1;

public class Storage <T> {
    private final T element;

    public Storage(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }
}
