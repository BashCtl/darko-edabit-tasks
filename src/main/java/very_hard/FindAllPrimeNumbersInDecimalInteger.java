package very_hard;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/*
Find All Prime Numbers In Decimal Integer


Create a function that takes an integer argument and returns
an array of prime numbers found in the decimal representation of that number (not factors).

For example, extractPrimes(1717) returns [7, 7, 17, 17, 71].

The array should be in ascending order. If a prime number appears more than once,
every occurrence should be listed. If no prime numbers are found, return an empty array.

Examples
extractPrimes(1) ➞ []

extractPrimes(7) ➞ [7]

extractPrimes(73) ➞ [3, 7, 73]

extractPrimes(1313) ➞ [3, 3, 13, 13, 31, 131, 313]

Notes
All test cases are positive real integers.
Some numbers will have leading zeros. For example, the number 103 contains the prime number 3,
but also contains 03. These should be treated as the same number, so the result would simply be [3].

 */

public class FindAllPrimeNumbersInDecimalInteger {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int[] extractPrimes(int num) {
        List<Integer> numbers = new ArrayList<>();
        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length(); i++) {
            for (int j = 1; j <= numStr.length() - i; j++) {
                String extracted = numStr.substring(i, i + j);
                if (extracted.startsWith("0"))
                    continue;
                int number = Integer.parseInt(extracted);
                if(isPrime(number)){
                    numbers.add(number);
                }

            }
        }

        int[] result = numbers.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();

        return result.length > 0 ? result : new int[]{};
    }


    @Test
    public void test01() {
        assertArrayEquals(new int[]{}, extractPrimes(1));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[]{2}, extractPrimes(2));
    }

    @Test
    public void test03() {
        assertArrayEquals(new int[]{3}, extractPrimes(3));
    }

    @Test
    public void test04() {
        assertArrayEquals(new int[]{7}, extractPrimes(7));
    }

    @Test
    public void test05() {
        assertArrayEquals(new int[]{3, 13}, extractPrimes(13));
    }

    @Test
    public void test06() {
        assertArrayEquals(new int[]{3, 7, 73}, extractPrimes(73));
    }

    @Test
    public void test07() {
        assertArrayEquals(new int[]{101}, extractPrimes(101));
    }

    @Test
    public void test08() {
        assertArrayEquals(new int[]{3, 3, 13, 31, 313}, extractPrimes(313));
    }

    @Test
    public void test09() {
        assertArrayEquals(new int[]{3, 3, 13, 13, 31, 131, 313}, extractPrimes(1313));
    }

    @Test
    public void test10() {
        assertArrayEquals(new int[]{7, 7, 17, 17, 71}, extractPrimes(1717));
    }

    @Test
    public void test11() {
        assertArrayEquals(new int[]{2, 3, 23}, extractPrimes(10234));
    }

}


