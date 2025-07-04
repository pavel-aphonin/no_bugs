package Task_1;

public class MathOperations {
    public static void main(String[] args) {
        System.out.println("Сложение чисел");
        System.out.println(add(5, 5));
        System.out.println(add(0, 5));
        System.out.println(add(5, 0));
        System.out.println(add(0, 0));
        System.out.println(add(-8, -10));

        System.out.println("Вычитание чисел");
        System.out.println(subtract(5, 5));
        System.out.println(subtract(0, 5));
        System.out.println(subtract(5, 0));
        System.out.println(subtract(0, 0));
        System.out.println(subtract(-8, -10));

        System.out.println("Умножение чисел");
        System.out.println(multiply(5, 5));
        System.out.println(multiply(0, 5));
        System.out.println(multiply(5, 0));
        System.out.println(multiply(0, 0));
        System.out.println(multiply(-8, -10));

        System.out.println("Деление чисел");
        System.out.println(divide(5, 5));
        System.out.println(divide(0, 5));
        System.out.println(divide(5, 0));
        System.out.println(divide(0, 0));
        System.out.println(divide(-8, -10));

        System.out.println("Нахождение наибольшего числа");
        System.out.println(findMax(5, 5));
        System.out.println(findMax(0, 5));
        System.out.println(findMax(5, 0));
        System.out.println(findMax(0, 0));
        System.out.println(findMax(-8, -10));

        System.out.println("Вычисление разницы между числами");
        System.out.println(difference(5, 5));
        System.out.println(difference(0, 5));
        System.out.println(difference(5, 0));
        System.out.println(difference(0, 0));
        System.out.println(difference(-8, 10));

        System.out.println("Вычисление площади квадрата");
        System.out.println(squareArea(5));
        System.out.println(squareArea(0));
        System.out.println(squareArea(1));
        System.out.println(squareArea(10));

        System.out.println("Вычисление периметра квадрата");
        System.out.println(squarePerimeter(5));
        System.out.println(squarePerimeter(0));
        System.out.println(squarePerimeter(1));
        System.out.println(squarePerimeter(10));

        System.out.println("Перевод секунд в минуты");
        System.out.println(convertSecondsToMinutes(5));
        System.out.println(convertSecondsToMinutes(1));
        System.out.println(convertSecondsToMinutes(60));
        System.out.println(convertSecondsToMinutes(3600));
        System.out.println(convertSecondsToMinutes(37));
        System.out.println(convertSecondsToMinutes(0));

        System.out.println("Вычисление средней скорости");
        System.out.println(averageSpeed(5, 5));
        System.out.println(averageSpeed(0, 5));
        System.out.println(averageSpeed(5, 0));
        System.out.println(averageSpeed(0, 0));
        System.out.println(averageSpeed(100, 1));
        System.out.println(averageSpeed(56.37, 94.904));
        System.out.println(averageSpeed(0.01, 0.5));

        System.out.println("Вычисление гипотенузы");
        System.out.println(findHypotenuse(5, 5));
        System.out.println(findHypotenuse(0, 5));
        System.out.println(findHypotenuse(5, 0));
        System.out.println(findHypotenuse(0, 0));
        System.out.println(findHypotenuse(5.989, 43.344));
        System.out.println(findHypotenuse(0.111, 0.34));
        System.out.println(findHypotenuse(100, 200));

        System.out.println("Вычисление периметра окружности");
        System.out.println(circleCircumference(5));
        System.out.println(circleCircumference(0));
        System.out.println(circleCircumference(0.01));
        System.out.println(circleCircumference(1));
        System.out.println(circleCircumference(487.363));

        System.out.println("Вычисление процента от целого");
        System.out.println(calculatePercentage(5, 5));
        System.out.println(calculatePercentage(5, 0));
        System.out.println(calculatePercentage(0, 5));
        System.out.println(calculatePercentage(0, 0));
        System.out.println(calculatePercentage(100, 100));
        System.out.println(calculatePercentage(0.001, 1000));
        System.out.println(calculatePercentage(1000, 0.001));
        System.out.println(calculatePercentage(74.333, 983.337));

        System.out.println("Перевод цельсий в фаренгейты");
        System.out.println(celsiusToFahrenheit(5));
        System.out.println(celsiusToFahrenheit(1));
        System.out.println(celsiusToFahrenheit(0));
        System.out.println(celsiusToFahrenheit(-273.15));
        System.out.println(celsiusToFahrenheit(1000));
        System.out.println(celsiusToFahrenheit(0.0001));

        System.out.println("Перевод фарентейтов в цельсии");
        System.out.println(fahrenheitToCelsius(5));
        System.out.println(fahrenheitToCelsius(1));
        System.out.println(fahrenheitToCelsius(0));
        System.out.println(fahrenheitToCelsius(-273.15));
        System.out.println(fahrenheitToCelsius(1000));
        System.out.println(fahrenheitToCelsius(0.0001));
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
