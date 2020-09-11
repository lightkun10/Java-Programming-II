/*
There is no maximum on the number of type parameters,
it's all dependent on the implementation.
*/
public class Pair<T, K> {
    private T first;
    private K second;

    public void setValues(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public K getSecond() {
        return this.second;
    }

    public String toString() {
        return this.first.toString() + " " + this.second.toString();
    }

}
