import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {

    ArrayList<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }

    // Puts an object with a type in accordance with
    // the type parameter given to the the class into the pipe.
    public void putIntoPipe(T value) {
        this.values.add(value);
    }

    // Takes out the value, which has been in the pipe the longest.
    // In case there is nothing in the pipe, return null.
    // Calling the method returns the value, which has been in
    // the pipe the longest, and removes it from the pipe.
    public T takeFromPipe() {
        if (this.values.isEmpty()) {
            return null;
        }

        Integer longestIdx = this.values.size() - 1;
        T val = this.values.get(longestIdx);
        this.values.remove(this.values.get(longestIdx));

        return val;
    }

    // Returns the value true if the pipe has values.
    // In case the pipe is empty, it returns the value false.
    public boolean isInPipe() {
        if (this.values.isEmpty()) {
            return false;
        }

        return true;
    }
}