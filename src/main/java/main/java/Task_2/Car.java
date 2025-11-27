package main.java.Task_2;

public class Car {
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public static void main(String[] args) {
        Car bmw = new Car("BMW", 1980);
        bmw.setYear(2020);
        bmw.print();

        Car audi = new Car("Audi", 2000);
        bmw.setBrand("Nissan");
        bmw.print();
    }

    String brand;
    int year;

    String getBrand() {
        return this.brand;
    }

    int getYear() {
        return this.year;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    public void print() {
        System.out.println("Автомобиль марки " + this.brand + ", " + this.year + " года выпуска");
    }
}
