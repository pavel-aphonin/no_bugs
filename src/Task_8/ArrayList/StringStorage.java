package Task_8.ArrayList;
import java.util.Collection;

public class StringStorage {
    private final Collection<String> storage;
    private String longestString;

    public StringStorage(Collection<String> data) {
        this.storage = data;
        this.longestString = "";
    }

    public void findLongestString() {
        storage.forEach(element -> {
            if (element.length() > this.longestString.length()) {
                this.longestString = element;
            }
        });

        System.out.println(this.longestString);
    }
}
