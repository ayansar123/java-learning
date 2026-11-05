import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ayan");
        names.add("Rahul");
        names.add("Sara");

        System.out.println("First = " + names.get(0));
        System.out.println("Has Rahul? " + names.contains("Rahul"));

        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". " + names.get(i));
        }
    }
}