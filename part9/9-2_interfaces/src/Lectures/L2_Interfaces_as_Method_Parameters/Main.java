package Lectures.L2_Interfaces_as_Method_Parameters;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TextMessage message = new TextMessage("ope",
                "Oh wow, this printer knows how to print these as well!");

        ArrayList<String> pages = new ArrayList<>();
        pages.add("Values common to both {1, 3, 5} and {2, 3, 4, 5} are {3, 5}.");
        Ebook book = new Ebook("Introduction to University Mathematics.", pages);

        /*
        The value of the print method of the printer class lies in
        the fact that it can be given any class that implements the
        Readable interface as a parameter. Were we to call the method
        with any object instantiated from a class that inherits the
        Readable class, the method would function as desired.
        */
        Printer printer = new Printer();
        printer.print(message);
        printer.print(book);

        ReadingList jonisList = new ReadingList();
        jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
        jonisList.add(new TextMessage("arto", "have you checked the submissions yet?"));

        System.out.println("Jonis's to-read: " + jonisList.toRead());

        int i = 0;
        while (i < (1000 - 2)) {
            jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
            i = i + 1;
        }

        System.out.println("Jonis's to-read: " + jonisList.toRead());
        System.out.println("Delegating the reading to Verna.");

        // Joni has a lot to read. Fortunately for him, Verna comes
        // to the rescue and reads the messages on Joni's behalf.
        ReadingList vernasList = new ReadingList();
        vernasList.add(jonisList);
        vernasList.read(); // "Verna, please help me!", says joni.

        System.out.println();
        System.out.println("Joni's to-read: " + jonisList.toRead());
    }
}
