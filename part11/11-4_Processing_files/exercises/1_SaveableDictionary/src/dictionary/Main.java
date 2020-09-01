package dictionary;

public class Main {
    public static void main(String[] args) {
        String path = "src/dictionary/";
//        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
//        boolean wasSuccessful = dictionary.load();
//
//        SaveableDictionary s = new SaveableDictionary("words.txt");
//        s.load();
//        // System.out.println(s.translate("olut"));
//        s.add("tieokone", "computer");
//        s.add("computer", "tieokone");
//        s.save();
        SaveableDictionary s = new SaveableDictionary(path + "words.txt");
        s.load();
        s.delete("below");
        s.add("tieokone", "computer");
        s.save();
    }
}