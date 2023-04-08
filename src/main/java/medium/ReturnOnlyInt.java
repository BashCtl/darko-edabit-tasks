package medium;

import java.util.Arrays;

public class ReturnOnlyInt {

    public static int[] returnInts(Object[] arr) {
        return Arrays.stream(arr).filter(x -> x instanceof Integer)
                .mapToInt(x -> (int) x)
                .toArray();
    }

}
