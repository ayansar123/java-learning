public class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price for " + name);
        }
    }

    void show() {
        System.out.println(name + " costs " + price);
    }
}