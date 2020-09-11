import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");

        String number =  strings.get(0);

        /*
        Program won't work because get method returns a String object
        yet assigned as String instead
        */
    }

}
