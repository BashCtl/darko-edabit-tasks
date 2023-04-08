package medium;

import java.util.Arrays;

public class ReturnTheSumOfTheTwoSmallestNum {

    public static int sumTwoSmallestNums(int[] arr) {
        int[] ints = Arrays.stream(arr).filter(n -> n > 0).sorted().toArray();
        return ints[0] + ints[1];
    }

    public static void main(String[] args) {
        System.out.println(sumTwoSmallestNums(new int[]{879, 953, 694, -847, 342, 221, -91, -723, 791, -587}));
    }
}
