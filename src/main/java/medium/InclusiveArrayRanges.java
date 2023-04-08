package medium;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InclusiveArrayRanges {

    public static int[] inclusiveArray(int startNum, int endNum) {
        return startNum < endNum ? IntStream.range(startNum, ++endNum).toArray()
                : new int[]{startNum};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(inclusiveArray(1, 5)));
    }
}
