package hard;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ShinySemiprimesBrilliantNumbers {

    public static boolean isBrilliant(int n) {
        if (isPrime(n)) {
            return false;
        }
        for (int i = 2; i < n/2; i++) {
            int quotient = n / i;
            if (isPrime(i) && isPrime(quotient) && i * quotient == n
                    && String.valueOf(i).length() == String.valueOf(quotient).length()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test1() {
        assertEquals(false, isBrilliant(11));
    }

    @Test
    public void test2() {
        assertEquals(true, isBrilliant(9));
    }

    @Test
    public void test3() {
        assertEquals(true, isBrilliant(21));
    }

    @Test
    public void test4() {
        assertEquals(false, isBrilliant(22));
    }

    @Test
    public void test5() {
        assertEquals(false, isBrilliant(1001));
    }

    @Test
    public void test6() {
        assertEquals(false, isBrilliant(77));
    }

    @Test
    public void test7() {
        assertEquals(true, isBrilliant(209));
    }

    @Test
    public void test8() {
        assertEquals(false, isBrilliant(211));
    }

    @Test
    public void test9() {
        assertEquals(false, isBrilliant(780));
    }

    @Test
    public void test10() {
        assertEquals(true, isBrilliant(703));
    }

    @Test
    public void test11() {
        assertEquals(false, isBrilliant(1000));
    }

    @Test
    public void test12() {
        assertEquals(true, isBrilliant(1003));
    }

    @Test
    public void test13() {
        assertEquals(false, isBrilliant(1008));
    }

    @Test
    public void test14() {
        assertEquals(true, isBrilliant(16459));
    }

    @Test
    public void test15() {
        assertEquals(false, isBrilliant(348166));
    }

    @Test
    public void test16() {
        assertEquals(true, isBrilliant(768017));
    }

}
