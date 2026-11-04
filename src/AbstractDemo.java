abstract  class Shape {
    abstract  double area();

    void show() {
        System.out.println("Area = " + area());
    }
}
class Circle extends Shape {
    double radius;

    Circle (double radius) {
        this.radius = radius;
    }
    double area () {
        return 3.14 * radius * radius;

    }

}
class Rect extends Shape {
    double length, width;

    Rect(double length, double width) {
        this.width = width;
    }
    double area() {
        return length * width;
    }
}
public class AbstractDemo {
    public static void main(String[] args){
        Shape s1 = new Circle(7);
        Shape s2 =new Rect(5, 7);
        s1.show();
        s2.show();
    }
}
