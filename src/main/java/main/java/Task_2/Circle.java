package main.java.Task_2;

public class Circle {
    Circle(double r) {
        this.r = r;
    }

    public static void main(String[] args) {
        Circle circle_1 = new Circle(12);
        circle_1.setR(15);
        circle_1.calculateArea();
        circle_1.calculateCircumference();
    }

    double r;

    double getR() {
        return this.r;
    }

    void setR(double newR) {
        this.r = newR;
    }

    void calculateArea() {
        System.out.println("Площадь круга составляет: " + Math.PI * Math.pow(this.r, 2));
    }

    void calculateCircumference() {
        System.out.println("Длина окружности составляет: " + 2 * Math.PI * this.r);
    }


}
