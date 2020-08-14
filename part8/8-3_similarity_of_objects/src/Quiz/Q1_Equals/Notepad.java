package Quiz.Q1_Equals;

public class Notepad {
    private String name;
    private int year;

    public Notepad(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) { return false; }

        if (this == object) { return true; }

        // Cast the parameter object to the same as Notepad
        Notepad compared = (Notepad) object;

        return this.name.equals(compared);
    }

}
