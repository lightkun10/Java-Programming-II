package L2_Creating_a_new_list;

/*
The List has a generic array — the type of the elements
in the array is defined on run time using type parameters.
*/
public class List<Type> {
    private Type[] values;

    public List() {
        /*
        The array is created as type object, and changed to type
        generic with (A[]) new Object[10]; — this is done because
        Java does not support the call new A[10]; for now.
        */
        this.values = (Type[]) new Object[10];
    }

    /*
    List encapsulates an array. In the beginning, every element in
    the array contains a null-reference.
    */
}
