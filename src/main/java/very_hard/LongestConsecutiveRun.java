package very_hard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Longest Consecutive Run
A consecutive-run is a list of adjacent, consecutive integers.
This list can be either increasing or decreasing.
Create a function that takes an array of numbers and returns the length of the longest consecutive-run.

To illustrate:

longestRun([1, 2, 3, 5, 6, 7, 8, 9]) ➞ 5
// Two consecutive runs: [1, 2, 3] and [5, 6, 7, 8, 9] (longest).

Examples
longestRun([1, 2, 3, 10, 11, 15]) ➞ 3
// Longest consecutive-run: [1, 2, 3].

longestRun([5, 4, 2, 1]) ➞ 2
// Longest consecutive-run: [5, 4] and [2, 1].

longestRun([3, 5, 7, 10, 15]) ➞ 1
// No consecutive runs, so we return 1.
Notes
If there aren't any consecutive runs (there is a gap between each integer), return 1.

 */

public class LongestConsecutiveRun {

    public static int longestRun(int[] arr) {
        int max = 0;
        int count = 1;
        int expectedDiff = arr[0] < arr[arr.length - 1] ? 1 : -1;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff == expectedDiff) {
                count++;
            }
            if (i + 1 == arr.length - 1 || diff > expectedDiff || diff < expectedDiff) {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        return max;
    }


    @Test
    public void test1() {
        assertEquals(5, longestRun(new int[]{1, 2, 3, 5, 6, 7, 8, 9}));
    }

    @Test
    public void test2() {
        assertEquals(3, longestRun(new int[]{1, 2, 3, 10, 11, 15}));
    }

    @Test
    public void test3() {
        assertEquals(7, longestRun(new int[]{-7, -6, -5, -4, -3, -2, -1}));
    }

    @Test
    public void test4() {
        assertEquals(2, longestRun(new int[]{3, 5, 6, 10, 15}));
    }

    @Test
    public void test5() {
        assertEquals(1, longestRun(new int[]{3, 5, 7, 10, 15}));
    }

    @Test
    public void test6() {
        assertEquals(5, longestRun(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void test7() {
        assertEquals(2, longestRun(new int[]{5, 4, 2, 1}));
    }

    @Test
    public void test8() {
        assertEquals(2, longestRun(new int[]{10, 9, 0, 5}));
    }

    @Test
    public void test9() {
        assertEquals(3, longestRun(new int[]{1, 2, 3, 2, 1}));
    }

    @Test
    public void test10() {
        assertEquals(5, longestRun(new int[]{10, 9, 8, 7, 6, 2, 1}));
    }

}
