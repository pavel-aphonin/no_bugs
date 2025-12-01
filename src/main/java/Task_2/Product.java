package Task_2;

public class Product {
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public static void main(String[] args) {
        Product product_1 = new Product("Яблоки", 300);
        product_1.setPrice(500);
        product_1.applyDiscount(25);
        product_1.printInfo();
    }

    String name;
    double price;

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    void applyDiscount(int discount) {
        double newPriceWithDiscount = this.price - (this.price / 100 * discount);
        this.price = newPriceWithDiscount;
    }

    void printInfo() {
        System.out.println("Товар: " + this.name + ", стоимость: " + this.price + " рублей");
    }
}
