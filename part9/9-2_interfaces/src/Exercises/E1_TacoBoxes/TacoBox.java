package Exercises.E1_TacoBoxes;

public interface TacoBox {

    // Return the number of tacos remaining in the box
    int tacosRemaining();

    // Reduces the number of tacos remaining by one.
    // The number of tacos remaining can't become negative.
    void eat();
}
