package medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CovertStringToCamelCase {
    public static String toCamelCase(String str) {
        String[] split = str.split("[-_]");
        return Arrays.stream(split)
                .map(word -> {
                    if (word.equals(split[0])) {
                        return word;
                    }
                    return word.substring(0, 1).toUpperCase()
                            + word.substring(1);
                })
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("A-B-C"));
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }
}
