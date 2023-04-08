package medium;

import java.util.Arrays;

public class PurgeOrganize {

    public static int[] uniqueSort(int[] nums){
       return Arrays.stream(nums).sorted().distinct().toArray();
    }
}
