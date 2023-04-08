package medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalSplit {

    public static String capSpace(String txt) {
        return Arrays.stream(txt.split("(?=\\p{Upper})"))
                .map(String::toLowerCase)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(capSpace("helloWorld"));
    }
}
