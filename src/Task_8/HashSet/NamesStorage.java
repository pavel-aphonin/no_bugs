package Task_8.HashSet;

import java.util.*;

public class NamesStorage {
    private final Set<String> storage;

    public NamesStorage(Set<String> storage) {
        this.storage = storage;
    }

    public void findName(String name) {
        if (storage.contains(name)) {
            System.out.println("Имя \"" + name + "\" существует в множестве имён");
            return;
        }

        System.out.println("Имя \"" + name + "\" не существует в множестве имён");
    }
}
