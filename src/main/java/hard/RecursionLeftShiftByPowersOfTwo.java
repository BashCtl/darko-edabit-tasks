package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RecursionLeftShiftByPowersOfTwo {

    public static int shiftToLeft(int x, int y) {
        return y==0? x:2 * shiftToLeft(x, --y);
    }

//    public static void main(String[] args) {
//        System.out.println(shiftToLeft(5, 2));
//        System.out.println(shiftToLeft(10, 3));
//    }

    @Test
    public void test01() {
        assertEquals(20, shiftToLeft(5, 2));
    }

    @Test
    public void test02() {
        assertEquals(80, shiftToLeft(10, 3));
    }

    @Test
    public void test03() {
        assertEquals(-128, shiftToLeft(-32, 2));
    }

    @Test
    public void test04() {
        assertEquals(-192, shiftToLeft(-6, 5));
    }

    @Test
    public void test05() {
        assertEquals(192, shiftToLeft(12, 4));
    }

    @Test
    public void test06() {
        assertEquals(2944, shiftToLeft(46, 6));
    }

    @Test
    public void test07() {
        assertEquals(57, shiftToLeft(57, 0));
    }

    @Test
    public void test08() {
        assertEquals(158, shiftToLeft(79, 1));
    }
}
