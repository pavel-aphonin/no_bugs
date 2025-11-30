package Task_9.Exceptions.Subtask_2;

public class NumbersDivision {
    public void division(Integer x, Integer y) {
        if (y == 0) {
            throw new ArithmeticException("Нельзя делить на ноль");
        }

        System.out.println(x + "/" + y + " = " + x/y);
    }
}
