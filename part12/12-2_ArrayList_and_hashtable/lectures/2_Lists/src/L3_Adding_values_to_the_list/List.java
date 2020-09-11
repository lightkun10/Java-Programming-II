package L3_Adding_values_to_the_list;

public class List<Type> {

    private Type[] values;
    // to keep track of the first empty index in the array.
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++; // move to next free index
    }
}
