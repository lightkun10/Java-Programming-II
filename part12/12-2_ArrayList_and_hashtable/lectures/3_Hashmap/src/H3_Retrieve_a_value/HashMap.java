package H3_Retrieve_a_value;

public class HashMap<K, V> {

    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

    public V get(K key) {
        /*
        The method begins by calculating a hash value for the key, and using it
        to figure out which is the relevant index of the internal array of the
        hash map. The hash value is calculated with the hashCode method that
        each object has. Then modulo (remainder of division operation) is used
        for ensuring that the index stays within the size boundaries of the internal array.
        */
        int hashValue = Math.abs(key.hashCode() % this.values.length);

        /*
        If there is no list in the calculated index, no key-value pairs have been added
        to that index. This means that there are no key-value pairs with this key that
        have been stored. In this case we'll return the null reference.
        */
        if (this.values[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        /*
        Otherwise, the program goes through the list at the index, and we compare the
        parameter key to the key of every key-value pair on that list. If some of the
        keys matches the parameter key, the method returns the value of that
        key-value pair.
        */
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }

        /* Otherwise we cannot find a suitable key (and related value), so the method returns the value null. */
        return null;
    }
}
