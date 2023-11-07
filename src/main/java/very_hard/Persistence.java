package very_hard;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
Persistence

The additive persistence of an integer, n, is the number of times you have to replace n
with the sum of its digits until n becomes a single digit integer.

The multiplicative persistence of an integer, n, is the number of times you have to replace n
with the product of its digits until n becomes a single digit integer

Create two functions that take an integer as an argument and:

Return its additive persistence.
Return its multiplicative persistence.

Examples: Additive Persistence
additivePersistence(1679583) ➞ 3
// 1 + 6 + 7 + 9 + 5 + 8 + 3 = 39
// 3 + 9 = 12
// 1 + 2 = 3
// It takes 3 iterations to reach a single-digit number.

additivePersistence(123456) ➞ 2
// 1 + 2 + 3 + 4 + 5 + 6 = 21
// 2 + 1 = 3

additivePersistence(6) ➞ 0
// Because 6 is already a single-digit integer.

Examples: Multiplicative Persistence
multiplicativePersistence(77) ➞ 4
// 7 x 7 = 49
// 4 x 9 = 36
// 3 x 6 = 18
// 1 x 8 = 8
// It takes 4 iterations to reach a single-digit number.

multiplicativePersistence(123456) ➞ 2
// 1 x 2 x 3 x 4 x 5 x 6 = 720
// 7 x 2 x 0 = 0

multiplicativePersistence(4) ➞ 0
// Because 4 is already a single-digit integer.

Notes
The input n is never negative.

 */
public class Persistence {

    public static int additivePersistence(int n) {
        if (String.valueOf(n).length() == 1) {
            return 0;
        }
        n = Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt).sum();
        return 1 + additivePersistence(n);
    }

    public static long multiplicativePersistence(long n) {
        if (String.valueOf(n).length() == 1) {
            return 0;
        }
        n = Arrays.stream(String.valueOf(n).split(""))
                .mapToLong(Long::parseLong).reduce(1, (a, b) -> a * b);
        return 1 + multiplicativePersistence(n);
    }


    @Test
    public void test1() {
        assertEquals(0, additivePersistence(5));
    }

    @Test
    public void test2() {
        assertEquals(1, additivePersistence(27));
    }

    @Test
    public void test3() {
        assertEquals(2, additivePersistence(58));
    }

    @Test
    public void test4() {
        assertEquals(3, additivePersistence(5789));
    }

    @Test
    public void test5() {
        assertEquals(0, multiplicativePersistence(7));
    }

    @Test
    public void test6() {
        assertEquals(1, multiplicativePersistence(1234567890));
    }

    @Test
    public void test7() {
        assertEquals(3, multiplicativePersistence(39));
    }

    @Test
    public void test8() {
        assertEquals(6, multiplicativePersistence(6788));
    }

    @Test
    public void test9() {
        assertEquals(11, multiplicativePersistence(277777788888899L));
    }
}
