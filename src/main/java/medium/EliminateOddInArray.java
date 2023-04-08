package medium;

import java.util.Arrays;

public class EliminateOddInArray {

    public static int[] noOdds(int[] nums){
        return Arrays.stream(nums).filter(n->n%2==0).toArray();
    }
}
