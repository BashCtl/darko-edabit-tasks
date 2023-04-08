package medium;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FactorizeNumber {

    public static int[] factorize(int num) {
        return IntStream.rangeClosed(1,num).filter(n->num%n==0).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(factorize(12)));
    }

}
