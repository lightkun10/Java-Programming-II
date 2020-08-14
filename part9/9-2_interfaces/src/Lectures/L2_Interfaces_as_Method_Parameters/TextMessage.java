package Lectures.L2_Interfaces_as_Method_Parameters;

public class TextMessage implements Readable {
    private String sender;
    private String content;

    public TextMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return this.sender;
    }

    // Implement Readable interface
    // Implementations of methods defined in the interface
    // must always have public as their visibility attribute.
    public String read() {
        return this.content;
    }
}
