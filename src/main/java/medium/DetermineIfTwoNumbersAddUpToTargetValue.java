package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DetermineIfTwoNumbersAddUpToTargetValue {

    public static boolean sumOfTwo(int[] a, int[] b, int v) {
        for (int x : a) {
            for (int y : b) {
                if (x + y == v)
                    return true;
            }
        }
        return false;
    }

    @Test
    public void test1() {
        assertEquals(sumOfTwo(new int[] {1, 2, 3}, new int[] {10, 20, 30, 40, 50}, 42), true);
    }

    @Test
    public void test2() {
        assertEquals(sumOfTwo(new int[] {1, 2, 3}, new int[] {10, 20, 30, 40, 50}, 44), false);
    }

    @Test
    public void test3() {
        assertEquals(sumOfTwo(new int[] {1, 2, 3}, new int[] {10, 20, 30, 40, 50}, 11), true);
    }

    @Test
    public void test4() {
        assertEquals(sumOfTwo(new int[] {1, 2, 3}, new int[] {10, 20, 30, 40, 50}, 60), false);
    }

    @Test
    public void test5() {
        assertEquals(sumOfTwo(new int[] {1, 2, 3}, new int[] {10, 20, 30, 40, 50}, 53), true);
    }

    @Test
    public void test6() {
        assertEquals(sumOfTwo(new int[] {1, 2, 3}, new int[] {10, 20, 30, 40, 50}, 4), false);
    }

    @Test
    public void test7() {
        assertEquals(sumOfTwo(new int[] {1, 2}, new int[] {4, 5, 6}, 5), true);
    }

    @Test
    public void test8() {
        assertEquals(sumOfTwo(new int[] {1, 2}, new int[] {4, 5, 6}, 8), true);
    }

    @Test
    public void test9() {
        assertEquals(sumOfTwo(new int[] {1, 2}, new int[] {4, 5, 6}, 3), false);
    }

    @Test
    public void test10() {
        assertEquals(sumOfTwo(new int[] {1, 2}, new int[] {4, 5, 6}, 9), false);
    }

}
