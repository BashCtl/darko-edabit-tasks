package medium;

import java.util.Arrays;
import java.util.regex.Pattern;

public class NumbersInStrings {

    public static String[] numInStr(String[] arr){
       return Arrays.stream(arr).filter(n-> Pattern.compile(".*\\d.*").matcher(n).matches())
                .toArray(String[]::new);
    }
}
