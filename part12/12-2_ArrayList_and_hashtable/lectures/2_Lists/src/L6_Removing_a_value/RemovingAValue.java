package L6_Removing_a_value;

public class RemovingAValue {
    public static void main(String[] args) {
        List<String> myList = new List<>();
        System.out.println(myList.contains("hello"));
        myList.add("hello");
        System.out.println(myList.contains("hello"));
        myList.remove("hello");
        System.out.println(myList.contains("hello"));
    }
}
