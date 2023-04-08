package medium;

import java.util.Arrays;

public class NarcissisticNumbers {

    public static boolean isNarcissistic(int num) {
        String strNum = String.valueOf(num);
        return num == Arrays.stream(strNum.split(""))
                .mapToInt(n -> (int) Math.pow(Integer.valueOf(n), strNum.length()))
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(isNarcissistic(8208));
        System.out.println(isNarcissistic(22));
        System.out.println(isNarcissistic(9));
    }
}
