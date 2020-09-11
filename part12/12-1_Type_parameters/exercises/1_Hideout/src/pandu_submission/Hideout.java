package pandu_submission;

public class Hideout<T> {

    //  The object created from the class may only hide one object at a time.
    private T element;

    // Puts an object with a type in accordance with the type 
    // parameter given to the the class into the hideout. 
    // In case an object is already in the hideout, it will disappear.
    public void putIntoHideout(T toHide) {
        this.element = toHide;
    }

    // Takes out the object with a type in accordance with 
    // the type parameter given to the the class from the hideout. 
    // In case there is nothing in the hideout, we return null. 
    // Calling the method returns the object in the hideout and 
    // removes the object from the hideout.
    public T takeFromHideout() {
        T value = this.element;
        this.element = null;
        return value;
    }

    // Returns the value true if there is an object in the hideout. 
    // In case there isn't an object in the hideout, it should return the value false.
    public boolean isInHideout() {

        // Using try-catch to catch the Null value
        try {
            // If value is empty instead, return false immediately
            T val = this.element;
            if (val.equals("")) {
                return false;
            }
        } catch(NullPointerException e) {
            return false;
        }

        // If no null value or value is not empty...
        return true;
    }
}