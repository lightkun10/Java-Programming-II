package Exercises.E5_PlayerAndBot;

public class Bot extends Player {

    public Bot(String pName) {
        super(pName);
    }

    public void play() {}

    public void addMove(String move) {
        System.out.println("Adding move " + move + "...");
    }
}