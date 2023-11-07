package very_hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Palindromic Anagrams

Given a word, create a function which returns whether or not it's possible to create
a palindrome by rearranging the letters in the word.


Examples
isPalindromePossible("rearcac") ➞ true
// You can make "racecar"

isPalindromePossible("suhbeusheff") ➞ true
// You can make "sfuehbheufs" (not a real word but still a palindrome)

isPalindromePossible("palindrome") ➞ false
// It's impossible


Notes
Trivially, words which are already palindromes return true.
Words are given in all lowercase.
 */

public class PalindromicAnagrams {

    public static boolean isPalindromePossible(String str){
        List<String> letters = Arrays.asList(str.split(""));
        long countOdd = letters.stream().distinct().map(x -> Collections.frequency(letters, x))
                .filter(n -> n % 2 != 0).count();
        return countOdd == 1 || countOdd==0;
    }


    @Test
    public void test1() {
        assertEquals(true, isPalindromePossible("rearcac"));
    }

    @Test
    public void test2() {
        assertEquals(true, isPalindromePossible("suhbeusheff"));
    }

    @Test
    public void test3() {
        assertEquals(false, isPalindromePossible("palindrome"));
    }

    @Test
    public void test4() {
        assertEquals(false, isPalindromePossible("yagnx"));
    }

    @Test
    public void test5() {
        assertEquals(false, isPalindromePossible("zgzqxljjp"));
    }

    @Test
    public void test6() {
        assertEquals(false, isPalindromePossible("tgmqkpdhnhatoco"));
    }

    @Test
    public void test7() {
        assertEquals(true, isPalindromePossible("akyka"));
    }

    @Test
    public void test8() {
        assertEquals(false, isPalindromePossible("kjyyrftnbsbq"));
    }

    @Test
    public void test9() {
        assertEquals(false, isPalindromePossible("jynmynqhcy"));
    }

    @Test
    public void test10() {
        assertEquals(false, isPalindromePossible("hfe"));
    }

    @Test
    public void test11() {
        assertEquals(true, isPalindromePossible("noon"));
    }

    @Test
    public void test12() {
        assertEquals(false, isPalindromePossible("azmkallbanpu"));
    }

    @Test
    public void test13() {
        assertEquals(true, isPalindromePossible("drrede"));
    }

    @Test
    public void test14() {
        assertEquals(false, isPalindromePossible("xmhwcocldjdnqvv"));
    }

    @Test
    public void test15() {
        assertEquals(true, isPalindromePossible("reparpe"));
    }

    @Test
    public void test16() {
        assertEquals(false, isPalindromePossible("jnavz"));
    }

    @Test
    public void test17() {
        assertEquals(true, isPalindromePossible("orort"));
    }

    @Test
    public void test18() {
        assertEquals(false, isPalindromePossible("mel"));
    }

    @Test
    public void test19() {
        assertEquals(false, isPalindromePossible("jdxknf"));
    }

    @Test
    public void test20() {
        assertEquals(false, isPalindromePossible("qo"));
    }

    @Test
    public void test21() {
        assertEquals(true, isPalindromePossible("neett"));
    }

    @Test
    public void test22() {
        assertEquals(true, isPalindromePossible("wow"));
    }

    @Test
    public void test23() {
        assertEquals(true, isPalindromePossible("avkkiaapiusuapspiip"));
    }

    @Test
    public void test24() {
        assertEquals(true, isPalindromePossible("aann"));
    }

    @Test
    public void test25() {
        assertEquals(true, isPalindromePossible("iivcc"));
    }

    @Test
    public void test26() {
        assertEquals(true, isPalindromePossible("akyka"));
    }

    @Test
    public void test27() {
        assertEquals(true, isPalindromePossible("eelvl"));
    }

    @Test
    public void test28() {
        assertEquals(true, isPalindromePossible("damam"));
    }

    @Test
    public void test29() {
        assertEquals(true, isPalindromePossible("mmo"));
    }

    @Test
    public void test30() {
        assertEquals(false, isPalindromePossible("ge"));
    }

    @Test
    public void test31() {
        assertEquals(true, isPalindromePossible("arrad"));
    }

    @Test
    public void test32() {
        assertEquals(false, isPalindromePossible("bq"));
    }

    @Test
    public void test33() {
        assertEquals(false, isPalindromePossible("djufyllynldw"));
    }

    @Test
    public void test34() {
        assertEquals(true, isPalindromePossible("reparpe"));
    }

    @Test
    public void test35() {
        assertEquals(true, isPalindromePossible("ttraoor"));
    }

    @Test
    public void test36() {
        assertEquals(true, isPalindromePossible("orort"));
    }

    @Test
    public void test37() {
        assertEquals(true, isPalindromePossible("asgas"));
    }

    @Test
    public void test38() {
        assertEquals(true, isPalindromePossible("t"));
    }

    @Test
    public void test39() {
        assertEquals(true, isPalindromePossible("tstsa"));
    }

    @Test
    public void test40() {
        assertEquals(true, isPalindromePossible("neett"));
    }

    @Test
    public void test41() {
        assertEquals(false, isPalindromePossible("wndnwrkpkihup"));
    }

}
