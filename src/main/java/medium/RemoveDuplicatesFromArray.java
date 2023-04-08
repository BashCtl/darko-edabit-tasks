package medium;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static int[] removeDups(int[] nums) {
        return Arrays.stream(nums).distinct().toArray();
    }

    public static String[] removeDups(String[] str) {
    return Arrays.stream(str).distinct().toArray(String[]::new);
    }

}
