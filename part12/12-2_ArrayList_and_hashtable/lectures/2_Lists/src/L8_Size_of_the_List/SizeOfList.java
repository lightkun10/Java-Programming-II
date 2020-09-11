package L8_Size_of_the_List;

public class SizeOfList {
    public static void main(String[] args) {
        List<String> myList = new List<>();
        myList.add("hello");
        myList.add("world");

        /* Now we can use a for-loop to go through the elements of the list. */
        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.value(i));
        }
    }
}
