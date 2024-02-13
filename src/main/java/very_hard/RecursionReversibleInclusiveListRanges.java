package very_hard;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/*
Recursion: Reversible Inclusive List Ranges

Write a function that, given the startOfRange and endOfRange values,
returns an array containing all the numbers inclusive to that range. See examples below.

Examples
reversibleInclusiveList(1, 5) ➞ [1, 2, 3, 4, 5]

reversibleInclusiveList(2, 8) ➞ [2, 3, 4, 5, 6, 7, 8]

reversibleInclusiveList(10, 20) ➞ [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

reversibleInclusiveList(24, 17) ➞ [24, 23, 22, 21, 20, 19, 18, 17]

IMPORTANT
The use of IntStream.range and IntStream.rangeClosed is totally unacceptable, hence, recursion is the very purpose of this challenge.

Notes
The sort order of the resulting array is dependent of the input values.
All inputs provided in the test scenarios are valid.
If startOfRange is greater than endOfRange, return an descendingly sorted array, otherwise, ascendingly sorted.
You are expected to solve this challenge via a recursive approach.

 */

public class RecursionReversibleInclusiveListRanges {

    public static int[] reversibleInclusiveList(int startOfRange, int endOfRange, int... result) {
        int l = Math.abs(startOfRange - endOfRange);
        if (result.length == 0) {
            result = new int[l + 1];
        }
        if (startOfRange == endOfRange) {
            result[l] = endOfRange;
            return result;
        }
        result[l] = endOfRange;
        endOfRange = endOfRange > startOfRange ? --endOfRange : ++endOfRange;

        return reversibleInclusiveList(startOfRange, endOfRange, result);

    }

    @Test
    public void test01() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, reversibleInclusiveList(5, 1));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[]{6, 5, 4, 3, 2}, reversibleInclusiveList(6, 2));
    }

    @Test
    public void test03() {
        assertArrayEquals(new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, reversibleInclusiveList(10, 20));
    }

    @Test
    public void test04() {
        assertArrayEquals(new int[]{24, 23, 22, 21, 20, 19, 18, 17}, reversibleInclusiveList(24, 17));
    }

    @Test
    public void test05() {
        assertArrayEquals(new int[]{40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}, reversibleInclusiveList(40, 50));
    }

    @Test
    public void test06() {
        assertArrayEquals(new int[]{51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41}, reversibleInclusiveList(51, 41));
    }

    @Test
    public void test07() {
        assertArrayEquals(new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66}, reversibleInclusiveList(11, 66));
    }

    @Test
    public void test08() {
        assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4, 3}, reversibleInclusiveList(9, 3));
    }

    @Test
    public void test09() {
        assertArrayEquals(new int[]{6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, reversibleInclusiveList(6, 16));
    }
}
