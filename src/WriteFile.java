import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("notes.txt")) {
            fw.write("Learning Java\n");
            fw.write("File I/O is easy\n");
            System.out.println("File written");
        } catch (IOException e ) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
    }
}
