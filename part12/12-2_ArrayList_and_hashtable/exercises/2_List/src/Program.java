import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> strings = new List<>();



        strings.add("hello");
        strings.add("welcome");

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.value(i));
        }
    }

}
