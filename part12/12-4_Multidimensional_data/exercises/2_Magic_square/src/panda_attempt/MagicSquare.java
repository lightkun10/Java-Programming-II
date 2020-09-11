package panda_attempt;

import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    /* TODO: RECOMMENDED to just read the model solution,
           as I screw up the x and y definition here.
           X = y;
           Y = x;
    */

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList columns = new ArrayList<>();
        for (int i = 0; i < this.square.length; i++) {
            int sumCol = 0;

            for (int j = 0; j < this.square[i].length; j++) {
                sumCol += this.square[i][j];
            }

            columns.add(sumCol);
        }

        return columns;
    }

    public ArrayList<Integer> sumsOfRows() {
        ArrayList rows = new ArrayList<>();
        for (int i = 0; i < this.square.length; i++) {
            int sumRow = 0;

            for (int j = 0; j < this.square.length; j++) {
                sumRow += this.square[j][i];
            }
            rows.add(sumRow);
        }

        return rows;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList diagonals = new ArrayList<>();

        int i2 = 0;
        int j2 = 0;
        int d = 0;
        while (i2 < this.square.length) {
            d += this.square[i2][j2];
            i2++;
            j2++;
        }

        diagonals.add(d);

        d = 0;
        j2--;
        i2 = 0;
        while (i2 < this.square.length) {
            d += this.square[i2][j2];
            j2--;
            i2++;
        }

        diagonals.add(d);

        return diagonals;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[x][y];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[x][y] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}