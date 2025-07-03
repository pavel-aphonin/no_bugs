package Task_1;

public class MathOperations {
    public static void main(String[] args) {
        System.out.println(add(5, 5));
        System.out.println(subtract(5, 5));
        System.out.println(multiply(5, 5));
        System.out.println(divide(5, 0));
        System.out.println(findMax(5, 5));
        System.out.println(difference(5, 5));
        System.out.println(squareArea(5));
        System.out.println(squarePerimeter(5));
        System.out.println(convertSecondsToMinutes(5));
        System.out.println(averageSpeed(5, 5));
        System.out.println(findHypotenuse(5, 5));
        System.out.println(circleCircumference(5));
        System.out.println(calculatePercentage(5, 5));
        System.out.println(celsiusToFahrenheit(5));
        System.out.println(fahrenheitToCelsius(5));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int findMax(int x, int y) {
        return Math.max(x, y);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int a) {
        return a * a;
    }

    public static int squarePerimeter(int a) {
        return a * 4;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    public static double averageSpeed(double distance, double time) {
        if (time == 0) {
            return 0;
        }
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static double circleCircumference(double r) {
        return 2 * Math.PI * r;
    }

    public static double calculatePercentage(double total, double part) {
        if (part == 0) {
            return total;
        }

        return (total / part) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
