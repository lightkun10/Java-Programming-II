public class Program {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;

        System.out.println("There are " + numbers.length + " elements in the array.");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        String[] strings = new String[5];
    }
}
