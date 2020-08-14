package Exercises.E1_TacoBoxes;

public class CustomTacoBox implements TacoBox {

    private int tacos;

    public CustomTacoBox(int it) {
        this.tacos = it;
    }

    public int tacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        if (this.tacos <= 0) {
            return;
        }

        this.tacos = this.tacos - 1;
    }

}