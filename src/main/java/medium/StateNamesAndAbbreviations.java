package medium;

import java.util.Arrays;

public class StateNamesAndAbbreviations {

    public static String[] filterStateNames(String[] arr, String type) {
        String[] full = Arrays.stream(arr)
                .filter(state -> state.length() > 2)
                .toArray(String[]::new);
        String[] abb = Arrays.stream(arr)
                .filter(state -> state.length() == 2)
                .toArray(String[]::new);
        return type.equals("abb") ? abb : full;
    }
}
