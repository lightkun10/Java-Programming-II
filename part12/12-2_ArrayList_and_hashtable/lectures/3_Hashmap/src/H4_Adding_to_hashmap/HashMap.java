package H4_Adding_to_hashmap;

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

    public void complex_add(K key, V value) {
        /* Calculates the hash value for the key, and uses it
        to determine the suitable index in the internal array. */
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        /* If there is no value in that index, create a list into that index. */
        if (this.values[hashValue] == null) {
            this.values[hashValue] = new List<>();
        }

        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        /*
        After that, the method goes through the list at the index, and looks
        for a key-value pair whose key matches the key of the key-value pair to be added.
        */
        int index = -1;
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                index = i;
                break;
            }
        }

        /*
        If the matching key is found, the value related to it is updated to match the new value.
        Otherwise the method adds a new key-value pair in the list — in which case the number
        of stored values is also incremented by one.
        */
        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.value(index).setValue(value);
        }

    }

    /*
    The method (above) is quite complex, so let's divide it into smaller parts.
    The first part is responsible for finding the list related to the key,
    and the second part is responsible for finding the key on that list.
    */

    private List<Pair<K, V>> getListBasedOnKey(K key) {
        /* Calculates the hash value for the key, and uses it
        to determine the suitable index in the internal array. */
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        /* If there is no value in that index, create a list into that index. */
        if (this.values[hashValue] == null) {
            this.values[hashValue] = new List<>();
        }

        return this.values[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        /*
        Goes through the list at the index, and looks for a key-value pair
        whose key matches the key of the key-value pair to be added,
        then return the index.
        */
        for (int i = 0; i < myList.size(); i++) {
            if (myList.value(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }

    /* Somewhat clearer implementation of the method add */
    public void /*More-readable*/ add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        /*
        If the matching key is found, the value related to it is updated to match the new value.
        Otherwise the method adds a new key-value pair in the list — in which case the number
        of stored values is also incremented by one.
        */
        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
        } else {
            valuesAtIndex.value(index).setValue(value);
        }
    }
}
