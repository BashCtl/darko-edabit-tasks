package expert;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
Recursion: Palindrome Phrase

A palindrome is a series of letters or numbers that reads equivocally backwards.

Write a recursive function that determines whether a given string is a palindrome or not.

Examples
isPalindrome("Maneuquenam") ➞ true

isPalindrome("This phrase, surely, is not a palindrome!") ➞ false

isPalindrome("Eva, can I see bees in a cave?") ➞ true

Notes
Symbols and special characters should be ignored.
You are expected to solve this challenge via recursion.


 */

public class RecursionPalindromePhrase {

    public static boolean isPalindrome(String phrase, boolean... flag) {
        if (flag.length == 0) {
            flag = new boolean[1];
            phrase = phrase.toLowerCase().replaceAll("[^a-z0-9]", "");
        }
        if (phrase.isEmpty() || phrase.length() == 1) {
            return true;
        }
        if (phrase.charAt(0) == phrase.charAt(phrase.length() - 1)) {
            return isPalindrome(phrase.substring(1, phrase.length() - 1), flag);
        }
        return false;
    }

    @Test
    public void test01() {
        assertEquals(true, isPalindrome("Maneuquenam"));
    }

    @Test
    public void test02() {
        assertEquals(false, isPalindrome("Not a palindrome"));
    }

    @Test
    public void test03() {
        assertEquals(true, isPalindrome("A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!"));
    }

    @Test
    public void test04() {
        assertEquals(true, isPalindrome("Go hang a salami, I'm a lasagna hog!"));
    }

    @Test
    public void test05() {
        assertEquals(false, isPalindrome("This phrase is really this!"));
    }

    @Test
    public void test06() {
        assertEquals(true, isPalindrome("Red rum, sir, is murder."));
    }

    @Test
    public void test07() {
        assertEquals(true, isPalindrome("Big step on no pets, Gib!"));
    }

    @Test
    public void test08() {
        assertEquals(false, isPalindrome("One true fortune, but no!"));
    }

    @Test
    public void test09() {
        assertEquals(true, isPalindrome("Don't nod."));
    }

    @Test
    public void test10() {
        assertEquals(true, isPalindrome("I did, did I?"));
    }

    @Test
    public void test11() {
        assertEquals(true, isPalindrome("My gym."));
    }

    @Test
    public void test12() {
        assertEquals(true, isPalindrome("Top spot."));
    }

    @Test
    public void test13() {
        assertEquals(true, isPalindrome("Was it a cat I saw?"));
    }

    @Test
    public void test14() {
        assertEquals(true, isPalindrome("No lemon, no melon."));
    }

    @Test
    public void test15() {
        assertEquals(true, isPalindrome("Eva, can I see bees in a cave?"));
    }

    @Test
    public void test16() {
        assertEquals(false, isPalindrome("Can I be iconic?"));
    }

    @Test
    public void test17() {
        assertEquals(true, isPalindrome("Madam I'm Adam."));
    }

    @Test
    public void test18() {
        assertEquals(false, isPalindrome("The man on the moon are them."));
    }

    @Test
    public void test19() {
        assertEquals(true, isPalindrome("Sit on a potato pan, Otis."));
    }

    @Test
    public void test20() {
        assertEquals(false, isPalindrome("Truly, a classic cadillac!"));
    }

    @Test
    public void test21() {
        assertEquals(true, isPalindrome("Able was I, ere I saw Elba."));
    }

    @Test
    public void test22() {
        assertEquals(true, isPalindrome("Step on no pets!"));
    }
}
