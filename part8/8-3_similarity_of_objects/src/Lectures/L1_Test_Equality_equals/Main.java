package Lectures.L1_Test_Equality_equals;

/* Method to Test For Equality - "equals"
The equals method checks by default whether the object given as
a parameter has the same reference as the object it is being
compared to. In other words, the default behaviour checks whether
the two objects are the same. If the reference is the same,
the method returns true, and false otherwise.
*/

public class Main {
    public static void main(String[] args) {
        Book bookObject = new Book("Book object", 2000, "...");
        Book anotherBookObject = bookObject;

        // Referencing the same object
        if (bookObject.equals(anotherBookObject)) {
            System.out.println("The books are the same");
        } else {
            System.out.println("The books aren't the same");
        }

        // we now create an object with the same content
        // that's nonetheless its own object
        Book anotherBookObject2 = new Book("Book object", 2000, "...");

        // Comparing two different entities, even though
        // the variables have the same values
        if (bookObject.equals(anotherBookObject2)) {    // Using override method equals instead
            System.out.println("The books are the same");
        } else {
            System.out.println("The books aren't the same");
        }

    }
}
