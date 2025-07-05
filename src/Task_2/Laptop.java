package Task_2;

public class Laptop {
    Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
    public static void main(String[] args) {
        Laptop laptop_1 = new Laptop("Apple", 1000000);
        laptop_1.setPrice(700000);
        laptop_1.printInfo();
    }

    String brand;
    int price;

    String getBrand() {
        return this.brand;
    }

    int getPrice() {
        return this.price;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setPrice(int newPrice) {
        this.price = newPrice;
    }

    void printInfo() {
        System.out.println("Ноутбук " + this.brand + ", стоимость - " + this.price + " рублей");
    }
}
