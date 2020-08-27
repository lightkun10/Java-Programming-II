package Lectures.L3_Enumerated_Type.E2_Object_References_In_Enums;

public enum Color {
    // constructor parameters are defined as
    // the constants are enumerated
    RED("FF0000"),
    GREEN("00FF00"),
    BLUE("#0000FF");

    private String code;        // object reference variable

    private Color(String code) { // constructor
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
