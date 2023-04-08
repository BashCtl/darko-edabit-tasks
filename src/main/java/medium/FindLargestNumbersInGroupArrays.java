package medium;

import java.util.Arrays;

public class FindLargestNumbersInGroupArrays {

    public static double[] findLargestNums(double[][] arr) {
        return Arrays.stream(arr)
                .mapToDouble(a -> Arrays.stream(a).max().getAsDouble())
                .toArray();
    }
}
