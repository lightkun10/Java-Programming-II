package creating_generic_interfaces;

/*
Creating generic interfaces is very similar to creating generic classes.
Below you can study the generic interface creating_generic_interfaces.List (our own definition,
which is not as extensive as the existing Java creating_generic_interfaces.List).
https://docs.oracle.com/javase/8/docs/api/java/util/List.html
*/
public interface List<T> {
    void add(T value);
    T get(int index);
    T remove(int index);
}