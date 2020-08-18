package Lectures.L4_Built_in_Interfaces.L4_2_The_Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
        The Map interface defines the basic behavior associated
        with hash tables. Because the HashMap class implements
        the Map interface, it can also be accessed through the Map interface.
        https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
        */
        Map<String, String> maps = new HashMap<>();
        maps.put("ganbatte", "good luck");
        maps.put("hai", "yes");

        // The keys to the hash table are obtained using the keySet method.
        for (String key : maps.keySet()) {
            System.out.println(key + ": " + maps.get(key));
        }

        /*
        The keySet method returns a set of elements that implement
        the Set interface. You can use a for-each statement to go
        through a set that implements the Set interface. The hash
        values can be obtained from the hash table using the values method.
        The values method returns a set of elements that implement
        the Collection interface.
        */

    }
}
