package medium;

import java.util.stream.IntStream;

public class PerfectAmicable {

    public static String numType(int num) {

        int sumX = IntStream.range(1, num).filter(x -> num % x == 0).sum();
        int sumY = IntStream.range(1, sumX).filter(y -> sumX % y == 0).sum();
        return sumX == num ? "Perfect" : num == sumY ? "Amicable" : "Neither";
    }

    public static void main(String[] args) {
        System.out.println(numType(6));
        System.out.println(numType(2924));
        System.out.println(numType(5010));
    }

}
