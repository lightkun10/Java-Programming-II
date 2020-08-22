package Exercises.E4_Literature.model_solution;

public class Book implements Comparable<Book> {
    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return this.name; }

    public void setName(String newName) { this.name = newName; }

    public int getAge() { return this.age; }

    public void setAge(int newAge) { this.age = newAge; }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.age + " year-olds or older)";
    }

    // Remember that int need the comparable interface while String already has its own comparable
    @Override
    public int compareTo(Book o) {
        /* Manual, long way */
//        if (this.age == o.age) {
//            // If age is exactly the same to each other, compare name instead
//            return this.name.compareTo(o.name);
//        } else if (this.age > o.age) {
//            return 1;
//        } else {
//            return -1;
//        }

        // ===========================================================================

        /* Short way */
        // If age is exactly the same to each other, compare name instead
        if (this.age == o.age) {
            return this.name.compareTo(o.name);
        }
        // Compare according to age
         return this.age - o.age;
    }


}
