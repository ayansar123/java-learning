import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ApprndNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write note: ");
        String note = sc.nextLine();

        try (FileWriter fw = new FileWriter("note.txt", true)) {
            fw.write(note + "\n");
            System.out.println("Note added");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
