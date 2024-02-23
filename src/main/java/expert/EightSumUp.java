package expert;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/*
Eight Sums Up

Create a function that gets every pair of numbers from an array that sums up to eight and returns it as an array of pairs (sorted ascendingly). See the following examples for more details.

Examples
sumsUp({1, 2, 3, 4, 5}) ➞ {{3, 5}}

sumsUp({1, 2, 3, 7, 9}) ➞ {1, 7}}

sumsUp({10, 9, 7, 2, 8}) ➞ {}

sumsUp({1, 6, 5, 4, 8, 2, 3, 7}) ➞ {{2, 6}, {3, 5}, {1, 7}}
// [6, 2] first to complete the cycle (to sum up to 8)
// [5, 3] follows
// [1, 7] lastly
// the pair that completes the cycle is always found on the left
// [2, 6], [3, 5], [1, 7] sorted according to cycle completeness, then pair-wise.
Notes
Remember the idea of "completes the cycle first" when getting the sort order of the pairs.
Only unique numbers are present in the array.
Return an empty array if nothing sums up to eight.


 */
public class EightSumUp {

    public static int[][] sumsUp(int[] n) {
        Set<Integer> set = new HashSet<>();
        List<int[]> list = new ArrayList<>();
        for (int i : n) {
            if (set.contains(i)) list.add((i < 8 - i) ? new int[]{i, 8 - i} : new int[]{8 - i, i});
            else set.add(8 - i);
        }
        return list.stream().toArray(int[][]::new);
    }


    @Test
    public void test01() {
        assertArrayEquals(new int[][]{{3, 5}}, sumsUp(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[][]{{1, 7}}, sumsUp(new int[]{1, 2, 3, 7, 9}));
    }

    @Test
    public void test03() {
        assertArrayEquals(new int[][]{}, sumsUp(new int[]{10, 9, 7, 2, 8}));
    }

    @Test
    public void test04() {
        assertArrayEquals(new int[][]{{2, 6}, {3, 5}, {1, 7}}, sumsUp(new int[]{1, 6, 5, 4, 8, 2, 3, 7}));
    }

    @Test
    public void test05() {
        assertArrayEquals(new int[][]{{3, 5}, {1, 7}, {2, 6}, {0, 8}}, sumsUp(new int[]{5, 7, 2, 3, 0, 1, 6, 4, 8}));
    }

    @Test
    public void test06() {
        assertArrayEquals(new int[][]{{1, 7}, {-2, 10}, {-1, 9}, {2, 6}}, sumsUp(new int[]{10, 9, 7, 1, 8, -2, -1, 2, 6}));
    }

    @Test
    public void test07() {
        assertArrayEquals(new int[][]{{1, 7}, {-2, 10}, {0, 8}, {-1, 9}}, sumsUp(new int[]{0, 1, -2, 7, 9, 5, 4, 10, 8, -1, 6}));
    }


}
