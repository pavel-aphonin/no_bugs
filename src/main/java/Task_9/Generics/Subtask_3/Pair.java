package Task_9.Generics.Subtask_3;

public class Pair <T,R> {
    private T first;
    private R second;

    public Pair(T firtst, R second) {
        this.first = firtst;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public R getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(R second) {
        this.second = second;
    }
}
