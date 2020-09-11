
public class Info<A, B> {
    A a;
    B b;

    public Info(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return this.a.toString() + " " + this.b.toString();
    }

}
