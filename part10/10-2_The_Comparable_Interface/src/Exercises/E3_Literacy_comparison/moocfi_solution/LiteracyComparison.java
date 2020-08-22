package Exercises.E3_Literacy_comparison.moocfi_solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<Result> results = new ArrayList<>();
        String path = "src/Exercises/E3_Literacy_comparison/";

        try {
            Files.lines(Paths.get(path + "literacy.csv"))
                    .map(l -> l.split(","))
                    .map(a -> new Result(
                                a[2].replace("(%)", "").trim(),
                                a[3],
                                Integer.parseInt(a[4]),
                                Double.parseDouble(a[5])))
                    .forEach(t -> results.add(t));
        } catch (IOException ex) {
            System.out.println("Error reading file.");
        }

        results.stream().sorted((t1, t2) -> {
            if (t1.getLiteracyPercent() > t2.getLiteracyPercent()) {
                return 1;
            }
            if (t1.getLiteracyPercent() < t2.getLiteracyPercent()) {
                return -1;
            }
            return 0;
        }).forEach(t -> System.out.println(t));
    }

}
