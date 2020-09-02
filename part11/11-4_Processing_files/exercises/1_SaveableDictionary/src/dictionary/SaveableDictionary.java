package dictionary;

import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SaveableDictionary {
    private Map<String, String> dictionaries;
    private String file;

    public SaveableDictionary() {
        this("");
    }

    public SaveableDictionary(String file) {
        this.dictionaries = new HashMap<>();
        this.file = file;
    }

    // Adds a word to the dictionary.
    // Every word has just one translation,
    // and if the same word is added for the second time, nothing happens.
    public void add(String words, String translation) {
        if (!this.dictionaries.containsKey(words) && !this.dictionaries.containsValue(words)) {
            this.dictionaries.put(words, translation);
        }
    }

    // Returns the translation for the given word.
    // If the word is not in the dictionary, returns null.
    public String translate(String word) {
        if (this.dictionaries.containsKey(word)) {
            return this.dictionaries.get(word);
        } else if (this.dictionaries.containsValue(word)) {
            for (String key : this.dictionaries.keySet()) {
                if (this.dictionaries.get(key).equals(word)) {
                    return key;
                }
            }
        }

        return null;
    }

    // Deletes the given word and its translation from the dictionary.
    // Deleting also works both ways:
    // Both the word and its translation are removed if either
    // the word or the translation are deleted.
    public void delete(String word) {
        if (this.dictionaries.containsKey(word)) {
            this.dictionaries.remove(word);
        }

        // Remove by value: https://dzone.com/articles/removing-elements-from-a-map-in-java
        if (this.dictionaries.containsValue(word)) {
            this.dictionaries.values().removeIf(val -> val.equals(word));
        }
    }

    // Loads the dictionary from the file given to
    // the constructor as a parameter. If the program is
    // unable to open the file or read from it, the method
    // returns false, otherwise it returns true.
    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(this.file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character

                this.dictionaries.put(parts[0], parts[1]);
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    // Saves the dictionary to the file given to 
    // the dictionary as a parameter to the constructor.
    public boolean save() {
        try (FileWriter writer = new FileWriter(this.file)) {
            // Iterate through keys
            for (String key : this.dictionaries.keySet()) {
                String v2 = this.dictionaries.get(key);

                writer.write(key + ":" + v2 + "\n");
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

}
