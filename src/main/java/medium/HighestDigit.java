package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestDigit {

    public static int highestDigit(int n) {
        List<Integer> digits = new ArrayList<>();
        if (n == 0) {
            return n;
        }
        while (n > 0) {
            digits.add(n % 10);
            n = n / 10;
        }
        return Collections.max(digits);
    }

    public static void main(String[] args) {
        System.out.println(highestDigit(4666));
        System.out.println(highestDigit(544));
        System.out.println(highestDigit(379));
        System.out.println(highestDigit(2));
        System.out.println(highestDigit(377401));
    }
}
