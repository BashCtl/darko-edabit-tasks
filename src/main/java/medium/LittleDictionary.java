package medium;

import java.util.Arrays;

public class LittleDictionary {

    public static String[] dictionary(String s, String[] w) {
        return Arrays.stream(w)
                .filter(word -> word.startsWith(s))
                .toArray(String[]::new);
    }

}
