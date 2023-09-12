package hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursionHalveAndHalveAgain {

    public static int halveCount(double a, int b) {
        a /=2;
        if (a <= b) {
            return 0;
        }
        return 1 + halveCount(a , b);
    }

    @Test
    public void test01() {
        assertEquals(3, halveCount(4666, 544));
    }

    @Test
    public void test02() {
        assertEquals(3, halveCount(466, 54));
    }

    @Test
    public void test03() {
        assertEquals(1, halveCount(8, 2));
    }

    @Test
    public void test04() {
        assertEquals(8, halveCount(1891, 4));
    }

    @Test
    public void test05() {
        assertEquals(6, halveCount(1756, 14));
    }

    @Test
    public void test06() {
        assertEquals(11, halveCount(7764, 2));
    }

    @Test
    public void test07() {
        assertEquals(4, halveCount(1118, 47));
    }

    @Test
    public void test08() {
        assertEquals(1, halveCount(161, 79));
    }

    @Test
    public void test09() {
        assertEquals(7, halveCount(8573, 35));
    }

    @Test
    public void test10() {
        assertEquals(12, halveCount(4123, 1));
    }

    @Test
    public void test11() {
        assertEquals(4, halveCount(1348, 60));
    }

    @Test
    public void test12() {
        assertEquals(7, halveCount(7549, 31));
    }

    @Test
    public void test13() {
        assertEquals(9, halveCount(4469, 5));
    }

    @Test
    public void test14() {
        assertEquals(3, halveCount(1123, 98));
    }

    @Test
    public void test15() {
        assertEquals(6, halveCount(8197, 85));
    }

    @Test
    public void test16() {
        assertEquals(4, halveCount(1199, 56));
    }

    @Test
    public void test17() {
        assertEquals(11, halveCount(8845, 4));
    }

    @Test
    public void test18() {
        assertEquals(3, halveCount(606, 67));
    }

    @Test
    public void test19() {
        assertEquals(9, halveCount(3375, 6));
    }

    @Test
    public void test20() {
        assertEquals(9, halveCount(7085, 10));
    }

    @Test
    public void test21() {
        assertEquals(5, halveCount(299, 5));
    }

    @Test
    public void test22() {
        assertEquals(3, halveCount(1208, 82));
    }

    @Test
    public void test23() {
        assertEquals(5, halveCount(3635, 73));
    }

    @Test
    public void test24() {
        assertEquals(9, halveCount(2382, 3));
    }

    @Test
    public void test25() {
        assertEquals(1, halveCount(320, 80));
    }
    

}
