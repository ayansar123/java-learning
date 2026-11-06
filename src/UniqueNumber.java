import  java.util.ArrayList;
import java.util.HashSet;

public class UniqueNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        HashSet<Integer> uniqe = new HashSet<>();

        System.out.println("List size = " + numbers.size());
        System.out.println("Uniqe size = " + uniqe.size());
        System.out.println("Has 30? = " + uniqe.contains(30));
        System.out.println("Has 99? = " + uniqe.contains(99));
    }
}
