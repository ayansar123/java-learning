import java.util.Scanner;

public class Palindrone {
    static boolean isPalindrone(String s ) {
        String reversed = "";
        for (int i = s.length()  - 1; i >= 0; i--){
           reversed = reversed + s.charAt(i);
        }
        return  s.equals(reversed);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word");
        String word = sc.nextLine();

        if (isPalindrone(word)) {
                System.out.println("Palindrone");
    }else{
            System.out.println("Not palindrone");
        }
}
}
