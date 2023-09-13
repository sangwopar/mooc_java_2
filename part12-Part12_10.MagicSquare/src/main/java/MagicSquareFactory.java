
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int y = 0;
        int x = size / 2;
        int value = 1;
        square.placeValue(x, y, value);
        while (value <= value * value) {
            int yy = y - 1;
            int xx = x + 1;
            if (yy < 0) {
                yy = size - 1;
            }
            if (xx > size - 1) {
                xx = 0;
            }
            value++;
            if (square.readValue(xx, yy) == 0) {
                square.placeValue(xx, yy, value);
            } else {
                yy = y + 1;
                xx = x;
                square.placeValue(xx, yy, value);
            }
            y = yy;
            x = xx;
        }
        // implement the creation of a magic square with the Siamese method algorithm
        // here
        return square;
    }

}
