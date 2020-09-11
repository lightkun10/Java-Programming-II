package L6_Removing_a_value;

public class List<Type> {
    private Type[] values;
    // to keep track of the first empty index in the array.
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {
        // If current empty index is the last index of the array, "grow" its size
        if (this.firstFreeIndex == this.values.length) {
            this.grow();
        }

        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++; // move to next free index
    }

    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }

    /*
    The class List now contains some repeated code.
    The method contains is very similiar to the method indexOfValue.
    */
    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }
    
    /*
    Simple implementation would be as follows:
    */
//    public void remove1(Type value) {
//        for (int i = 0; i < this.firstFreeIndex; i++) {
//            if (value == this.values[i] || this.values[i].equals(value)) {
//                this.values[i] = null;
//                this.firstFreeIndex--;
//                return;
//            }
//        }
//    }
    /*
    The above implementation is however problematic, because it leaves "empty"
    slots to the List, which would lead to the contains method not working.
    */


//    public void remove2(Type value) {
//        boolean found = false;
//
//        for (int i = 0; i < this.firstFreeIndex; i++) {
//            if (found) {
//                this.values[i - 1] = this.values[i];
//            } else if (value == this.values[i] || this.values[i].equals(value)) {
//                this.firstFreeIndex--;
//                found = true;
//            }
//        }
//    }
    /*
    We are not really satisfied with the solution above, because it does too many
    things at the same time. The method looks for an element and moves elements around.
    */


    /* Searches for the index of the given value. The method returns -1 if the value is not found. */
    private int indexOfValue(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    /* Moves values from the given index one place to the left. */
    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }

    /* Now we can implement the method remove using these two methods. */
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }

        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }


}
