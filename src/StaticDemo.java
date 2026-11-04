class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void showCount() {
        System.out.println("Object created = " + count);
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        Counter.showCount();
        System.out.println("Square of 5 = " + (5));
    }
}
