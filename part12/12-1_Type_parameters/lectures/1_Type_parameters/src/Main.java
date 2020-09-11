import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Locker<String> string = new Locker<>();
        string.setValue(":)");
        System.out.println(string.getValue());

        /*
        Changing the type parameter allows for creating lockers
        that store objects of other types. You could store an
        integer in the following manner.
        */
        Locker<Integer> integer = new Locker<>();
        integer.setValue(5);
        System.out.println(integer.getValue());

        /* Similarly, here is how to create a locker for storing a Random object. */
        Locker<Random> random = new Locker<Random>();
        random.setValue(new Random());
        System.out.println(random.getValue().nextDouble());

        /*
        The programmer could implement the following Pair class that is able
        to store two objects of specified types.
        */
        Pair<Integer, String> pair = new Pair<>();
        Pair<Object, Object> pair2 = new Pair<>();
        pair.setValues(1, "Ichi");
        pair2.setValues("Hey", pair);
        System.out.println(pair2);
    }
}
