package Lectures.L1_Intro;

import java.util.HashMap;

public class Introduction {
    public static void main(String[] args) {
        HashMap<String, String> postalCodes = new HashMap<>();
        postalCodes.put("00710", "Helsinki");
        postalCodes.put("90014", "Oulu");
        postalCodes.put("33720", "Tampere");
        postalCodes.put("33014", "Tampere");
        // System.out.println(postalCodes.get("00710"));

        /*
        If the hash map does not contained the key used for the search,
        its get method returns a null reference.
        */

        HashMap<String, String> numbers = new HashMap<>();
        numbers.put("One", "Uno");
        numbers.put("Two", "Dos");
        String translation = numbers.get("One");
        System.out.println(translation);

        System.out.println(numbers.get("Two"));
        System.out.println(numbers.get("Three"));
        System.out.println(numbers.get("Uno"));
    }
}
