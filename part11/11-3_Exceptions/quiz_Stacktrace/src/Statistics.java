import java.util.ArrayList;
import java.util.List;

public class Statistics {
    private List<Integer> numbers;

//    public Statistics() {
//        this.numbers = new ArrayList<>();
//    }

    public void add(int number) {
        this.numbers.add(number);
    }

    public double average() {
        Double d = 0.0;

        try {
            d = this.numbers.stream()
                    .mapToInt(i -> i)
                    .average().getAsDouble();
        } catch (Exception e) {
            System.out.println("No number in list, yet.");
        }

        return d;
    }

}
