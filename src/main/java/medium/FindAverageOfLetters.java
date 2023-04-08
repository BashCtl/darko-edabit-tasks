package medium;

import java.util.Arrays;

public class FindAverageOfLetters {

    public static double averageIndex(String[] arr) {
        double sum = Arrays.stream(arr)
                .mapToInt(x -> x.charAt(0) - 96)
                .sum();
        return Math.round((sum / arr.length) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println(averageIndex(new String[]{"f", "o", "r", "t", "h", "e", "l", "o", "v", "e", "o", "f", "t", "e", "s", "h"}));
    }

}
