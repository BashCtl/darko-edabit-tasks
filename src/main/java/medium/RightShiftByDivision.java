package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RightShiftByDivision {

    public static int shiftToRight(int x, int y) {
        return (int) Math.floor(x/ (Math.pow(2, y)));
    }

    @Test
    public void test01() {
        assertEquals(10, shiftToRight(80, 3));
    }

    @Test
    public void test02() {
        assertEquals(-6, shiftToRight(-24, 2));
    }

    @Test
    public void test03() {
        assertEquals(-3, shiftToRight(-5, 1));
    }

    @Test
    public void test04() {
        assertEquals(38, shiftToRight(38, 0));
    }

    @Test
    public void test05() {
        assertEquals(12, shiftToRight(192, 4));
    }

    @Test
    public void test06() {
        assertEquals(72, shiftToRight(4666, 6));
    }

    @Test
    public void test07() {
        assertEquals(59, shiftToRight(3777, 6));
    }

    @Test
    public void test08() {
        assertEquals(32, shiftToRight(1024, 5));
    }

    @Test
    public void test09() {
        assertEquals(-1, shiftToRight(-512, 10));
    }

}
