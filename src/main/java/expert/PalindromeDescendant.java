package expert;

import java.util.Arrays;
import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

/*
Palindrome Descendant

A number may not be a palindrome, but its descendant can be.
A number's direct child is created by summing each pair of adjacent digits to create the digits of the next number.

For instance, 123312 is not a palindrome, but its next child 363 is, where: 3 = 1 + 2; 6 = 3 + 3; 3 = 1 + 2.

Create a function that returns true if the number itself
is a palindrome or any of its descendants down to the first 2 digit number (a 1-digit number is trivially a palindrome).

Examples
palindromedescendant(11211230) ➞ true
// 11211230 ➞ 2333 ➞ 56 ➞ 11

palindromeDescendant(13001120) ➞ true
// 13001120 ➞ 4022 ➞ 44

palindromeDescendant(23336014) ➞ true
// 23336014 ➞ 5665

palindromeDescendant(11) ➞ true
// Number itself is a palindrome.

Notes
Numbers will always have an even number of digits.
 */
public class PalindromeDescendant {

    public static boolean palindromeDescendant(int num) {

        String sNum = String.valueOf(num);
        if (sNum.length() == 1) {
            return false;
        }

        if (sNum.contentEquals(new StringBuilder(sNum).reverse())) {
            return true;
        }
        StringBuilder proceededNum = new StringBuilder();
        for (int i = 0; i < sNum.length() - 1; i += 2) {
            int twoDigitSum = Arrays.stream(sNum.substring(i, i + 2).split(""))
                    .mapToInt(Integer::parseInt)
                    .reduce(0, Integer::sum);
            proceededNum.append(twoDigitSum);
        }

        return palindromeDescendant(Integer.parseInt(proceededNum.toString()));


    }

    @Test
    public void test1() {
        assertThat(palindromeDescendant(11211230), is(true));
    }

    @Test
    public void test2() {
        assertThat(palindromeDescendant(13001120), is(true));
    }

    @Test
    public void test3() {
        assertThat(palindromeDescendant(23336014), is(true));
    }

    @Test
    public void test4() {
        assertThat(palindromeDescendant(11), is(true));
    }

    @Test
    public void test5() {
        assertThat(palindromeDescendant(1122), is(false));
    }

    @Test
    public void test6() {
        assertThat(palindromeDescendant(332233), is(true));
    }

    @Test
    public void test7() {
        assertThat(palindromeDescendant(10210112), is(true));
    }

    @Test
    public void test8() {
        assertThat(palindromeDescendant(9735), is(false));
    }

    @Test
    public void test9() {
        assertThat(palindromeDescendant(97358817), is(false));
    }

}
