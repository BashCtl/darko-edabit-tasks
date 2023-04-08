package medium;

import java.util.Arrays;

public class InstantJazz {

    public static String[] jazzify(String[] arr) {
        return Arrays.stream(arr).map(chord -> {
            if (chord.charAt(chord.length() - 1) != '7') {
                return chord + 7;
            }
            return chord;
        }).toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(jazzify(new String[]{"G","F","C"})));
        System.out.println(Arrays.toString(jazzify(new String[]{"G","F","C","F7"})));
        System.out.println(Arrays.toString(jazzify(new String[]{})));
    }
}
