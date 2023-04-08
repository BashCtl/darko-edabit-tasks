package medium;

import java.util.Arrays;

public class PandigitalNumbers {

    public static boolean isPandigital(long num){
       return Arrays.stream(String.valueOf(num).split(""))
                .distinct().count() == 10;

    }


}
