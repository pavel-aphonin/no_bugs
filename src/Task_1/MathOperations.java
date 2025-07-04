package Task_1;

public class MathOperations {
    public static void main(String[] args) {
        System.out.println("Сложение чисел:");
        System.out.println("5 + 5 = " + add(5, 5));
        System.out.println("0 + 5 = " + add(0, 5));
        System.out.println("5 + 0 = " + add(5, 0));
        System.out.println("0 + 0 = " + add(0, 0));
        System.out.println("-8 + -10 = " + add(-8, -10));

        System.out.println("Вычитание чисел:");
        System.out.println("5 - 5 = " + subtract(5, 5));
        System.out.println("0 - 5 = " + subtract(0, 5));
        System.out.println("5 - 0 = " + subtract(5, 0));
        System.out.println("0 - 0 = " + subtract(0, 0));
        System.out.println("-8 - -10 = " + subtract(-8, -10));

        System.out.println("Умножение чисел:");
        System.out.println("5 * 5 = " + multiply(5, 5));
        System.out.println("0 * 5 = " + multiply(0, 5));
        System.out.println("5 * 0 = " + multiply(5, 0));
        System.out.println("0 * 0 = " + multiply(0, 0));
        System.out.println("-8 * -10 = " + multiply(-8, -10));

        System.out.println("Деление чисел:");
        System.out.println("5 / 5 = " + divide(5, 5));
        System.out.println("0 / 5 = " + divide(0, 5));
        System.out.println("5 / 0 = " + divide(5, 0));
        System.out.println("0 / 0 = " + divide(0, 0));
        System.out.println("-8 / -10 = " + divide(-8, -10));

        System.out.println("Нахождение наибольшего числа:");
        System.out.println("max(5, 5) = " + findMax(5, 5));
        System.out.println("max(0, 5) = " + findMax(0, 5));
        System.out.println("max(5, 0) = " + findMax(5, 0));
        System.out.println("max(0, 0) = " + findMax(0, 0));
        System.out.println("max(-8, -10) = " + findMax(-8, -10));

        System.out.println("Вычисление разницы между числами:");
        System.out.println("разность между 5 и 5 = " + difference(5, 5));
        System.out.println("разность между 0 и 5 = " + difference(0, 5));
        System.out.println("разность между 5 и 0 = " + difference(5, 0));
        System.out.println("разность между 0 и 0 = " + difference(0, 0));
        System.out.println("разность между -8 и 10 = " + difference(-8, 10));

        System.out.println("Вычисление площади квадрата:");
        System.out.println("5² = " + squareArea(5));
        System.out.println("0² = " + squareArea(0));
        System.out.println("1² = " + squareArea(1));
        System.out.println("10² = " + squareArea(10));

        System.out.println("Вычисление периметра квадрата:");
        System.out.println("5 * 4 = " + squarePerimeter(5));
        System.out.println("0 * 4 = " + squarePerimeter(0));
        System.out.println("1 * 4 = " + squarePerimeter(1));
        System.out.println("10 * 4 = " + squarePerimeter(10));

        System.out.println("Перевод секунд в минуты:");
        System.out.println("5 сек = " + convertSecondsToMinutes(5) + " мин");
        System.out.println("1 сек = " + convertSecondsToMinutes(1) + " мин");
        System.out.println("60 сек = " + convertSecondsToMinutes(60) + " мин");
        System.out.println("3600 сек = " + convertSecondsToMinutes(3600) + " мин");
        System.out.println("37 сек = " + convertSecondsToMinutes(37) + " мин");
        System.out.println("0 сек = " + convertSecondsToMinutes(0) + " мин");

        System.out.println("Вычисление средней скорости:");
        System.out.println("5 / 5 = " + averageSpeed(5, 5));
        System.out.println("0 / 5 = " + averageSpeed(0, 5));
        System.out.println("5 / 0 = " + averageSpeed(5, 0));
        System.out.println("0 / 0 = " + averageSpeed(0, 0));
        System.out.println("100 / 1 = " + averageSpeed(100, 1));
        System.out.println("56.37 / 94.904 = " + averageSpeed(56.37, 94.904));
        System.out.println("0.01 / 0.5 = " + averageSpeed(0.01, 0.5));

        System.out.println("Вычисление гипотенузы:");
        System.out.println("√(5² + 5²) = " + findHypotenuse(5, 5));
        System.out.println("√(0² + 5²) = " + findHypotenuse(0, 5));
        System.out.println("√(5² + 0²) = " + findHypotenuse(5, 0));
        System.out.println("√(0² + 0²) = " + findHypotenuse(0, 0));
        System.out.println("√(5.989² + 43.344²) = " + findHypotenuse(5.989, 43.344));
        System.out.println("√(0.111² + 0.34²) = " + findHypotenuse(0.111, 0.34));
        System.out.println("√(100² + 200²) = " + findHypotenuse(100, 200));

        System.out.println("Вычисление периметра окружности:");
        System.out.println("5 * 2π = " + circleCircumference(5));
        System.out.println("0 * 2π = " + circleCircumference(0));
        System.out.println("0.01 * 2π = " + circleCircumference(0.01));
        System.out.println("1 * 2π = " + circleCircumference(1));
        System.out.println("487.363 * 2π = " + circleCircumference(487.363));

        System.out.println("Вычисление процента от целого:");
        System.out.println("5 от 5 = " + calculatePercentage(5, 5));
        System.out.println("5 от 0 = " + calculatePercentage(5, 0));
        System.out.println("0 от 5 = " + calculatePercentage(0, 5));
        System.out.println("0 от 0 = " + calculatePercentage(0, 0));
        System.out.println("100 от 100 = " + calculatePercentage(100, 100));
        System.out.println("0.001 от 1000 = " + calculatePercentage(0.001, 1000));
        System.out.println("1000 от 0.001 = " + calculatePercentage(1000, 0.001));
        System.out.println("74.333 от 983.337 = " + calculatePercentage(74.333, 983.337));

        System.out.println("Перевод цельсий в фаренгейты:");
        System.out.println("5°C → °F = " + celsiusToFahrenheit(5));
        System.out.println("1°C → °F = " + celsiusToFahrenheit(1));
        System.out.println("0°C → °F = " + celsiusToFahrenheit(0));
        System.out.println("-273.15°C → °F = " + celsiusToFahrenheit(-273.15));
        System.out.println("1000°C → °F = " + celsiusToFahrenheit(1000));
        System.out.println("0.0001°C → °F = " + celsiusToFahrenheit(0.0001));

        System.out.println("Перевод фарентейтов в цельсии:");
        System.out.println("5°F → °C = " + fahrenheitToCelsius(5));
        System.out.println("1°F → °C = " + fahrenheitToCelsius(1));
        System.out.println("0°F → °C = " + fahrenheitToCelsius(0));
        System.out.println("-273.15°F → °C = " + fahrenheitToCelsius(-273.15));
        System.out.println("1000°F → °C = " + fahrenheitToCelsius(1000));
        System.out.println("0.0001°F → °C = " + fahrenheitToCelsius(0.0001));
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
