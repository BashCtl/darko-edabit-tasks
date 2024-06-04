package very_hard;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
N-bonacci Numbers

N-bonacci numbers are generalisations of the fibonacci sequence, where the next term is always the sum of the previous N terms. By convention, the first (N-1) terms are all 0 and the Nth term is 1.

The initial 10 terms of the first 5 N-bonacci sequences are therefore:

1-bonacci = 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, ...
2-bonacci = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
3-bonacci = 0, 0, 1, 1, 2, 4, 7, 13, 24, 44, ...
4-bonaaci = 0, 0, 0, 1, 1, 2, 4, 8, 15, 29, ...
5-bonacci = 0, 0, 0, 0, 1, 1, 2, 4, 8, 16, ...
Write a function that returns the kth term of the N-bonacci sequence, for two integer arguments N and k.

Examples
bonacci(1, 10) ➞ 1

bonacci(2, 10) ➞ 34

bonacci(3, 10) ➞ 44

bonacci(4, 10) ➞ 29

bonacci(5, 10) ➞ 16
 */
public class NBonacciNumbers {


    public static long bonacci(int N, int k) {
        if (k <= 0) {
            throw new IllegalArgumentException("k must be a positive integer.");
        }
        if (N <= 0) {
            throw new IllegalArgumentException("N must be a positive integer.");
        }

        if (k <= N) {
            return (k == N) ? 1 : 0;
        }

        long[] bonacciSequence = new long[k];
        for (int i = 0; i < N - 1; i++) {
            bonacciSequence[i] = 0;
        }
        bonacciSequence[N - 1] = 1;

        for (int i = N; i < k; i++) {
            bonacciSequence[i] = 0;
            for (int j = 1; j <= N; j++) {
                bonacciSequence[i] += bonacciSequence[i - j];
            }
        }

        return bonacciSequence[k - 1];
    }

    @Test
    public void test1() {
        assertEquals(8, bonacci(2, 7));
    }

    @Test
    public void test2() {
        assertEquals(274, bonacci(3, 13));
    }

    @Test
    public void test3() {
        assertEquals(203513, bonacci(5, 24));
    }

    @Test
    public void test4() {
        assertEquals(32440904961L, bonacci(8, 44));
    }

    @Test
    public void test5() {
        assertEquals(1, bonacci(1, 4));
    }

    @Test
    public void test6() {
        assertEquals(1, bonacci(2, 2));
    }

    @Test
    public void test7() {
        assertEquals(0, bonacci(3, 1));
    }
    
}
