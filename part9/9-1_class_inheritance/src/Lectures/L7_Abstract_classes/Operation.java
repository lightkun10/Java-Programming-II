package Lectures.L7_Abstract_classes;

import java.util.Scanner;

public abstract class Operation {

    private String name;
    private String definition;

    public Operation(String name) {
        this(name, "");
    }


    public Operation(String name, String definition) {
        this.name = name;
        this.definition = definition;
    }

    public String getName() {
        return this.name;
    }

    public String getDefinition() {
        return this.definition;
    }

    public abstract void execute(Scanner scanner);
}
