package L4_Adding_values_to_a_list_part2;

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

    /*
    The size of the List increases if user tries to add a value to a full list.
    The size of the List is increased by creating a new, larger, array to which
    the values from the old array are copied to. After this the old array is
    abandoned and the List starts to use the new array.
    */
    private void grow() {
        // The size of the array is determined in Java with the formula oldSize + oldSize / 2
        int newSize = this.values.length + this.values.length / 2;
        // Create new array with new, increased size
        Type[] newValues = (Type[]) new Object[newSize];
        // Iterate through each value in old array, and insert new values into new created array
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }

        // Old array is discarded, entirely replaced with the new array
        this.values = newValues;
    }
}
