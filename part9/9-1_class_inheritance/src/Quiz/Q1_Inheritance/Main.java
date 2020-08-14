package Quiz.Q1_Inheritance;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter superCounter = new SuperCounter();
        /*
        Because superCounter is stored in a Counter type variable,
        even though it is a reference to a SuperCounter type object,
        only the methods defined in the Counter class are available.
        */

        int number = 3;
        number = superCounter.subtractFromNumber(number);
        number = superCounter.subtractFromNumber(number);
        number = counter.addToNumber(number);
        System.out.println(number);

        // number = superCounter.addToNumberSuperVersion(3);
        // Doesn't work? Because superCounter is stored as a Counter type
    }
}
