package Lectures.L0_Intro;

public class Engine extends Part {

    // Instance variable
    private String engineType;

    public Engine(String engineType, String identifier, String manufacturer, String description) {
        // call the constructor of the superclass, Part.
        super(identifier, manufacturer, description);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return this.engineType;
    }
}
