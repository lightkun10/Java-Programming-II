import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    /*
    The constructor of the PrintWriter class might throw an exception
    that must be either handled or thrown so that it is the
    responsibility of the calling method.
    */
    public static void main(String[] args) throws Exception {
        String path = "src/";
        String file = "src/file.txt";

//        PrintWriter writer = new PrintWriter(file);
//        writer.println("Hello file!"); //writes the string "Hello file!" and line change to the file
//        writer.println("More text");
//        writer.print("And a little extra"); // writes the string "And a little extra" to the file without a line change
//        writer.close();

        Storer storer = new Storer();
        storer.writeToFile(path + "file.txt", "OK");
        storer.writeToFile(path + "file.txt", "Thank you");

        /*
        By calling the method above we create a file called "diary.txt" and
        write the text "Dear diary, today was a good day." into it.
        If the file already exists, the earlier contents are erased when we store the new text.

        It is also possible to handle files in a way that adds the new text
        after the existing content. In that case, you might want to use the FileWriter class.
        */

        // creates a FileWriter Object
        FileWriter writer = new FileWriter(path + "diary.txt");

        // Writes the content to the file
        writer.write("Dear diary, today was a good day.");
        writer.flush();
        // writer.close();

        writer.write("\nNext Line?");
        writer.flush();
        writer.close();
    }
}
