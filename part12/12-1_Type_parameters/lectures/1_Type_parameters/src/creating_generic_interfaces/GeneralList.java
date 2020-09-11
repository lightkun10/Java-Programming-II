package creating_generic_interfaces;

import java.util.ArrayList;

/*
The alternative is to use a type parameter in the class defintion,
in which case the parameter is passed along to the interface.
Now this concrete implementation of the interface remains generic.
*/
public class GeneralList<T> implements List<T> {

    /*
    Here I use the existing ArrayList class to implement the GeneralList.
    The implementation would look roughly like this.
    */
    ArrayList<T> values;

    public GeneralList() {
        this.values = new ArrayList<>();
    }

    @Override
    public void add(T value) {
        this.values.add(value);
    }

    @Override
    public T get(int index) {
        return this.values.get(index);
    }

    @Override
    public T remove(int index) {
        T value = this.values.get(index);
        this.values.remove(index);
        return value;
    }

}
