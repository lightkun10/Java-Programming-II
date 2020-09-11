package H2_Creating_a_hashmap;

/*
A hash map contains an array of lists. Each value on the list is
a pair (described in the previous section) that contains a key and
a value. A hash map also knows the number of the values.
Here we have at our disposal the previously created class List.
*/

public class HashMap<K, V> {

    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

}
