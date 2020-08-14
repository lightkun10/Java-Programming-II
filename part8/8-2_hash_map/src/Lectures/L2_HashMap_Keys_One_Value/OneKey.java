package Lectures.L2_HashMap_Keys_One_Value;

import java.util.HashMap;

public class OneKey {
    public static void main(String[] args) {
        /*
        The hash map has a maximum of one value per key. If a new
        key-value pair is added to the hash map, but the key has
        already been associated with some other value stored in
        the hash map, the old value will vanish from the hash map.
        */
        HashMap<String , String> numbers = new HashMap<>();
        numbers.put("Uno", "One");
        numbers.put("Dos", "Zwei");
        numbers.put("Uno", "Ein");

        String translation = numbers.get("Uno");
        System.out.println(translation);

        System.out.println(numbers.get("Dos"));
        System.out.println(numbers.get("Tres"));
        System.out.println(numbers.get("Uno"));
    }
}
