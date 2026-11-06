import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> book = new HashMap<>();
        book.put("Ayan" , "9876543321");
        book.put("Rahul" , "9876655588");
        book.put("Zoya" , "9865000007");

        System.out.println("Ayan's number = " + book.get("Ayan"));
        System.out.println("Has Rahul? " + book.containsKey("Rahul"));
        System.out.println("Has Zoya? " + book.containsKey("Zoya"));


        book.put("Sara", "9999900000");
        book.remove("Rahul");

        System.out.println("Total contacts+ " + book.size());
        System.out.println("Sara's number = " +book.get("Sara"));


    }
}
