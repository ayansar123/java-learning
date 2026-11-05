
import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Learn Java");
        tasks.add("Solve 2 problems");
        tasks.add("Push to GitHub");

        System.out.println("Total tasks = " + tasks.size());

        tasks.remove(1);

        for (String t : tasks) {
            System.out.println(" - " + t);
        }
    }
}
