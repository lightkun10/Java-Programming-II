package Lectures.L2_Calling_constructor_of_superclass;

public class Superclass {

    private String objectVariable;

    /**** Constructors ****/

    // If no parameter specified, calls the other constructor
    public Superclass() {
        this("Example");
    }

    public Superclass(String value) {
        this.objectVariable = value;
    }

    public String toString() {
        return this.objectVariable;
    }

}
