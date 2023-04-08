package medium;

import java.util.Arrays;

public class FindTheMissingNumber {

    public static int missingNum(int[] nums) {
        return 55 - Arrays.stream(nums).sum();
    }
}
