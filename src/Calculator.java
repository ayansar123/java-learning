import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.print("Operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println(a + b);
        } else if (op == '-') {
            System.out.println(a - b);
        } else if (op == '*') {
            System.out.println(a * b);
        } else if (op == '/') {
            System.out.println(a / b);
        } else {
            System.out.println("Invalid operator");
        }
    }
}

