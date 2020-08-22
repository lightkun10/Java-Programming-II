package Lectures.L3_Sorting_By_Multiple_Criteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("A", 2000));
        films.add(new Film("B", 1999));
        films.add(new Film("C", 2001));
        films.add(new Film("D", 2000));

        films.stream().forEach(film -> System.out.println(film));

        // An example in which films are listed in order of their name and year of release.
        Comparator<Film> comparator = Comparator.comparing(Film::getReleaseYear)
                                                .thenComparing(Film::getName);

        Collections.sort(films, comparator);

        System.out.println();

        films.stream().forEach(film -> System.out.println(film));

    }
}
