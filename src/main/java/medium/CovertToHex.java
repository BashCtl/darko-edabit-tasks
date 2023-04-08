package medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CovertToHex {

    public static String toHex(String str){
        return Arrays.stream(str.split("")).map(l->Integer.toHexString(l.charAt(0)))
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(toHex("hello world"));
    }
}
