package Lectures.L0_Intro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TextMessage message = new TextMessage("ope", "It's going great!");
        // System.out.println(message.read());

        ArrayList<TextMessage> textMessage = new ArrayList<>();
        // textMessage.add(new TextMessage("private number", "I hid the body."));

        ArrayList<String> pages = new ArrayList<>();
        pages.add("Split your method into short, readable entities.");
        pages.add("Separate the user-interface logic from the application logic.");
        pages.add("Always program a small part initially that solves a part of the problem.");
        pages.add("Practice makes the master. Try different out things for yourself and work on your own projects.");

        Ebook book = new Ebook("Tips for programming.", pages);

        int page = 0;
        while (page < book.pages()) {
            System.out.println(book.read());
            page = page + 1;
        }

    }
}
