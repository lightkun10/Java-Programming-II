package Lectures.L1_Interface_as_Variable_Type;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Because an interface can be used as a type, it's possible
        to create a list that contains objects of the interface's type.
        */
        ArrayList<Readable> readingList = new ArrayList<>();

        readingList.add(new TextMessage("ope", "never been programming before..."));
        readingList.add(new TextMessage("ope", "gonna love it i think!"));
        readingList.add(new TextMessage("ope", "give me something more challenging! :)"));
        readingList.add(new TextMessage("ope", "you think i can do it?"));
        readingList.add(new TextMessage("ope", "up here we send several messages each day"));

        ArrayList<String> pages = new ArrayList<>();
        pages.add("A method can call itself.");

        readingList.add(new Ebook("Introduction to Recursion.", pages));

        for (Readable readable : readingList) {
            System.out.println(readable.read());
        }

        Readable readable = new TextMessage("ope", "TextMessage is Readable!"); // works
        // TextMessage message = readable; // doesn't work
        TextMessage castMessage = (TextMessage) readable;
        // works if, and only if, readable is of text message type
        /*
        Type conversion succeeds if, and only if, the variable is of the type that
        it's being converted to. Type conversion is not considered good practice,
        and one of the few situation where it's use is appropriate is in the
        implementation of the equals method.
        */
    }
}
