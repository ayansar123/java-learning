import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String test = sc.nextLine().toLowerCase();

        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();
        for (String word : test.split(" ")) {
            counts.putFirst(word, counts.getOrDefault(word, 0) + 1);
        }
        for (String word : counts.keySet()) {
            System.out.println(word + " = " + counts.get(word));

        }
    }

    }

