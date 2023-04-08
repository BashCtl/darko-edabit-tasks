package medium;

import java.util.Arrays;

public class PositiveCountNegativeSum {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null) {
            return new int[]{};
        }
        int positive = (int) Arrays.stream(input).filter(n -> n > 0).count();
        int sum = Arrays.stream(input).filter(n -> n <= 0).sum();
        return input.length == 0 ? new int[]{} : new int[]{positive, sum};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{91, -4, 80, -73, -28})));
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{})));
        System.out.println(Arrays.toString(countPositivesSumNegatives(null)));
    }
}
