package Exercises.E3_PrintMeMyHashmap;

import java.util.HashMap;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    /* Class methods */

    // Prints all the keys in the hashmap given as a parameter.
    public static void printKeys(HashMap<String, String> hashMap) {
        // Print all key in a set
        Set<String> keyset = hashMap.keySet(); // ["f.e", "etc.", "i.e"]

        // Iterate through set and print all the key
        for (String key : keyset) {
            System.out.println(key);
        }
    }

    // Prints the keys in the hashmap given as a parameter,
    // which contain the string given as a parameter.
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        Set<String> keyset = hashmap.keySet(); // ["f.e", "etc.", "i.e"]

        for (String key : keyset) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    // prints the values in the given hashmap which keys
    // contain the given string.
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        Set<String> keyset = hashmap.keySet(); // ["f.e", "etc.", "i.e"]

        for (String key : keyset) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
}
