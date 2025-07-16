package Task_3;

public class Library {
    private String bookTitle = "Капитанская дочка";
    protected String author = "Александр Пушкин";
    int year = 1825;
    public String category = "Роман";

    String getBookTitle() {
        return this.bookTitle;
    }

    String getAuthor() {
        return this.author;
    }

    int getYear() {
        return this.year;
    }

    String getCategory() {
        return this.category;
    }

    void setBookTitle(String newBookTitle) {
        this.bookTitle = newBookTitle;
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    void setCategory(String newCategory) {
        this.category = newCategory;
    }

    public static void main(String[] args) {
        System.out.println("Экземпляр книни создан");
    }
}
