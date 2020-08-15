package Lectures.L4_Built_in_Interfaces.L4_4_The_Collection_Interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    /*
    The Collection interface describes functionality related
    to collections. Among other things, lists and sets are
    categorized as collections in Java — both the List and
    Set interfaces implement the Collection interface.
    The Collection interface provides, for instance, methods
    for checking the existence of an item (the method contains)
    and determining the size of a collection (the method size).

    The Collection interface also determines how the collection
    is iterated over. Any class that implements the Collection
    interface, either directly or indirectly, inherits the
    functionality required for a for-each loop.
    */
    public static void main(String[] args) {
        Map<String, String> translations = new HashMap<>();
        translations.put("ganbatte", "good luck");
        translations.put("hai", "yes");

        Set<String> keys = translations.keySet();
        Collection<String> keyCollection = keys;

        System.out.println("Keys:");
        for (String key : keyCollection) {
            System.out.println(key);
        }

        System.out.println();
        System.out.println("Values: ");
        Collection<String> values = translations.values();

        for (String value : values) {
            System.out.println(value);
        }
    }
}
