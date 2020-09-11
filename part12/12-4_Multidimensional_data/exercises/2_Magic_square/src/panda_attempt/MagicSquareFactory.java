package panda_attempt;

public class MagicSquareFactory {
    public MagicSquare createMagicSquare(int size) {
        // Start with an empty n x n square, where n is odd.
        if (size % 2 == 0 && size < 0) {
            return null;
        }

        MagicSquare square = new MagicSquare(size);

        /* Implementing Siamese method algorithm for the creation of a magic square */
        /* RECOMMENDED to just read the model solution,
           as I screw up the x and y definition here.
           X = y;
           Y = x;
        */
        int n = size * size;
        int x = 0;
        int y = size / 2;
        int num = 1;

        // Start of the sequence, ONE
        square.placeValue(x, y, num);
        num++;

        for (int num2 = num; num2 <= n; num2++) {
            // Basic pattern, moving position of x and y
            x = x - 1;
            y = y + 1;

            // case: if, while moving, x is less than 0
            if (x < 0) {
                // case: ...and y is cross the edge (> size - 1)
                if (y >= size) {
                    x += 2; y--;
                } else {
                    x = size - 1;
                }
                square.placeValue(x, y, num2);
            }

            // case: if, while moving, y is more than size
            // y back to 0
            else if (y >= size) {
                y = 0;
                square.placeValue(x, y, num2);
            }

            // case: If, while moving, position is not free
            // move "down"
            else if (square.readValue(x, y) > 0) {
                x = x + 2; y = y - 1;
                square.placeValue(x, y, num2);
            }

            // if no cases above happens
            // Place the number according to the moving position,
            else {
                square.placeValue(x, y, num2);
            }
        }

        return square;
    }
}