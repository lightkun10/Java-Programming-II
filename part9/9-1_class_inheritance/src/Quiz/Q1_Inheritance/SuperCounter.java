package Quiz.Q1_Inheritance;

public class SuperCounter extends Counter {

    @Override
    public int addToNumber(int number) {
        return number + 5;
    }

    public int addToNumberSuperVersion(int number) {
        return number + 100;
    }
}
