package medium;

import java.util.Arrays;

public class NumberSplit {
    public static int[] numberSplit(int n) {
        return n > 0 ? new int[]{n / 2, n - n / 2} : new int[]{n - n / 2, n / 2,};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberSplit(25)));
        System.out.println(Arrays.toString(numberSplit(4)));
        System.out.println(Arrays.toString(numberSplit(10)));
        System.out.println(Arrays.toString(numberSplit(11)));
        System.out.println(Arrays.toString(numberSplit(-9)));
    }
}
