package L5_Checking_the_existence_of_a_value;

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
    We will make use of the fact that each Java object — no matter its type — inherits
    the Object class (or is type Object). Due to this, each object has the method
    public boolean equals(Object object), which we can use to check equality.
    */
    public boolean contains(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return true;
            }
        }

        return false;
    }

}
