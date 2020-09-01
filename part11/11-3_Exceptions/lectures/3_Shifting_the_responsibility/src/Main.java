import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    Sometimes the responsibility of handling exceptions is
    avoided until the end, and even the main method can
    throw an exception to the caller:
    */
    public static void main(String[] args) throws Exception {
        String file = "src/file.txt";
//        readLines(file).stream()
//                .forEach(l -> System.out.println(l));

        /*
        Now the exception is thrown to the program executor, or
        the Java virtual machine. It stops the program execution
        when an error causing an exception to be thrown occurs.
        */
        readLinesExceptionUnhandled(file).stream()
                .forEach(line -> System.out.println(line));
    }

    public static List<String> readLines(String fileName) {
        List<String> lines = new ArrayList<>();

        try {
            Files.lines(Paths.get(fileName))
                    .forEach(line -> lines.add(line));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return lines;
    }

    /*
    A programmer can also leave the exception unhandled and shift
    the responsibility for handling it to whomever calls the method.
    */
    public static List<String> readLinesExceptionUnhandled(String fileName) throws Exception {
        List<String> lines = new ArrayList<>();
        Files.lines(Paths.get(fileName))
                .forEach(line -> lines.add(line));
        return lines;
    }
}
