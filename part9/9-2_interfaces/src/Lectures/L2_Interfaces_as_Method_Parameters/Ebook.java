package Lectures.L2_Interfaces_as_Method_Parameters;

import java.util.ArrayList;

public class Ebook implements Readable {

    private String name;
    private ArrayList<String> pages;
    private int pageNumber;

    public Ebook(String name, ArrayList<String> pages) {
        this.name = name;
        this.pages = pages;
        this.pageNumber = 0;
    }

    public String getName() {
        return this.name;
    }

    public int pages() {
        return this.pages.size();
    }

    // Implement Readable interface
    // In here, read return current page number
    public String read() {
        String page = this.pages.get(this.pageNumber);
        nextPage();
        return page;
    }

    private void nextPage() {
        this.pageNumber = this.pageNumber + 1;

        // Reset the count
        if (this.pageNumber % this.pages.size() == 0) {
            this.pageNumber = 0;
        }
    }
}
