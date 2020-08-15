package Lectures.L4_Built_in_Interfaces.L4_1_The_List_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        The List interface defines the basic functionality
        related to lists. Because the ArrayList class implements
        the `List` interface, one can also use it through the
        `List` interface.
        */
        List<String> strings = new ArrayList<>();
        strings.add("string objects inside an arraylist object!");

        List<String> strings2 = new LinkedList<>();
        strings2.add("string objects inside a linkedlist object!");
    }
}
