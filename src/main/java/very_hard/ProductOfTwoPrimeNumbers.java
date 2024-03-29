package very_hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/*
Product of Two Prime Numbers

Write a function that returns true if the given number num
is a product of any two prime numbers.

Examples
productOfPrimes(2059) ➞ true
// 29*71=2059

productOfPrimes(10) ➞ true
// 2*5=10

productOfPrimes(25) ➞ true
// 5*5=25

productOfPrimes(999) ➞ false
// There are no prime numbers.
Notes
num is always greater than 0.
0 and 1 aren't prime numbers.

 */

public class ProductOfTwoPrimeNumbers {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean productOfPrimes(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (isPrime(i)) {
                if (num % i == 0 && isPrime(num / i)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Test
    public void test1() {
        assertEquals(true, productOfPrimes(2059));
    }

    @Test
    public void test2() {
        assertEquals(false, productOfPrimes(7));
    }

    @Test
    public void test3() {
        assertEquals(true, productOfPrimes(25));
    }

    @Test
    public void test4() {
        assertEquals(true, productOfPrimes(39));
    }

    @Test
    public void test5() {
        assertEquals(true, productOfPrimes(5767));
    }

    @Test
    public void test6() {
        assertEquals(true, productOfPrimes(77));
    }

    @Test
    public void test7() {
        assertEquals(false, productOfPrimes(12));
    }

}
