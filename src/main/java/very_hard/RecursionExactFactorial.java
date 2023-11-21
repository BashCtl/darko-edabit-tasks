package very_hard;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/*
Recursion: Exact Factorial Bounds


Create a recursive function that tests if a number is the exact
upper bound of the factorial of n. If so, return an array
of the exact factorial bound and n, or otherwise, an empty array.

Examples
isExact(6) ➞ [6, 3]

isExact(24) ➞ [24, 4]

isExact(125) ➞ []

isExact(720) ➞ [720, 6]

isExact(1024) ➞ []

isExact(40320) ➞ [40320, 8]
Notes
You are expected to solve this challenge via recursion.
 */
public class RecursionExactFactorial {

    public static long[] isExact(long n, long... f) {
        if (f.length == 0) {
            f = new long[2];
            f[0] = 1;
        }

        while (f[0] < n) {
            f[1] = f[1] + 1;
            f[0] *= f[1];
            return isExact(n, f);
        }
        return f[0] == n ? new long[]{n, f[1]} : new long[]{};
    }

    private long[] numVector = new long[]{6, 24, 120, 5040, 40320, 3628800, 20922789888000L, 125, 721, 1024, 41845579776000L};
    private long[][] resVector = new long[][]{
            {6, 3}, {24, 4}, {120, 5}, {5040, 7}, {40320, 8},
            {3628800, 10}, {20922789888000L, 16}, {}, {}, {}, {}
    };

    @Test
    public void test1() {
        assertArrayEquals(isExact(numVector[0]), resVector[0]);
    }

    @Test
    public void test2() {
        assertArrayEquals(isExact(numVector[1]), resVector[1]);
    }

    @Test
    public void test3() {
        assertArrayEquals(isExact(numVector[2]), resVector[2]);
    }

    @Test
    public void test4() {
        assertArrayEquals(isExact(numVector[3]), resVector[3]);
    }

    @Test
    public void test5() {
        assertArrayEquals(isExact(numVector[4]), resVector[4]);
    }

    @Test
    public void test6() {
        assertArrayEquals(isExact(numVector[5]), resVector[5]);
    }

    @Test
    public void test7() {
        assertArrayEquals(isExact(numVector[6]), resVector[6]);
    }

    @Test
    public void test8() {
        assertArrayEquals(isExact(numVector[7]), resVector[7]);
    }

    @Test
    public void test9() {
        assertArrayEquals(isExact(numVector[8]), resVector[8]);
    }

    @Test
    public void test10() {
        assertArrayEquals(isExact(numVector[9]), resVector[9]);
    }

    @Test
    public void test11() {
        assertArrayEquals(isExact(numVector[10]), resVector[10]);
    }
}
