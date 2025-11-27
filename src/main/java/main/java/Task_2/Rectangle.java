package main.java.Task_2;

public class Rectangle {
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Rectangle rectangle_1 = new Rectangle(5, 10);
        rectangle_1.setWidth(7);
        rectangle_1.calculateArea();
    }

    int width;
    int height;

    int getWidth() {
        return this.width;
    }

    int getHeight() {
        return this.height;
    }

    void setWidth(int newWidth) {
        this.width = newWidth;
    }

    void calculateArea() {
       System.out.println(this.width * this.height);
    }
}
