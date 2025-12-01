package Task_8.ArrayList;
import java.util.Collection;

public class StringStorage {
    private final Collection<String> storage;
    private String longestString;

    public StringStorage(Collection<String> data) {
        this.storage = data;
    }

    public void findLongestString() {
        longestString = "";
        storage.forEach(element -> {
            if (element.length() > longestString.length()) {
                longestString = element;
            }
        });

        System.out.println(longestString);
    }
}
