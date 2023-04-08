package medium;

import java.util.Arrays;

public class ReverseCase {

    public static String reverseCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                result.append(Character.toLowerCase(str.charAt(i)));
            } else {
                result.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseCase("Happy Birthday"));
    }
}
