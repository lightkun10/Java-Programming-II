package Lectures.L3_Interface_as_method_return_type;

public class ChocolateBar implements Packable {
    // Because Java's automatically generated default
    // constructor is enough, we don't need a constructor

    @Override
    public double weight() {
        return 0.2;
    }
}
