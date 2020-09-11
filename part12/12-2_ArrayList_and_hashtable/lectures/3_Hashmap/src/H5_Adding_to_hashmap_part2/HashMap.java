package H5_Adding_to_hashmap_part2;

public class HashMap<K, V> {
    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }

        return null;
    }

    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            this.values[hashValue] = new List<>();
        }

        return this.values[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.value(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }

    /*
    Add the growing functionality to be a part of the add method.
    We want to grow the size of the hash map if the number of key-value
    pairs in it is greater than 75% of the size of the internal array.
    */
    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.value(index).setValue(value);
        }

        // Grow the size of the hash map if the number of key-value pairs
        // in it is greater than 75% of the size of the internal array.
        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    /*
    The responsible method should create a new array whose size is double
    that of the old array. After this it goes through the old array,
    index by index. The encountered key-value pairs are copied into the new array.
    Finally, the old array is replaced with the new one.
    */
    private void grow() {
        // Create a new array
        List<Pair<K, V>>[] newArray = new List[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++) {
            // Copy the values of the old array into the new one
            copy(newArray, i);
        }

        // Replace the old array with the new one
        this.values = newArray;
    }

    /*
    A method that copies the list of values at one index of the old array into
    the new one. When copying, the location of each key-value pair is recalculated
    for the new array — this is done because the size of the internal array grows,
    and we want to distribute all the key-value pairs in that array as evenly as possible.
    */
    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        // First, Iterate through the old array's content
        for (int i = 0; i < this.values[fromIdx].size(); i++) {
            // Copy each of the old array's value into a new Pair named value
            Pair<K, V> value = this.values[fromIdx].value(i);

            // Make a new hash value for each new key.
            // Modulo (remainder of division operation) is for ensuring that the index
            // stays within the size boundaries of the length of new array
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);

            // If the position of that new array is empty/null, create a new list
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new List<>();
            }

            // Regardless, add new value to that position index
            newArray[hashValue].add(value);
        }
    }
}
