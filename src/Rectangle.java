public class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length =  length;
        this.width = width;
    }
    int area() {
        return  length * width;
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle( 10, 4);
        System.out.println("Area 1 = " + r1.area());
        System.out.println("Area 2 = " + r2.area());
    }
}
