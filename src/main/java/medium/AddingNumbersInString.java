package medium;

import java.util.Arrays;

public class AddingNumbersInString {

    public static int addNums(String nums) {
        String[] numbers = nums.split(", ");
        return Arrays.stream(numbers).mapToInt(Integer::parseInt)
                .sum();
    }
}
