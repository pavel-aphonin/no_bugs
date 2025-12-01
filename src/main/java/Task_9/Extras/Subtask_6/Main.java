package Task_9.Extras.Subtask_6;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        Box<Integer> integerBox = new Box<>();

        stringBox.add("1");
        stringBox.add("2");
        stringBox.add("3");

        integerBox.add(1);
        integerBox.add(2);
        integerBox.add(3);

        System.out.println(stringBox.get());
        System.out.println(integerBox.get());

    }
}
