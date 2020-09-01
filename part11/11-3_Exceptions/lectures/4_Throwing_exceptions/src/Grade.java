public class Grade {
    private int grade;

    /*
    The IllegalArgumentException tells the user that the values
    given to a method or a constructor as parameters are wrong.
    It can be used when we want to ensure certain parameter values.
    */
    public Grade(int grade) {
        // The grade has to be an integer between 0 and 5.
        if (grade < 0 || grade > 5) {
            throw new IllegalArgumentException("Grade must be between 0 and 5");
        }

        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }
}
