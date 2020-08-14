package Exercises.E1_DictionaryOfManyTranslations;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    // Adds the translation for the word and
    // preserves the old translations.
    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        this.dictionary.get(word).add(translation);
    }

    // Returns a list of the translations added
    // for the word. If the word has no translations,
    // the method should return an empty list.
    public ArrayList<String> translate(String word) {
        return this.dictionary.getOrDefault(word, new ArrayList<>());
    }

    // Removes the word and all its translations from the dictionary.
    public void remove(String word) {
        this.dictionary.remove(word);
    }
}

