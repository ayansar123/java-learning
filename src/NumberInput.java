import java.io.PrintStream;
import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out. print("Enter your age");
        String text = sc.nextLine();

        try{
            int age = Integer.parseInt(text);
            System.out.println("Next year you will be " + 1);
        } catch (NumberFormatException e ) {
            System.out.println("Please enter digits only");
        }
    }
    }



