import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Learner {
    private String name;
    private int marks;

    Learner(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    String getName() {
        return name;
    }

    int getMarks() {
        return marks;
    }
}

public class LearnerStream {
    public static void main(String[] args) {
        List<Learner> list = new ArrayList<>();
        list.add(new Learner("Ayan", 85));
        list.add(new Learner("Rahul", 45));
        list.add(new Learner("Sara", 92));
        list.add(new Learner("Zoya", 38));

        List<String> passed = list.stream()
                .filter(l -> l.getMarks() >= 40)
                .map(l -> l.getName())
                .collect(Collectors.toList());
        System.out.println("Passed = " + passed);

        double avg = list.stream().mapToInt(l -> l.getMarks()).average().getAsDouble();
        System.out.printf("Class average = %.2f%n", avg);

        list.stream()
                .sorted((a, b) -> b.getMarks() - a.getMarks())
                .limit(2)
                .forEach(l -> System.out.println(
                        "Top: " + l.getName() + " " + l.getMarks()));
    }
}