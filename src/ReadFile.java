import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("notes.txt"))) {
            int lines = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lines++;
                System.out.println(lines + ": " + line);
            }
            System.out.println("Total lines = " + lines);
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Run WriteFile first");
        }
    }
}