package Task_9.Extras.Subtask_3;

import java.util.List;

public class NumberBox <T extends Number> {
    private final List<T> numbers;

    public NumberBox(List<T> numbers) {
        this.numbers = numbers;
    }

    public List<T> getNumbers() {
        return numbers;
    }

    public Integer sum() {
        int sum = 0;

        for (T number : numbers) {
            sum += number.intValue();
        }

        return sum;
    }
}
