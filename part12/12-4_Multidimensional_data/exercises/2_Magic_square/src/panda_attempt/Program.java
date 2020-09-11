package panda_attempt;

public class Program {
    public static void main(String[] args) {
//        MagicSquare ms = new MagicSquare(2);
//        System.out.println(ms.sumsOfRows());

        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(3));
    }
}
