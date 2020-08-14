package Lectures.L3_Calling_superclass_method;

public class Subclass extends Superclass {

    public Subclass() {
        super("Subclass");
    }

    @Override
    public String toString() {
        return super.toString() + "\n  And let's add my own message to it!";
    }
}
