package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LittleBigSequence {

    public static int littleBig(int n) {
        int result = n % 2 == 0 ? 50 : 5;
        for (int i = 1; i <= n/2; i++) {
            if ( n % 2 == 0) {
                result *= 2;
            } else {
                result++;
            }
        }
        return result;
    }

    @Test
    public void test01() {
        assertEquals(5, littleBig(1));
    }

    @Test
    public void test02() {
        assertEquals(100, littleBig(2));
    }

    @Test
    public void test03() {
        assertEquals(6, littleBig(3));
    }

    @Test
    public void test04() {
        assertEquals(200, littleBig(4));
    }

    @Test
    public void test05() {
        assertEquals(7, littleBig(5));
    }

    @Test
    public void test06() {
        assertEquals(400, littleBig(6));
    }

    @Test
    public void test07() {
        assertEquals(8, littleBig(7));
    }

    @Test
    public void test08() {
        assertEquals(800, littleBig(8));
    }

    @Test
    public void test09() {
        assertEquals(9, littleBig(9));
    }

    @Test
    public void test10() {
        assertEquals(1600, littleBig(10));
    }

    @Test
    public void test11() {
        assertEquals(10, littleBig(11));
    }

    @Test
    public void test12() {
        assertEquals(3200, littleBig(12));
    }

    @Test
    public void test13() {
        assertEquals(11, littleBig(13));
    }

    @Test
    public void test14() {
        assertEquals(6400, littleBig(14));
    }

    @Test
    public void test15() {
        assertEquals(12, littleBig(15));
    }

    @Test
    public void test16() {
        assertEquals(12800, littleBig(16));
    }

    @Test
    public void test17() {
        assertEquals(13, littleBig(17));
    }

    @Test
    public void test18() {
        assertEquals(25600, littleBig(18));
    }

    @Test
    public void test19() {
        assertEquals(14, littleBig(19));
    }

    @Test
    public void test20() {
        assertEquals(51200, littleBig(20));
    }

    @Test
    public void test21() {
        assertEquals(15, littleBig(21));
    }

    @Test
    public void test22() {
        assertEquals(102400, littleBig(22));
    }

    @Test
    public void test23() {
        assertEquals(16, littleBig(23));
    }

    @Test
    public void test24() {
        assertEquals(204800, littleBig(24));
    }

    @Test
    public void test25() {
        assertEquals(17, littleBig(25));
    }

    @Test
    public void test26() {
        assertEquals(409600, littleBig(26));
    }

    @Test
    public void test27() {
        assertEquals(18, littleBig(27));
    }

    @Test
    public void test28() {
        assertEquals(819200, littleBig(28));
    }

    @Test
    public void test29() {
        assertEquals(19, littleBig(29));
    }

    @Test
    public void test30() {
        assertEquals(1638400, littleBig(30));
    }
}
