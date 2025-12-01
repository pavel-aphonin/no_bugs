package Task_9.Exceptions.Subtask_2;

public class Main {
    public static void main(String[] args) {
        NumbersDivision numbersDivision = new NumbersDivision();
        // Делим два числа
        numbersDivision.division(10, 5);
        // Делим на ноль
        numbersDivision.division(10, 0);
    }
}
