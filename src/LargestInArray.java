
public class LargestInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 49, 7, 89, 23, 56};

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++ ) {
            if (numbers[1] > max) {
                max = numbers[i];
            }

        }
        System.out.println("Largest = " + max);
    }
}
