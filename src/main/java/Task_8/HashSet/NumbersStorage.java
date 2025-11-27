package Task_8.HashSet;
import java.util.*;

public class NumbersStorage {
    private final Set<Integer> storage;

    public NumbersStorage(Set<Integer> storage) {
        this.storage = storage;
    }

    public void addElement(Integer element) {
        storage.add(element);
    }

    public void print() {
        System.out.println(storage);
    }

    public void containsElement(Integer element) {
        if (storage.contains(element)) {
            System.out.println("Элемент \"" + element + "\" содержится в множестве");
            return;
        }

        System.out.println("Элемент \"" + element + "\" не содержится в множестве");
    }
}
