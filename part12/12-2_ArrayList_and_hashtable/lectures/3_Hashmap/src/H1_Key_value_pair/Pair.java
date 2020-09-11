package H1_Key_value_pair;

/*
We want to make the hash map as general as possible, so the
types of the key and the value are determined at run-time.
The generic types K and V are named so after the words 'key' and 'value'.
*/
public class Pair<K, V> {
    // Instance variable
    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
