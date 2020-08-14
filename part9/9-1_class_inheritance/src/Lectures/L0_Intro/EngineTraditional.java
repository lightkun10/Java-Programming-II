package Lectures.L0_Intro;

// Old, traditional way of making a class.
// For documentary purpose

public class EngineTraditional {
    private String engineType;
    private String identifier;
    private String manufacturer;
    private String description;

    public EngineTraditional(String engineType, String identifier, String manufacturer, String description) {
        this.engineType = engineType;
        this.identifier = identifier;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public String getEngineType() {
        return engineType;
    }

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
