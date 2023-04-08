package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RecursionIntegerDigitsCount {

    public static int count(int n) {
        if (n < 10 && n > -10) {
            return 1;
        }
        return 1 + count(n / 10);
    }

    @Test
    public void test01() {
        assertEquals(4, count(4666));
    }

    @Test
    public void test02() {
        assertEquals(3, count(544));
    }

    @Test
    public void test03() {
        assertEquals(1, count(0));
    }

    @Test
    public void test04() {
        assertEquals(3, count(318));
    }

    @Test
    public void test05() {
        assertEquals(5, count(-92563));
    }

    @Test
    public void test06() {
        assertEquals(6, count(314890));
    }

    @Test
    public void test07() {
        assertEquals(6, count(654321));
    }

    @Test
    public void test08() {
        assertEquals(6, count(638476));
    }

    @Test
    public void test09() {
        assertEquals(5, count(12345));
    }

    @Test
    public void test10() {
        assertEquals(7, count(1289396));
    }

    @Test
    public void test11() {
        assertEquals(7, count(-1232323));
    }

    @Test
    public void test12() {
        assertEquals(8, count(12839393));
    }

    @Test
    public void test13() {
        assertEquals(9, count(-231273683));
    }

}
