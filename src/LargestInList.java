import java.util.ArrayList;

public class LargestInList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(45);
        numbers.add(8);
        numbers.add(897);
        numbers.add(66);

        int max = numbers.get(0);
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println("Largest = " + max);
    }
}
