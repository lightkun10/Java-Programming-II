import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();

        // Create a Scanner object for reading files
        try (Scanner reader = new Scanner(new File("src/file.txt"))) {

            // read all lines from a file
            while (reader.hasNextLine()) {
                lines.add(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // do something with the lines
        lines.stream()
                .forEach(row -> System.out.println(row));

        /*
        The try-with-resources approach is useful for handling resources,
        because the program closes the used resources automatically.
        Now references to files can "disappear", because we do not
        need them anymore. If the resources are not closed, the operating
        system sees them as being in use until the program is closed.
        */
    }
}
