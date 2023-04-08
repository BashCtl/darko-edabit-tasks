package medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeLastLetter {

    public static String capLast(String str) {
        return Arrays.stream(str.split(" "))
                .map(word -> word.substring(0, word.length() - 1)
                        + word.substring(word.length() - 1).toUpperCase())
                .collect(Collectors.joining(" "));

    }

    public static void main(String[] args) {
        System.out.println(capLast("hello"));
        System.out.println(capLast("My Name Is Edabit"));
    }

}
