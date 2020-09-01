import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        TextServer ts = new TextServer();

        String path = "src/";

        System.out.print("Write filename here: ");
        String file = scanner.nextLine();
        String fileName = path + file;

        ts.save(file, fileName);

        System.out.print("Input file to load: ");
        String file2 = scanner.nextLine();
        String fileName2 = path + file;

        try {
            Files.lines(Paths.get(fileName2)).forEach(row -> System.out.println(row));
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }

        System.out.println(ts.load(file2));

    }
}
