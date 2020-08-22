package Exercises.E4_Literature.pandu_attempt;

public class Book {
    private String name;
    private int ageRecommendation;

    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }

    public String getName() {
        return this.name;
    }

    public int getAgeRecommendation() {
        return this.ageRecommendation;
    }

    public String toString() {
        return this.name + " (recommended for " + this.ageRecommendation + " year-olds or older)";
    }

}