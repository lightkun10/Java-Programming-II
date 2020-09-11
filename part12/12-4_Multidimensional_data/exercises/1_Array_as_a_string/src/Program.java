public class Program {
    public static void main(String[] args) {
        int rows = 2;    // 2 is the total length
        int columns = 3; // 3 is the total length
        //int[][] matrix = new int[rows][columns];
        int[][] matrix = {
                {3, 2, 7, 6},
                {2, 4, 1, 0},
                {3, 2, 1, 0}
        };

        //matrix[0][1] = 5;
        //matrix[1][0] = 3;
        //matrix[1][2] = 7;

        System.out.println(3/2);

        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                string.append(array[i][j]);
            }
            // At the end of each row, append a new line
            string.append("\n");
        }

        return string.toString();
    }
}
