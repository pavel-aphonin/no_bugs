package Task_9.Exceptions.Subtask_1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TextFileReader {
    private final String filePath;

    public TextFileReader(String filePath) {
        this.filePath = filePath;
    }

    public void read() {
        try {
            new FileReader(filePath);
        } catch (FileNotFoundException error) {
            throw new RuntimeException("Файл не найден: " + error.getMessage());
        }
    }
}
