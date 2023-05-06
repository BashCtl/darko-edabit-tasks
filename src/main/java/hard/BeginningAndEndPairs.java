package hard;

import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class BeginningAndEndPairs {

    public static int[][] pairs(int[] arr) {
        int arrLength = arr.length;
        int resultLength = arrLength % 2 == 0 ? arrLength / 2 : (arrLength / 2) + 1;
        int[][] result = new int[resultLength][2];
        for (int i = 0; i < resultLength; i++) {
            if (arrLength % 2 != 0 && i == resultLength - 1) {
                result[i] = new int[]{arr[i], arr[i]};
            } else {
                result[i] = new int[]{arr[i], arr[arrLength - 1 - i]};
            }
        }
        return result;
    }

    @Test
    public void test01() {
        assertArrayEquals(new int[][]{{1, 2}, {1, 3}, {1, 2}, {1, 7}}, pairs(new int[]{1, 1, 1, 1, 7, 2, 3, 2}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[][]{{5, 4}, {4, 6}, {4, 6}, {6, 6}}, pairs(new int[]{5, 4, 4, 6, 6, 6, 4}));
    }

    @Test
    public void test03() {
        assertArrayEquals(new int[][]{{1, 7}, {2, 6}, {3, 5}, {4, 4}}, pairs(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

    @Test
    public void test04() {
        assertArrayEquals(new int[][]{{1, 6}, {2, 5}, {3, 4}}, pairs(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void test05() {
        assertArrayEquals(new int[][]{{5, 2}, {9, 1}, {8, 8}}, pairs(new int[]{5, 9, 8, 1, 2}));
    }

    @Test
    public void test06() {
        assertArrayEquals(new int[][]{{5, 7}, {6, 6}}, pairs(new int[]{5, 6, 7}));
    }

    @Test
    public void test07() {
        assertArrayEquals(new int[][]{{1, 5}, {1, 5}, {4, 4}}, pairs(new int[]{1, 1, 4, 4, 5, 5}));
    }

    @Test
    public void test08() {
        assertArrayEquals(new int[][]{{9, 9}, {9, 3}, {9, 3}, {9, 9}}, pairs(new int[]{9, 9, 9, 9, 3, 3, 9}));
    }

    @Test
    public void test09() {
        assertArrayEquals(new int[][]{{5, 6}}, pairs(new int[]{5, 6}));
    }

    @Test
    public void test10() {
        assertArrayEquals(new int[][]{{5, 5}}, pairs(new int[]{5}));
    }

    @Test
    public void test11() {
        assertArrayEquals(new int[][]{}, pairs(new int[]{}));
    }

    @Test
    public void test12() {
        assertArrayEquals(new int[][]{{1, 6}, {9, 7}, {8, 8}}, pairs(new int[]{1, 9, 8, 7, 6}));
    }

    @Test
    public void test13() {
        assertArrayEquals(new int[][]{{5, 3}, {2, 1}, {4, 9}}, pairs(new int[]{5, 2, 4, 9, 1, 3}));
    }

    @Test
    public void test14() {
        assertArrayEquals(new int[][]{{9, 1}, {5, 7}, {6, 8}}, pairs(new int[]{9, 5, 6, 8, 7, 1}));
    }

}
