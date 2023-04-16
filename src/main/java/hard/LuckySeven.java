package hard;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class LuckySeven {

    public static boolean luckySeven(int[] r) {
        Arrays.sort(r);
        for (int i = 0; i < r.length; i++) {
            for (int j = i + 1; j < r.length; j++) {
                for (int k = j + 1; k < r.length; k++) {
                    if (r[i] + r[j] + r[k] == 7) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Test
    public void test01() {
        assertEquals(true, luckySeven(new int[] {2, 4, 3, 8, 9, 1}));
    }

    @Test
    public void test02() {
        assertEquals(true, luckySeven(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    public void test03() {
        assertEquals(true, luckySeven(new int[] {1, 10, 8, -3, -3, -2, 9}));
    }

    @Test
    public void test04() {
        assertEquals(true, luckySeven(new int[] {-5, 7, -3, -5, 9, 3, 5}));
    }

    @Test
    public void test05() {
        assertEquals(true, luckySeven(new int[] {10, 3, 2, 9, 2, -4, -8, 8}));
    }

    @Test
    public void test06() {
        assertEquals(true, luckySeven(new int[] {-6, -1, 6, 6, -1, 0, -5, -2, 7}));
    }

    @Test
    public void test07() {
        assertEquals(true, luckySeven(new int[] {-9, 7, 6, -5, 10, 3, -8, 8, -6, 0}));
    }

    @Test
    public void test08() {
        assertEquals(true, luckySeven(new int[] {6, -6, 4, 5, -4, 8, 6, 2}));
    }

    @Test
    public void test09() {
        assertEquals(true, luckySeven(new int[] {-2, -5, -7, 4, -7, 9, -6, -6}));
    }

    @Test
    public void test10() {
        assertEquals(true, luckySeven(new int[] {5, -5, -7, -10, -1, 3, 7, 0, -2, -7}));
    }

    @Test
    public void test11() {
        assertEquals(false, luckySeven(new int[] {7, 7}));
    }

    @Test
    public void test12() {
        assertEquals(false, luckySeven(new int[] {-2, 4, 7, -3, -5, 7, -1}));
    }

    @Test
    public void test13() {
        assertEquals(false, luckySeven(new int[] {5, 2, -6, 6, -5, -5, 5, -10}));
    }

    @Test
    public void test14() {
        assertEquals(false, luckySeven(new int[] {1}));
    }

    @Test
    public void test15() {
        assertEquals(false, luckySeven(new int[] {2, 3}));
    }

    @Test
    public void test16() {
        assertEquals(false, luckySeven(new int[] {}));
    }

    @Test
    public void test17() {
        assertEquals(false, luckySeven(new int[] {1, -8}));
    }

    @Test
    public void test18() {
        assertEquals(false, luckySeven(new int[] {3, 8, 0, -5}));
    }

    @Test
    public void test19() {
        assertEquals(false, luckySeven(new int[] {-7, -3, 0, -4, 0, -6, -1, -5, 2, -3}));
    }

    @Test
    public void test20() {
        assertEquals(false, luckySeven(new int[] {-9, 0, 8, -6}));
    }

    @Test
    public void test21() {
        assertEquals(false, luckySeven(new int[] {0, 0, 0, 2, 3}));
    }

    @Test
    public void test22() {
        assertEquals(false, luckySeven(new int[] {-5, -4, 6, 8, 9, 8, 8}));
    }

}
