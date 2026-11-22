import java.util.ArrayList;

public class LambdaDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sara");
        names.add("Ayan");
        names.add("Rahul");

        names.forEach(n -> System.out.println("Hello " + n));

        names.sort((a, b) -> a.compareTo(b));
        System.out.println(names);

        names.removeIf(n -> n.length() > 4);
        System.out.println(names);
    }
}
