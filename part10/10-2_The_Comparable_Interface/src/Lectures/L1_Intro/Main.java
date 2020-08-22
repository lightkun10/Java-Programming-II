package Lectures.L1_Intro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> member = new ArrayList<>();
        member.add(new Member("mikael", 182));
        member.add(new Member("matti", 187));
        member.add(new Member("ada", 184));

        member.stream().forEach(m -> System.out.println(m));
        System.out.println();

        // Sorting the stream that is to be printed using the sorted method
        member.stream().sorted().forEach(m -> System.out.println(m));
        System.out.println();
        // Print the original list using stream, still retaining the original list
        // Because these two will manipulate the stream, not the actual list
        member.stream().forEach(m -> System.out.println(m));
        System.out.println();

        // Sorting a list with the sort-method of the Collections class,
        // which means, manipulate the original list itself
        Collections.sort(member);
        member.stream().forEach(m -> System.out.println(m));
    }
}
