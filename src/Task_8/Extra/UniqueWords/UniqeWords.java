package Task_8.Extra.UniqueWords;

import java.util.HashSet;
import java.util.List;

public class UniqeWords {
    private final HashSet<String> storage;
    private String text;

    public UniqeWords() {
        this.storage = new HashSet<>();
        this.text = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void makeUniqueWordsSet() {
        String[] words = text
                .trim()
                .toLowerCase()
//                .replaceAll("[^a-zA-Z0-9\\s]", " ")
                .split(" ");

        storage.addAll(List.of(words));
    }

    public void calculateUniqueWordsCount() {
        System.out.println(storage.size());
    }

    public void printUniqueWords() {
        System.out.println(storage);
    }

    public void clear() {
        storage.clear();
        text = "";
    }
}
