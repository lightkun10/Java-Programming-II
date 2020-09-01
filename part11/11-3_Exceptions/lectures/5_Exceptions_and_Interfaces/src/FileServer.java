public interface FileServer {
    String load(String fileName) throws Exception;

    void save(String fileName, String textToSave) throws Exception;

    /*
    If an interface declares a throws Exception attribute to a method,
    so that these methods might throw an exception, the class
    implementing this interface must also have this attribute.
    However the class does not have to throw an error, as we can see in class TextServer.
    */
}
