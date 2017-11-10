package bitmanipulation;

public class MyBitManipulation {

    public static int setBit(int x, int position) {
        int mask = 1 << position;
        return x | mask;
    }

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
}
