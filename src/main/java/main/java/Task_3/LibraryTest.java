package main.java.Task_3;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        // public - доступно везде
        System.out.println(library.category);

        // protected - доступен в рамках того же пакета и подклассах
        System.out.println(library.author);

        // default - доступен только в рамках того же пакета
        System.out.println(library.year);

        // private - доступен только в самом классе
        // Ошибка компиляции: "java: bookTitle has private access in Task_3.Library"
        // System.out.println(library.bookTitle);
    }
}
