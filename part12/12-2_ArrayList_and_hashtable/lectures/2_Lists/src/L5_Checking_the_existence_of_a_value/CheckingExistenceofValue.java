package L5_Checking_the_existence_of_a_value;

public class CheckingExistenceofValue {
    public static void main(String[] args) {
        List<String> myList = new List<>();
        System.out.println(myList.contains("hello"));

        myList.add("hello");
        System.out.println(myList.contains("hello"));
    }
}
