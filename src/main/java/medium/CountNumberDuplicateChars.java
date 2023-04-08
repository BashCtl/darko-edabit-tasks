package medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountNumberDuplicateChars {
    public static int duplicates(String str) {
        List<String> chars = Arrays.stream(str.split("")).collect(Collectors.toList());
        return chars.stream().distinct()
                .map(x -> Collections.frequency(chars, x))
                .filter(n -> n >= 2)
                .map(n -> --n)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(duplicates("Hello World!"));
        System.out.println(duplicates("foobar"));
        System.out.println(duplicates("birthday"));
    }
}
