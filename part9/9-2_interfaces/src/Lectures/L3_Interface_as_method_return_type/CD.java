package Lectures.L3_Interface_as_method_return_type;

public class CD implements Packable {
    private String artist;
    private String name;
    private int publicationYear;
    private double weight;

    public CD(String iA, String iN, int iP) {
        this.artist = iA;
        this.name = iN;
        this.publicationYear = iP;
        this.weight = 0.1; // in kg
    }

    @Override
    public double weight() {
        return this.weight;
    }

    public String toString() {
        return this.artist + ": " + this.name + " (" + this.publicationYear + ")" ;
    }

}
