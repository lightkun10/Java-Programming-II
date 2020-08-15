package Exercises.E3_List_as_method_parameter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // test your method here
        List<String> names = new ArrayList<>();

        /*
        ArrayList extends AbstractList and implements List,
        (and more). Here names is an object of ArrayList, stored as a List.
        Because ArrayList is implements List, it can be stored as List.
        */

        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));
    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
    public static int returnSize(List<String> list) {
        return list.size();
    }

}
