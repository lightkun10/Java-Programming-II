package H1_Key_value_pair;

public class KeyValue {
    public static void main(String[] args) {
        Pair<String, Integer> myPair = new Pair<>("one", 1);
        System.out.println(myPair.getKey() + " -> " + myPair.getValue());
    }
}
