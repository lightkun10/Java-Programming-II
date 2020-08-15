package Lectures.L3_Interface_as_method_return_type;

public class Book implements Packable {
    private String author;
    private String name;
    private double weight;

    public Book(String iA, String iN, double iW) {
        this.author = iA;
        this.name = iN;
        this.weight = iW;
    }

    @Override
    public double weight() {
        return this.weight; // Maybe better if I change this soon
    }

    public String toString() {
        return this.author + ": " + this.name;
    }
}