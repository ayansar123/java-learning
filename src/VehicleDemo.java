class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " is starting");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    void honk() {
        System.out.println(brand + " says Beep! It has " + doors + " doors");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car c = new Car("Honda", 4);
        c.start();
        c.honk();
    }
}