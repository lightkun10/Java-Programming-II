import java.io.FileWriter;
import java.io.PrintWriter;

public class Storer {

    /*
    The constructor of the PrintWriter class might throw an exception
    that must be either handled or thrown so that it is the
    responsibility of the calling method.
    */
    public void writeToFile(String fileName, String text) throws Exception {
        /*
        The possible exception that the constructor throws has to be
        handled with a try-catch block or the handling responsibility
        has to be transferred elsewhere.
        In this method, the responsibility to handle the exception
        is placed on the method that calls writeToFile.
        */
        PrintWriter writer = new PrintWriter(fileName);
        writer.println(text);
        writer.close();
    }

    public void fileWriter(String fileName, String text) throws Exception {
        FileWriter writer = new FileWriter(fileName);
        writer.write(text);
        writer.flush();
        writer.close();
    }

}
