public class ProductList {
    private String name;
    private double price;

    ProductList(String name, double price) {
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