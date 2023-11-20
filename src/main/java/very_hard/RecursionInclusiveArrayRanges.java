package very_hard;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/*
Recursion: Inclusive Array Ranges

Write a function that, given the start startNum and end endNum values,
return an array containing all the numbers inclusive to that range. See examples below.

Examples
inclusiveArray(1, 5) ➞ [1, 2, 3, 4, 5]

inclusiveArray(2, 8) ➞ [2, 3, 4, 5, 6, 7, 8]

inclusiveArray(10, 20) ➞ [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

inclusiveArray(17, 5) ➞ [17]
IMPORTANT
The use of IntStream.range and IntStream.rangeClosed is totally unacceptable
, hence, recursion is the very purpose of this challenge.
Notes
The numbers in the array are sorted in ascending order.
If startNum is greater than endNum, return an array with the higher value. See example #4.
You are expected to solve this challenge via a recursive approach.

 */

public class RecursionInclusiveArrayRanges {

    public static int[] inclusiveArray(int startNum, int endNum) {
        if (startNum > endNum) {
            return new int[]{startNum};
        } else if (startNum == endNum) {
            return new int[]{endNum};
        }

        return IntStream.concat(Arrays.stream(new int[]{startNum}),
                Arrays.stream(inclusiveArray(++startNum, endNum))).toArray();
    }

    @Test
    public void test01() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, inclusiveArray(1, 5));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[]{2, 3, 4, 5, 6, 7, 8}, inclusiveArray(2, 8));
    }

    @Test
    public void test03() {
        assertArrayEquals(new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, inclusiveArray(10, 20));
    }

    @Test
    public void test04() {
        assertArrayEquals(new int[]{17}, inclusiveArray(17, 5));
    }

    @Test
    public void test05() {
        assertArrayEquals(new int[]{40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}, inclusiveArray(40, 50));
    }

    @Test
    public void test06() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41}, inclusiveArray(1, 41));
    }

    @Test
    public void test07() {
        assertArrayEquals(new int[]{24}, inclusiveArray(24, 17));
    }

    @Test
    public void test08() {
        assertArrayEquals(new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66}, inclusiveArray(11, 66));
    }

    @Test
    public void test09() {
        assertArrayEquals(new int[]{9}, inclusiveArray(9, 3));
    }

    @Test
    public void test10() {
        assertArrayEquals(new int[]{6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, inclusiveArray(6, 16));
    }

}
