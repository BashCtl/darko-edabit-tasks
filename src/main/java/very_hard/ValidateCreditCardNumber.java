package very_hard;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
Validate Credit Card Number

Create a function that takes a number as an argument and returns true
if the number is a valid credit card number, false otherwise.

Credit card numbers must be between 14-19 digits in length, and pass the Luhn test, described below:

1 - Remove the last digit (this is the "check digit").
2 - Reverse the number.
3 - Double the value of each digit in odd-numbered positions.
    If the doubled value has more than 1 digit, add the digits together (e.g. 8 x 2 = 16 ➞ 1 + 6 = 7).
4 - Add all digits.
5 - Subtract the last digit of the sum (from step 4) from 10. The result should be equal to the check digit from step 1.


 */


public class ValidateCreditCardNumber {

    public static int processCardNumbers(String reversedNum, int index) {
        int currentNum = Integer.parseInt(reversedNum.substring(index, index + 1));
        if ((index + 1) % 2 == 0) {
            return currentNum;
        } else {
            currentNum *= 2;
            String s = String.valueOf(currentNum);
            while (s.length() > 1) {
                int sum = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).sum();
                s = String.valueOf(sum);
            }
            return Integer.parseInt(s);

        }
    }

    public static boolean validateCard(long num) {
        String sNum = String.valueOf(num);
        if (sNum.length() < 14 || sNum.length() > 19) {
            return false;
        }
        long last = Long.parseLong(sNum.substring(sNum.length() - 1));
        sNum = sNum.substring(0, sNum.length() - 1);
        String reversedNum = new StringBuilder(sNum).reverse().toString();
        int total = IntStream.range(0, sNum.length()).map(index -> processCardNumbers(reversedNum, index)).sum();
        String sTotal = String.valueOf(total);
        int lastFromTotal = Integer.parseInt(sTotal.substring(sTotal.length() - 1));
        return 10 - lastFromTotal == last;
    }



    @Test
    public void test1() {
        assertEquals(false, validateCard(79927398714L));
    }

    @Test
    public void test2() {
        System.out.println("Passes Luhn test, but too short.");
        assertEquals(false, validateCard(79927398713L));
    }

    @Test
    public void test3() {
        assertEquals(true, validateCard(709092739800713L));
    }

    @Test
    public void test4() {
        assertEquals(false, validateCard(1234567890123456L));
    }

    @Test
    public void test5() {
        assertEquals(true, validateCard(12345678901237L));
    }

    @Test
    public void test6() {
        assertEquals(true, validateCard(5496683867445267L));
    }

    @Test
    public void test7() {
        assertEquals(false, validateCard(4508793361140566L));
    }

    @Test
    public void test8() {
        assertEquals(true, validateCard(376785877526048L));
    }

    @Test
    public void test9() {
        assertEquals(false, validateCard(36717601781975L));
    }
}
