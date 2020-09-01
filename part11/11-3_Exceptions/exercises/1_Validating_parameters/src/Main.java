import validating.Calculator;
import validating.Person;

public class Main {
    public static void main(String[] args) {
        Person panda = new Person("Pandu", 26);

        Person who = new Person("Who?", 120);

        Calculator calculator = new Calculator();
        calculator.factorial(1);
    }
}