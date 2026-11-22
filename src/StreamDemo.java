import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 8, 21, 6, 15);

        int evenSum = numbers.stream()
                .filter(n-> n % 2 ==0)
                .mapToInt(n -> n)
                .sum();
        System.out.println("Sum of even = " + evenSum);

        long bigCount = numbers.stream().filter(n -> n > 10 ).count();
                System.out.println("Numbers above 10 = " + bigCount);

                List<Integer> doubled = numbers.stream()
                        .map(n -> n * 2)
                        .collect(Collectors.toList());
        System.out.println("Doubled = " + doubled);

        int max = numbers.stream().mapToInt(n -> n). max().getAsInt();
        double avg = numbers.stream().mapToInt(n -> n).average().getAsDouble();
        System.out.println("Max = " + max);
        System.out.printf("Average = %.2f%n", avg);

        List<String> names = List.of("Ayan", "Rahul", "Amit", "Sara", "Zoya");
        List<String> result = names.stream()
                .filter(n -> n.startsWith("A"))
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Names with A = " + result);
    }
}

