package hard;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RecursionCountTheDigits {

    public static int digitsCount(long n) {
        if (n < 10 && n > -10) {
            return 1;
        }
        return 1 + digitsCount(n / 10);
    }

    @Test
    public void test01() {
        assertEquals(1, digitsCount(0));
    }

    @Test
    public void test02() {
        assertEquals(4, digitsCount(4666));
    }

    @Test
    public void test03() {
        assertEquals(3, digitsCount(544));
    }

    @Test
    public void test04() {
        assertEquals(6, digitsCount(121317));
    }

    @Test
    public void test05() {
        assertEquals(5, digitsCount(12345));
    }

    @Test
    public void test06() {
        assertEquals(13, digitsCount(1289396387328L));
    }

    @Test
    public void test07() {
        assertEquals(7, digitsCount(-1232323));
    }

    @Test
    public void test08() {
        assertEquals(16, digitsCount(3463463874638476L));
    }

    @Test
    public void test09() {
        assertEquals(9, digitsCount(-231200000));
    }

    @Test
    public void test10() {
        assertEquals(13, digitsCount(1283939312321L));
    }

    @Test
    public void test11() {
        assertEquals(9, digitsCount(-231273683));
    }

    @Test
    public void test12() {
        assertEquals(7, digitsCount(3200000));
    }

    @Test
    public void test13() {
        assertEquals(9, digitsCount(314890000));
    }


}
