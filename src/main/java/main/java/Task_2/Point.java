package main.java.Task_2;

public class Point {
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        Point point_1 = new Point(1, 5);
        point_1.setX(8);
        point_1.print();
    }

    int x;
    int y;

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    void setX(int newX) {
        this.x = newX;
    }

    void print() {
        System.out.println("Координаты точки: X " + this.x + ", Y " + this.y);
    }
}
