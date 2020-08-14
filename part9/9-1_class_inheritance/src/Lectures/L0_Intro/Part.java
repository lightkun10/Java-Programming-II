package Lectures.L0_Intro;

public class Part {
    // Instance Variable
    private String identifier;
    private String manufacturer;
    private String description;

    // Constructor
    public Part(String identifier,  String manufacturer, String description) {
        this.identifier = identifier;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    // Getters
    public String getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
