package Lectures.L0_Intro;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneNumber {

    public /* static */ void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneNumbers = new HashMap<>();

        // Initially attach an empty list to the name Pekka
        phoneNumbers.put("Pekka", new ArrayList<>());

        // Add phone number to the list at Pekka
        phoneNumbers.get("Pekka").add("040-12348765");
        phoneNumbers.get("Pekka").add("048-224-114");

        // Print the item(s) of phonenumber list with the key "Pekka"
        System.out.println("Pekka's numbers: " + phoneNumbers.get("Pekka"));
    }

}
