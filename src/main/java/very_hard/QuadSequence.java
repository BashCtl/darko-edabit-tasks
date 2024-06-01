package very_hard;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

/*
Quad Sequence


Write a function that receives an array of x integers and returns an array of x integers in the Nth term of a quadratic number sequence (where x is the length of the incoming array). Your function should return the continuation of the quadratic sequence of the length equal to the length of the given array.

Examples
quadSequence([48, 65, 84]) ➞ [105, 128, 153]

quadSequence([0, 1, 6, 15, 28]) ➞ [45, 66, 91, 120, 153]

quadSequence([9, 20, 33, 48]) ➞ [65, 84, 105, 128]
Notes
Both positive and negative numbers are included in the test cases.
 */
public class QuadSequence {

    public static int[] quadSequence(int[] sequence) {
        int n = sequence.length;
        if (n < 3) {
            throw new IllegalArgumentException("The sequence must have at least 3 terms to determine the quadratic pattern.");
        }

        int[] firstDifferences = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            firstDifferences[i] = sequence[i + 1] - sequence[i];
        }

        int[] secondDifferences = new int[n - 2];
        for (int i = 0; i < n - 2; i++) {
            secondDifferences[i] = firstDifferences[i + 1] - firstDifferences[i];
        }

        int secondDifference = secondDifferences[0];
        int lastTerm = sequence[n - 1];
        int lastFirstDifference = firstDifferences[n - 2];

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            lastFirstDifference += secondDifference;
            lastTerm += lastFirstDifference;
            result[i] = lastTerm;
        }

        return result;
    }

    @Test
    public void test1() {
        assertThat(quadSequence(new int[]{48,65,84}), is(new int[]{105,128,153}));
    }

    @Test
    public void test2() {
        assertThat(quadSequence(new int[]{9,20,33,48}), is(new int[]{65,84,105,128}));
    }

    @Test
    public void test3() {
        assertThat(quadSequence(new int[]{0,1,6,15,28}), is(new int[]{45,66,91,120,153}));
    }

    @Test
    public void test4() {
        assertThat(quadSequence(new int[]{6, 10, 16, 24}), is(new int[]{34,46,60,76}));
    }

    @Test
    public void test5() {
        assertThat(quadSequence(new int[]{3,12,27,48,75,108,147,192,243,300}), is(new int[]{363,432,507,588,675,768,867,972,1083,1200}));
    }

    @Test
    public void test6() {
        assertThat(quadSequence(new int[]{-3, 8, 23, 42, 65}), is(new int[]{92,123,158,197,240}));
    }

    @Test
    public void test7() {
        assertThat(quadSequence(new int[]{0,12,10}), is(new int[]{-6,-36,-80}));
    }
}
