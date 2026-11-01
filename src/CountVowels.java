
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(":Enter a word: ");
        String word = sc.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < word.length(); i++)  {
        char c = word.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count++;
        }
    }
    System.out.println("Vowels = " + count);
    }
}
