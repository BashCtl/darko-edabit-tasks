package hard;

import java.util.stream.IntStream;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/*
Almost Palindrome

A string is an almost-palindrome if, by changing only one character,
you can make it a palindrome. Create a function that returns true
if a string is an almost-palindrome and false otherwise.

Examples
almostPalindrome("abcdcbg") ➞ true
// Transformed to "abcdcba" by changing "g" to "a".

almostPalindrome("abccia") ➞ true
// Transformed to "abccba" by changing "i" to "b".

almostPalindrome("abcdaaa") ➞ false
// Can't be transformed to a palindrome in exactly 1 turn.

almostPalindrome("1234312") ➞ false

Notes
Return false if the string is already a palindrome.
 */
public class AlmostPalindrome {


    public static boolean almostPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        if (reversed.equals(str)) {
            return false;
        }
        long missmatch = IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(i) == reversed.charAt(i))
                .filter(b -> !b)
                .count();
        return missmatch == 2;
    }


    @Test
    public void test1() {
        assertEquals(true, almostPalindrome("abcdcbg"));
    }

    @Test
    public void test2() {
        assertEquals(true, almostPalindrome("abccia"));
    }

    @Test
    public void test3() {
        assertEquals(false, almostPalindrome("abcdaaa"));
    }

    @Test
    public void test4() {
        assertEquals(true, almostPalindrome("gggfgig"));
    }

    @Test
    public void test5() {
        assertEquals(false, almostPalindrome("gggffff"));
    }

    @Test
    public void test6() {
        assertEquals(true, almostPalindrome("GIGGG"));
    }

    @Test
    public void test7() {
        assertEquals(true, almostPalindrome("ggggi"));
    }

    @Test
    public void test8() {
        System.out.println("Should return false if already palindrome.");
        assertEquals(false, almostPalindrome("ggggg"));
    }

    @Test
    public void test9() {
        System.out.println("Should return false if already palindrome.");
        assertEquals(false, almostPalindrome("gggfggg"));
    }

    @Test
    public void test10() {
        assertEquals(false, almostPalindrome("1234312"));
    }

}
