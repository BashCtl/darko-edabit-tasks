package hard;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import java.util.Arrays;

/*

Goldbach Conjecture

Goldbach's Conjecture is amongst the oldest and well-known unsolved mathematical problems. In correspondence with Leonhard Euler in 1742, German mathematician Christian Goldbach made a conjecture, which states:

"Every even whole number greater than 2 is the sum of two prime numbers."

Even though it's been thoroughly tested and analyzed and seems to be true, it hasn't been proved yet (thus, remaining a conjecture.)

Create a function that takes a number and returns an array as per the following rules:

If the given number is odd and greater than two, return an empty array.
If the given number is even and greater than two, return an array of two prime numbers whose sum is the given input.
Both prime numbers must be the farthest (with the greatest difference).
Examples
goldbachConjecture(1) ➞ []
// The given number is not greater than 2.

goldbachConjecture(7) ➞ []
// The given number is not an even number.

goldbachConjecture(14) ➞ [3, 11]

goldbachConjecture(544) ➞ [3, 541]

goldbachConjecture(4666) ➞ [3, 4663]
Notes
Return array in sequence: [smaller, bigger]
 */

public class GoldbachConjecture {


    public static int[] goldbachConjecture(int n) {
        if (n <= 2 || n % 2 != 0) {
            return new int[]{}; // Return empty array for odd numbers or numbers <= 2
        }

        // Generate a list of primes up to n using the Sieve of Eratosthenes
        boolean[] isPrime = sieveOfEratosthenes(n);

        // Find the pair of primes with the greatest difference that sum up to n
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime[i] && isPrime[n - i]) {
                return new int[]{i, n - i};
            }
        }

        return new int[]{}; // This should never happen according to Goldbach's conjecture
    }

    private static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }


    @Test
    public void test01() {
        assertArrayEquals(new int[]{2, 2}, goldbachConjecture(4));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[]{3, 5}, goldbachConjecture(8));
    }

    @Test
    public void test03() {
        assertArrayEquals(new int[]{3, 7}, goldbachConjecture(10));
    }

    @Test
    public void test04() {
        assertArrayEquals(new int[]{5, 19}, goldbachConjecture(24));
    }

    @Test
    public void test05() {
        assertArrayEquals(new int[]{3, 97}, goldbachConjecture(100));
    }

    @Test
    public void test06() {
        assertArrayEquals(new int[]{3, 1231}, goldbachConjecture(1234));
    }

    @Test
    public void test07() {
        assertArrayEquals(new int[]{19, 1381}, goldbachConjecture(1400));
    }

    @Test
    public void test08() {
        assertArrayEquals(new int[]{7, 1559}, goldbachConjecture(1566));
    }

    @Test
    public void test09() {
        assertArrayEquals(new int[]{11, 3433}, goldbachConjecture(3444));
    }

    @Test
    public void test10() {
        assertArrayEquals(new int[]{3, 1997}, goldbachConjecture(2000));
    }

    @Test
    public void test11() {
        assertArrayEquals(new int[]{3, 541}, goldbachConjecture(544));
    }

    @Test
    public void test12() {
        assertArrayEquals(new int[]{3, 4663}, goldbachConjecture(4666));
    }
}
