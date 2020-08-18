package Lectures.L0_Intro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // All objects are of type "Object"
        String text = "text";
        Object textString = text;

        // Assignment in the other direction,
        // i.e., setting an Object-type variable
        // to a String type, will not work.
        // This is because Object-type variables are not of type String
        Object anotherTextString = "another text";
        // String anotherText = anotherTextString; // WON'T WORK!

        Printer printer = new Printer();

//        String string = " o ";
//        List<String> words = new ArrayList<>();
//        words.add("polymorphism");
//        words.add("inheritance");
//        words.add("encapsulation");
//        words.add("abstraction");
//
//        // The object may, in fact, be of another type.
//        printer.printManyTimes(string, 2);
//        printer.printManyTimes(words, 3);

        String string = "works";
        printer.printCharacters(string);
    }
}
