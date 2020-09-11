package L7_Searching_from_an_index;

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
    This method would be easier to use, if the user had information about the indexes
    of the values. Let's modify the method indexOfValue(Type value) so it can be used
    by everyone, so it is public instead of private. */
    public int indexOfValue(Type value) {
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

    public Type value(int index) {
        if (index < 0 || index  >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index +
                                                " outside of [0, " + this.firstFreeIndex + "]");
        }

        return this.values[index];
    }

}
