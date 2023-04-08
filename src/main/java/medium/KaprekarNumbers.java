package medium;

import org.testng.annotations.Test;

import java.math.BigInteger;

import static org.testng.Assert.assertEquals;

public class KaprekarNumbers {

    public static boolean isKaprekar(int n) {
        BigInteger number = new BigInteger(String.valueOf(n));
        String strNum = number.pow(2).toString();
        int length = strNum.length();
        int sum;

        if (length <= 1) {
            sum = Integer.parseInt(strNum);
        } else if (length % 2 != 0) {
            String left = strNum.substring(0, (int) Math.floor(length / 2));
            String right = strNum.substring((int) Math.ceil(length / 2));
            sum = Integer.parseInt(left) + Integer.parseInt(right);
        } else {
            String left = strNum.substring(0, length / 2);
            String right = strNum.substring(length / 2);
            sum = Integer.parseInt(left) + Integer.parseInt(right);
        }
        return sum == n;
    }

    @Test
    public void test1() {
        assertEquals(true, isKaprekar(1));
    }

    @Test
    public void test2() {
        assertEquals(false, isKaprekar(2));
    }

    @Test
    public void test3() {
        assertEquals(false, isKaprekar(3));
    }

    @Test
    public void test4() {
        assertEquals(false, isKaprekar(5));
    }

    @Test
    public void test5() {
        assertEquals(true, isKaprekar(9));
    }

    @Test
    public void test6() {
        assertEquals(false, isKaprekar(65));
    }

    @Test
    public void test7() {
        assertEquals(true, isKaprekar(99));
    }

    @Test
    public void test8() {
        assertEquals(true, isKaprekar(297));
    }

    @Test
    public void test9() {
        assertEquals(false, isKaprekar(348));
    }

    @Test
    public void test10() {
        assertEquals(false, isKaprekar(666));
    }

    @Test
    public void test11() {
        assertEquals(false, isKaprekar(1441));
    }

    @Test
    public void test12() {
        assertEquals(true, isKaprekar(77778));
    }

    @Test
    public void test13() {
        assertEquals(false, isKaprekar(102102));
    }

    @Test
    public void test14() {
        assertEquals(true, isKaprekar(533170));
    }

}
