package bitmanipulation;

public class MyBitManipulation {

    /**
     * Sets bit into binary number at the particular position.
     *
     * @param x        binary number to change.
     * @param position to set a bit.
     * @return binary number with bit set.
     */
    public static int setBit(int x, int position) {
        int mask = 1 << position;
        return x | mask;
    }

    /**
     * Clears bit in binary number at the particular position.
     *
     * @param x        binary number to change.
     * @param position to clear a bit.
     * @return binary number with bit cleared.
     */
    public static int clearBit(int x, int position) {
        int mask = 1 << position;
        return x & ~mask;
    }

    public static int flipBit(int x, int position) {
        int mask = 1 << position;
        return x ^ mask;
    }

    public static boolean isBitSet(int x, int position) {
        int mask = 1 << position;
        return (x & mask) == mask;
    }

    public static boolean isNumberEven(int x) {
        return (x & 1) != 1;
    }

    public static boolean isPowerOfTwo(int x) {
        return (x & x - 1) == 0;
    }

    public static int countDiffBits(int x, int y) {
        int tmpNumb = x ^ y;
        int count = 0;
        while (tmpNumb > 0) {
            if ((tmpNumb & 1) == 1) {
                count++;
            }
            tmpNumb = tmpNumb >> 1;
        }
        return count;
    }
}
