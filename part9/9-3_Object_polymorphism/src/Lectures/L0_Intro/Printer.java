package Lectures.L0_Intro;

public class Printer {

    /*
    The method can be given any type of object as a parameter.
    Within the printManyTimes method, the object only has
    access to the methods defined in the Object class because
    the object is known in the method to be of type Object.
    */
    public void printManyTimes(Object object, int times) {
        int i = 0;

        while (i < times) {
            System.out.println(object.toString());
            // or System.out.println(object);

            i += 1;
        }
    }

    // Extend the Printer class so that it has a method for printing
    // the characters of objects that implement the CharSequence interface.
    // The CharSequence interface provides, among other things,
    // methods int length() for getting a string's length and
    // char charAt(int index), which retrieves a character from a given index.
    public void printCharacters(CharSequence charSequence) {
        int i = 0;
        while (i < charSequence.length()) {
            System.out.println(charSequence.charAt(i));
            i += 1;
        }
    }

}
