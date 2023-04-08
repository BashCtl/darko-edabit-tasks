package medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighestLowestNumbers {

    public static String highLow(String s) {
        List<Integer> digits = Arrays.stream(s.split(" ")).map(n -> Integer.valueOf(n))
                .collect(Collectors.toList());
        return Collections.max(digits) + " " + Collections.min(digits);
    }
}
