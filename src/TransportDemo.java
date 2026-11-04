interface Transport {
    void  start();
}
class Bike implements Transport {
    public void start() {
        System.out.println("Bike start with a kick");
    }
}
class Carr implements Transport {
    public void start() {
        System.out.println("Carr start with a key");
    }
}
public class TransportDemo {
    public static void main(String[] args) {
        Transport t1 = new Bike();
        Transport t2 = new Carr();
        t1.start();
        t2.start();
    }
}
