package medium;

import java.util.Arrays;

public class CalculateMean {

    public static double mean(int[] nums) {
        double sum = Arrays.stream(nums).sum();
        double result = sum / nums.length;

        return Math.round(result * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println(mean(new int[]{2, 3, 2, 3}));
    }
}
