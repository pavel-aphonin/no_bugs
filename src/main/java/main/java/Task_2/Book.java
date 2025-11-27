package main.java.Task_2;

public class Book {
    Book(String title, String author) {
       this.title = title;
       this.author = author;
    }
    public static void main(String[] args) {
        Book book_1 = new Book("Капитанская дочка", "Александр Пушкин");
        book_1.setAuthor("Антон Чехов");
        book_1.printInfo();
    }

    String title;
    String author;

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    void setTitle(String newTitle) {
        this.title = newTitle;
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    void printInfo() {
        System.out.println(this.author + " - " + this.title);
    }
}
