package Lectures.L2_Interfaces_as_Method_Parameters;

import java.util.ArrayList;

public class ReadingList implements Readable {

    // Things to be read are added here.
    private ArrayList<Readable> readables;

    public ReadingList() {
        this.readables = new ArrayList<>();
    }

    // Using interface as method parameter
    public void add(Readable readable) {
        this.readables.add(readable);
    }

    public int toRead() {
        return this.readables.size();
    }

    public String read() {
        String read = "";

        // Reads all objects in the readables list
        for (Readable readable : this.readables) {
            read += readable.read() + "\n";
        }

        // once the reading list has been read, we empty it
        this.readables.clear();
        return read;
    }

}
