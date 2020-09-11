package model_solution;

public class Hideout<T> {

    private T inHiding;

    public void putIntoHideout(T toHide) {
        this.inHiding = toHide;
    }

    public boolean isInHiding() {
        return this.inHiding != null;
    }

    public T takeFromHideout() {
        T previouslyInHiding = this.inHiding;
        this.inHiding = null;
        return previouslyInHiding;
    }
}