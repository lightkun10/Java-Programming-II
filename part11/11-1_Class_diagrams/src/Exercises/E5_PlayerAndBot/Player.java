package Exercises.E5_PlayerAndBot;

public class Player {
    private String name;

    public Player(String pName) {
        this.name = pName;
    }

    public void printName() {
        System.out.println("Player name: " + this.name);
    }

}