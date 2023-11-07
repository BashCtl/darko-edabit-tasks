package very_hard;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
Product of Digits of Sum

Create a function that takes one, two or more numbers as arguments and adds
them together to get a new number. The function then repeatedly multiplies
the digits of the new number by each other, yielding a new number,
until the product is only 1 digit long. Return the final product.

Examples
sumDigProd(16, 28) ➞ 6
// 16 + 28 = 44
// 4 * 4 =  16
// 1 * 6 = 6

sumDigProd(0) ➞ 0

sumDigProd(1, 2, 3, 4, 5, 6) ➞ 2

Notes
The input of the function is at least one number.
 */
public class ProductOfDigitsOfSum {

    public static long sumDigProd(int ...numbers){
        int sum = Arrays.stream(numbers).sum();
        return productDigit(sum);
    }

    public static long productDigit(long n) {
        if (String.valueOf(n).length() == 1) {
            return n;
        }
        n = Arrays.stream(String.valueOf(n).split(""))
                .mapToLong(Long::parseLong).reduce(1, (a, b) -> a * b);
        return productDigit(n);
    }

    @Test
    public void test1() {
        assertEquals(6, sumDigProd(8, 16, 89, 3));
    }

    @Test
    public void test2() {
        assertEquals(6, sumDigProd(16, 28));
    }

    @Test
    public void test3() {
        assertEquals(9, sumDigProd(9));
    }

    @Test
    public void test4() {
        assertEquals(6, sumDigProd(26, 497, 62, 841));
    }

    @Test
    public void test5() {
        assertEquals(0, sumDigProd(0));
    }

    @Test
    public void test6() {
        assertEquals(6, sumDigProd(17737, 98723, 2));
    }

    @Test
    public void test7() {
        assertEquals(8, sumDigProd(123, -99));
    }

    @Test
    public void test8() {
        assertEquals(7, sumDigProd(9, 8));
    }

    @Test
    public void test9() {
        assertEquals(8, sumDigProd(167, 167, 167, 167, 167, 3));
    }

    @Test
    public void test10() {
        assertEquals(1, sumDigProd(111111111));
    }

    @Test
    public void test11() {
        assertEquals(2, sumDigProd(98526, 54, 863, 156489, 45, 6156));
    }

    @Test
    public void test12() {
        assertEquals(8, sumDigProd(999, 999));
    }

    @Test
    public void test13() {
        assertEquals(2, sumDigProd(1, 2, 3, 4, 5, 6));
    }

    @Test
    public void test14() {
        assertEquals(2, sumDigProd(999, 2222));
    }

    @Test
    public void test15() {
        assertEquals(6, sumDigProd(8618, -2));
    }
}
