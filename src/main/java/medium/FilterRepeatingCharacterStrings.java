package medium;

import java.util.Arrays;
import java.util.Collections;

public class FilterRepeatingCharacterStrings {

    public static String[] identicalFilter(String[] arr){
        return Arrays.stream(arr)
                .filter(x-> Collections.frequency(
                        Arrays.asList(x.split("")),x.substring(0,1))==x.length())
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(identicalFilter(new String[]{"aaaaaa", "bc", "d", "eeee", "xyz"})));
    }
}
