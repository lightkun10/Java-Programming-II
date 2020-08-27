package Lectures.L2_Describing_class_constructor;

public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.name = initialName;
        this.age = 0;
    }

    /*
    In a class diagram on Person-UML file, we list the constructor (and all other methods)
    below the attributes. A line below the attributes list separates it from the method list.
    Methods are written with +/- (depending on the visibility of the method), method name,
    parameters, and their types. The constructor above is written +Person(initialName:String)

    The parameters are written the same way class attributes are — "parameterName: parameterType".
    */
}
