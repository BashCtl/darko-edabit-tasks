package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MoranNumbers {

    public static String moran(int n) {
        int numSum = digitSum(n);
        int division = n / numSum;
        int remainder = n % numSum;
        if (isPrime(division) && remainder == 0) {
            return "M";
        } else if (!isPrime(division) && remainder == 0) {
            return "H";
        }
        return "Neither";
    }

    public static int digitSum(int x) {
        if (x == 0) {
            return x;
        }
        return x % 10 + digitSum(x / 10);
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test1() {
        assertEquals("H", moran(132));
    }

    @Test
    public void test2() {
        assertEquals("M", moran(133));
    }

    @Test
    public void test3() {
        assertEquals("Neither", moran(134));
    }

    @Test
    public void test4() {
        assertEquals("M", moran(3033));
    }

    @Test
    public void test5() {
        assertEquals("H", moran(3030));
    }

    @Test
    public void test6() {
        assertEquals("Neither", moran(491423));
    }

    @Test
    public void test7() {
        assertEquals("M", moran(20937));
    }
}
