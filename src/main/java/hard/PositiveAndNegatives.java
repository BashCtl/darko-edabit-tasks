package hard;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class PositiveAndNegatives {

    public static boolean alternateSign(int[] arr) {
        if (Arrays.stream(arr).anyMatch(x -> x == 0)) {
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] > 0 && arr[i + 1] > 0) || (arr[i] < 0 && arr[i + 1] < 0)) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test1() {
        assertEquals(true, alternateSign(new int[]{3, -2, 5, -5, 2, -8}));
    }

    @Test
    public void test2() {
        assertEquals(true, alternateSign(new int[]{-6, 1, -1, 4, -3}));
    }

    @Test
    public void test3() {
        assertEquals(false, alternateSign(new int[]{4, 4, -2, 3, -6, 10}));
    }

    @Test
    public void test4() {
        assertEquals(false, alternateSign(new int[]{34, 49, 33, 17, -47}));
    }

    @Test
    public void test5() {
        assertEquals(true, alternateSign(new int[]{22}));
    }

    @Test
    public void test6() {
        assertEquals(false, alternateSign(new int[]{41, 11, 37, -30, -29, 39, -45, 15, -41, 7}));
    }

    @Test
    public void test7() {
        assertEquals(false, alternateSign(new int[]{3, -7, 15, 18}));
    }

    @Test
    public void test8() {
        assertEquals(true, alternateSign(new int[]{40}));
    }

    @Test
    public void test9() {
        assertEquals(false, alternateSign(new int[]{40, 27, -44, -13, -31}));
    }

    @Test
    public void test10() {
        assertEquals(false, alternateSign(new int[]{40, 50, -7, 45, -7}));
    }

    @Test
    public void test11() {
        assertEquals(false, alternateSign(new int[]{-23, -16, -9, -15, 16}));
    }

    @Test
    public void test12() {
        assertEquals(false, alternateSign(new int[]{0, 0, 0, 0}));
    }

    @Test
    public void test13() {
        assertEquals(false, alternateSign(new int[]{50, 28, -5, 25, -14, -2, 20, 26, -32}));
    }

    @Test
    public void test14() {
        assertEquals(true, alternateSign(new int[]{24, -10}));
    }

    @Test
    public void test15() {
        assertEquals(false, alternateSign(new int[]{-2, 4, 16, -15, 24, 2}));
    }

    @Test
    public void test16() {
        assertEquals(false, alternateSign(new int[]{19, -12, -37, 44, -43, 44, 47}));
    }

    @Test
    public void test17() {
        assertEquals(false, alternateSign(new int[]{-21, 42, -11, 27, -16, 36, 37}));
    }

    @Test
    public void test18() {
        assertEquals(true, alternateSign(new int[]{30}));
    }

    @Test
    public void test19() {
        assertEquals(true, alternateSign(new int[]{3, -7, 15, -18}));
    }

    @Test
    public void test20() {
        assertEquals(true, alternateSign(new int[]{9, -4, 8, -16}));
    }

    @Test
    public void test21() {
        assertEquals(false, alternateSign(new int[]{3, -7, 15, -18, 0}));
    }

    @Test
    public void test22() {
        assertEquals(false, alternateSign(new int[]{0}));
    }

    @Test
    public void test23() {
        assertEquals(false, alternateSign(new int[]{0, 2, -5, 8, -12}));
    }

}
