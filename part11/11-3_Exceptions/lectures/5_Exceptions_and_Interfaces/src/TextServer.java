import java.util.HashMap;
import java.util.Map;

public class TextServer implements FileServer {

    private Map<String, String> data;

    // Constructor
    public TextServer() {
        this.data = new HashMap<>();
    }

    @Override
    public String load(String fileName) throws Exception {
        return this.data.get(fileName);
    }

    @Override
    public void save(String fileName, String textToSave) throws Exception {
        this.data.put(fileName, textToSave);
    }

}
