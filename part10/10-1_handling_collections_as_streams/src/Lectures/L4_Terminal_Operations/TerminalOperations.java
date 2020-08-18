package Lectures.L4_Terminal_Operations;

public class TerminalOperations {
    public static void main(String[] args) {
        /*
        Terminal Operations is a Stream methods that end the processing of elements.
        Let's take a look at four terminal operations:
        */

        // The count method for counting the number of values on a list,
        CountMethod.run();

        // The forEach method for going a through list values,
        forEachMethod.run();

        // The collect method for gathering the list values ​​into a data structure,
        collectMethod.run();

        // The reduce method for combining the list items.
        reduceMethod.run();
    }
}
