package Lectures.L8_Primitive_Variables_In_HashMaps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*
        A hash map expects that only reference-variables are added to it
        (in the same way that ArrayList does). Java converts primitive
        variables to their corresponding reference-types when using any
        Java's built in data structures (such as ArrayList and HashMap).
        Although the value 1 can be represented as a value of the primitive
        int variable, its type should be defined as Integer when using
        ArrayLists and HashMaps.
        */
        HashMap<Integer, String> hashmap = new HashMap<>(); // works
        hashmap.put(1, "Ole!");
        // HashMap<int, String> map2 = new HashMap<>(); // doesn't work
    }
}
