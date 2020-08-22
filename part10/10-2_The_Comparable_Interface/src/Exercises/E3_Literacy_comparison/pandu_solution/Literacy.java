package Exercises.E3_Literacy_comparison.pandu_solution;

public class Literacy implements Comparable<Literacy> {
    private String country;
    private String gender;
    private int year;
    private double literacyPercent;

    public Literacy(String country, String gender, int year, double literacyPercent) {
        this.country = country;
        this.gender = gender;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public String getCountry() {
        return this.country;
    }

    public String getGender() {
        return this.gender;
    }

    public int getYear() {
        return this.year;
    }

    public double getLP() {
        return this.literacyPercent;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.literacyPercent;
    }

    @Override
    public int compareTo(Literacy oL) {
        if (this.literacyPercent == oL.literacyPercent) {
            return 0;
        } else if (this.literacyPercent > oL.literacyPercent) {
            return 1;
        } else {
            return -1;
        }
    }

}