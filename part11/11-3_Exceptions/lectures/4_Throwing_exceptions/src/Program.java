public class Program {

    public static void main(String[] args) {
        Grade grade = new Grade(3);
        System.out.println(grade.getGrade());

        Grade illegalGrade = new Grade(22);
        // exception happens, execution will not continue from here
        // Exception in thread "..." java.lang.IllegalArgumentException: Grade must be between 0 and 5.

        /*
        If an exception is a runtime exception, e.g. IllegalArgumentException,
        we do not have to warn about throwing it on the method declaration.
        */
    }

}
