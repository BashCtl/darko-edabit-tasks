package medium;

public class EmptySquareSequence {
    public static int emptySq(int step) {

        int diagonals = step * 4;

        return 4 * step * step -  diagonals;
    }

    public static void main(String[] args) {
        System.out.println(emptySq(3));
//        System.out.println(emptySq(10));
//        System.out.println(emptySq(0));
    }
}
