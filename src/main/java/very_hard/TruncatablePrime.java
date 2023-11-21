package very_hard;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/*

Truncatable PrimesA left-truncatable prime is a prime number that contains
no 0 digits and, when the first digit is successively removed, the result is always prime.

A right-truncatable prime is a prime number that contains no 0 digits and,
when the last digit is successively removed, the result is always prime.

Create a function that takes an integer as an argument and:

If the integer is only a left-truncatable prime, return "left".
If the integer is only a right-truncatable prime, return "right".
If the integer is both, return "both".
Otherwise, return "none".

Examples
truncatable(9137) ➞ "left"
// Because 9137, 137, 37 and 7 are all prime.

truncatable(5939) ➞ "right"
// Because 5939, 593, 59 and 5 are all prime.

truncatable(317) ➞ "both"
// Because 317, 17 and 7 are all prime and 317, 31 and 3 are all prime.

truncatable(5) ➞ "both"
// The trivial case of single-digit primes is treated as truncatable from both directions.

truncatable(139) ➞ "none"
// 1 and 9 are non-prime, so 139 cannot be truncatable from either direction.

truncatable(103) ➞ "none"
// Because it contains a 0 digit (even though 103 and 3 are primes).
Notes
The input integers will not exceed 10^6.


 */


public class TruncatablePrime {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String truncatable(int num) {
        String sNum = String.valueOf(num);
        boolean isLeft;
        boolean isRight;
        if (sNum.length() == 1) {
            return "both";
        } else if (!sNum.contains("0") && isPrime(num)) {
            isLeft = IntStream.range(1, sNum.length())
                    .allMatch(i -> isPrime(Integer.parseInt(sNum.substring(i))));
            isRight = IntStream.range(1, sNum.length())
                    .allMatch(i -> isPrime(Integer.parseInt(sNum.substring(0, sNum.length() - i))));

            if (isLeft && isRight) {
                return "both";
            } else if (isLeft) {
                return "left";
            } else if(isRight){
                return "right";
            }
        }

        return "none";
    }


    @Test
    public void test1() {
        assertEquals("left", truncatable(47));
    }

    @Test
    public void test2() {
        assertEquals("left", truncatable(347));
    }

    @Test
    public void test3() {
        assertEquals("left", truncatable(62383));
    }

    @Test
    public void test4() {
        assertEquals("right", truncatable(79));
    }

    @Test
    public void test5() {
        assertEquals("right", truncatable(7331));
    }

    @Test
    public void test6() {
        assertEquals("right", truncatable(233993));
    }

    @Test
    public void test7() {
        assertEquals("both", truncatable(3797));
    }

    @Test
    public void test8() {
        assertEquals("both", truncatable(739397));
    }

    @Test
    public void test9() {
        System.out.println("Single-digit number treated as both.");
        assertEquals("both", truncatable(5));
    }

    @Test
    public void test10() {
        assertEquals("none", truncatable(349));
    }

    @Test
    public void test11() {
        System.out.println("The starting number is composite.");
        assertEquals("none", truncatable(2317));
    }

    @Test
    public void test12() {
        System.out.println("1 is not a prime.");
        assertEquals("none", truncatable(131));
    }

    @Test
    public void test13() {
        System.out.println("Cannot contain a 0 digit.");
        assertEquals("none", truncatable(6043));
    }

}
