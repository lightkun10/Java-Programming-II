
public class List<T> {
    private T[] values;
    private int freeIndex;

    public List() {
        this.values = (T[]) new Object[20];
        this.freeIndex = 0;
    }

    public void add(T value) {
        if (this.freeIndex == this.values.length) {
            this.grow();
        }

        this.values[this.freeIndex] = value;
        this.freeIndex++;
    }

    private void grow() {
        // The size of the array is determined in Java with the formula oldSize + oldSize / 2
        int oldSize = this.values.length;
        int newSize = oldSize + oldSize / 2;

        // Create new array with new, increased size
        T[] newValues = (T[]) new Object[newSize]; // casting

        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }

    // This method would be easier to use, if the user
    // had information about the indexes of the values.
    public int indexOfValue(T value) {
        for (int index = 0; index < this.freeIndex; index++) {
            if (this.values[index].equals(value)) {
                return index;
            }
        }

        return -1;
    }

    public boolean contains(T value) {
        return indexOfValue(value) >= 0;
    }

    public void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.freeIndex - 1; i++) { // everything but the one last empty index
            this.values[i] = this.values[i + 1];
        }
    }

    public void remove(T value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return;
        }

        moveToTheLeft(indexOfValue);
        this.freeIndex--;
    }

    public T value(int index) {
        if (index < 0 || index >= this.freeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.freeIndex + "]");
        }

        return this.values[index];
    }

    public int size() {
        return this.freeIndex; // Simply return the last empty index
    }
}
