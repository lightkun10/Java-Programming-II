package Exercises.E9_Reading_Files_PerLine;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        System.out.println("File to read:");
        // String file = scanner.nextLine();    // For using Netbeans
        String f = scanner.nextLine();
        String file = "src/Exercises/E9_Reading_Files_PerLine/" + f;

        System.out.println(read(file));
    }

    public static List<String> read(String file) {

        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get(file)).forEach(rowfile -> rows.add(rowfile));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return rows;
    }
}