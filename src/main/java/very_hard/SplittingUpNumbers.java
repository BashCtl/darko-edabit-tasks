package very_hard;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;

/*
Splitting Up Numbers


Create a function that takes a number num and returns each place value in the number.

Examples
numSplit(39) ➞ [30, 9]

numSplit(-434) ➞ [-400, -30, -4]

numSplit(100) ➞ [100, 0, 0]

numSplit(121317) ➞ [100000, 20000, 1000, 300, 10, 7]

 */

public class SplittingUpNumbers {

    public static int[] numSplit(int n) {
        String strNum = String.valueOf(n).replace("-", "");
        int l = strNum.length();
        return IntStream.range(0, l).map(i -> {
            int tempNum = (int) (Integer.parseInt(String.valueOf(strNum.charAt(i))) * Math.pow(10, l - i - 1));
            return n > 0 ? tempNum : -tempNum;
        }).toArray();
    }

    @Test
    public void test01() {
        assertArrayEquals(new int[]{30, 9}, numSplit(39));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[]{-400, -30, -4}, numSplit(-434));
    }

    @Test
    public void test03() {
        assertArrayEquals(new int[]{100, 0, 0}, numSplit(100));
    }

    @Test
    public void test04() {
        assertArrayEquals(new int[]{3000, 900, 20, 9}, numSplit(3929));
    }

    @Test
    public void test05() {
        assertArrayEquals(new int[]{10000, 0, 200, 90, 3}, numSplit(10293));
    }

    @Test
    public void test06() {
        assertArrayEquals(new int[]{900, 0, 0}, numSplit(900));
    }

    @Test
    public void test07() {
        assertArrayEquals(new int[]{-100, 0, 0}, numSplit(-100));
    }

    @Test
    public void test08() {
        assertArrayEquals(new int[]{10000, 2000, 300, 40, 5}, numSplit(12345));
    }

    @Test
    public void test09() {
        assertArrayEquals(new int[]{-90000, -8000, -700, -60, -5}, numSplit(-98765));
    }

    @Test
    public void test10() {
        assertArrayEquals(new int[]{40000, 3000, 200, 10, 0}, numSplit(43210));
    }

    @Test
    public void test11() {
        assertArrayEquals(new int[]{100000, 20000, 1000, 300, 10, 7}, numSplit(121317));
    }

}
