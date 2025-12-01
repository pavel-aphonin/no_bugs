package Task_3;

public class MathConstants {
    final double PI = 3.14159;
    final double E = 2.71828;

    void calculateCircleArea(double r) {
        double result = this.PI * r * r;
        System.out.println(result);
    }

    void calculateCircumference(double r) {
        double result = 2 * this.PI * r;
        System.out.println(result);
    }

    public static void main(String[] args) {
        MathConstants circle = new MathConstants();

        circle.calculateCircleArea(0);
        circle.calculateCircleArea(0.001);
        circle.calculateCircleArea(1);
        circle.calculateCircleArea(5);
        circle.calculateCircleArea(10.376);
        circle.calculateCircleArea(1000);

        circle.calculateCircumference(0);
        circle.calculateCircumference(0.001);
        circle.calculateCircumference(1);
        circle.calculateCircumference(5);
        circle.calculateCircumference(10.376);
        circle.calculateCircumference(1000);
    }
}
