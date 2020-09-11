package submission;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int sum = 0;

        fromWhere = Math.max(fromWhere, 0);
        toWhere = Math.min(toWhere, array.length);
        // fromWhere = fromWhere < 0 ? 0 : fromWhere;
        // toWhere = toWhere > array.length ? array.length : toWhere;

        while (fromWhere < toWhere) {
            if (array[fromWhere] <= largest && array[fromWhere] >= smallest) {
                sum += array[fromWhere];
            }

            fromWhere++;
        }

        return sum;
    }
}
