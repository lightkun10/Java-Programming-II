package Exercises.E2_Abbreviations;

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    // Adds a new abbreviation and its explanation
    public void addAbbreviation(String abbreviation, String explanation) {
        // Get the formatted string data
        String abb = formattedStr(abbreviation);
        String exp = formattedStr(explanation);

        this.abbreviations.put(abbreviation, explanation);
    }

    // Checks if an abbreviation has already been added;
    // returns true if it has and false if it has not.
    public boolean hasAbbreviation(String abbreviation) {
        // Get the formatted string data
        String abb = formattedStr(abbreviation);
        return this.abbreviations.containsKey(abb);
    }

    // Finds the explanation for an abbreviation; returns
    // null if the abbreviation has not been added yet.
    public String findExplanationFor(String abbreviation) {
        // Get the formatted string data
        String abb = formattedStr(abbreviation);
        if (hasAbbreviation(abbreviation)) {
            return this.abbreviations.get(abb);
        } else {
            return null;
        }
    }

    public static String formattedStr(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }

}
