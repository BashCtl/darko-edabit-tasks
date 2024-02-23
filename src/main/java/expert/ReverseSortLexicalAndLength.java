package expert;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
Reverse Sort: Lexical and Length


Write a function that sorts the words in a given string lexicographically (lexical sort) and by length in reverse order.

Examples
reverseSort("You've rocked the pragmatic world in the making!")
 ➞ "pragmatic making! You've rocked world the the in"

reverseSort("Tesh makes my world worth enjoying and living for.")
 ➞ "enjoying living worth world makes Tesh for. and my"

reverseSort("Shaken by the bloody truth and crazy lies.")
 ➞ "Shaken bloody truth lies. crazy the and by"

reverseSort("Java streams and collections are fun to program with!")
 ➞ "collections streams program with! Java fun are and to"

Notes
Special characters, punctuation marks and symbols are part of the word that directly precedes it.
The space character separates each word in the given string.
Case insensitive sorting is required.


 */

public class ReverseSortLexicalAndLength {

    public static String reverseSort(String str) {

        return Arrays.stream(str.split(" ")).sorted((a, b) -> {
            var compare = b.length() - a.length();
            if (compare == 0) {
                return b.toLowerCase().compareTo(a.toLowerCase());
            }
            return compare;
        }).collect(Collectors.joining(" "));
    }

    @Test
    public void test01() {
        assertEquals("pragmatic making! You've rocked world the the in", reverseSort("You've rocked the pragmatic world in the making!"));
    }

    @Test
    public void test02() {
        assertEquals("enjoying living worth world makes Tesh for. and my", reverseSort("Tesh makes my world worth enjoying and living for."));
    }

    @Test
    public void test03() {
        assertEquals("Shaken bloody truth lies. crazy the and by", reverseSort("Shaken by the bloody truth and crazy lies."));
    }

    @Test
    public void test04() {
        assertEquals("collections streams program with! Java fun are and to", reverseSort("Java streams and collections are fun to program with!"));
    }

    @Test
    public void test05() {
        assertEquals("substance beauty. woman Tesha true and of is a a", reverseSort("Tesha is a woman of true substance and a beauty."));
    }

    @Test
    public void test06() {
        assertEquals("alphanumeric sorting. similar Lexical sort to is", reverseSort("Lexical sort is similar to alphanumeric sorting."));
    }

    @Test
    public void test07() {
        assertEquals("you. not do, all up To to to or is do", reverseSort("To do or not to do, is all up to you."));
    }

    @Test
    public void test08() {
        assertEquals("Javascript program methods with! array fun are to", reverseSort("Javascript array methods are fun to program with!"));
    }

    @Test
    public void test09() {
        assertEquals("Programming Java fun. lot of is in a", reverseSort("Programming in Java is a lot of fun."));
    }

    @Test
    public void test10() {
        assertEquals("Truly, Tesh. heart beats that one for for but no a", reverseSort("Truly, a heart that beats for no one but for Tesh."));
    }

}
