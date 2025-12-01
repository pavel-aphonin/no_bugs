package Task_9.Generics.Subtask_3;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("100", 100);
        Pair<Integer, String> pair2 = new Pair<>(200, "200");

        // Выводим элементы
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());

        // Изменяем первые элементы в парах
        pair1.setFirst("300");
        pair2.setFirst(400);

        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());

        // Изменяем вторые элементы в парах
        pair1.setSecond(300);
        pair2.setSecond("400");

        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
    }
}
