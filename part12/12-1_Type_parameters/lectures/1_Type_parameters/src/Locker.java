/*
Using generics: [CLASS NAME]<[CHOSEN NUMBER OF TYPE PARAMETER]>
ex: public class Class<TypeParam1, TypeParam2>
*/

public class Locker<T> {

    /*
    Generics relates to how classes that store objects can store objects
    of a freely chosen type. The choice is based on the generic type
    parameter in the definition of the classes, which makes it possible
    to choose the type(s) at the moment of the object's creation.
    */
    private T element;

    public void setValue(T element) {
        this.element = element;
    }

    public T getValue() {
        return element;
    }

}
