package hard;

import java.util.*;
import java.util.stream.Collectors;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PossiblePalindrome {

    public static boolean possiblePalindrome(String str){
        List<String> strings = Arrays.stream(str.split("")).collect(Collectors.toList());
        int odd =0;
        for (String s: new HashSet<>(strings)){
            if (Collections.frequency(strings,s)%2!=0){
                odd++;
                if (odd>1){
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void test1() {
        assertEquals(true, possiblePalindrome("acabbaa"));
    }

    @Test
    public void test2() {
        assertEquals(true, possiblePalindrome("aacbdbc"));
    }

    @Test
    public void test3() {
        assertEquals(false, possiblePalindrome("aacbdb"));
    }

    @Test
    public void test4() {
        assertEquals(false, possiblePalindrome("abacbb"));
    }

    @Test
    public void test5() {
        assertEquals(true, possiblePalindrome("abb"));
    }

    @Test
    public void test6() {
        assertEquals(true, possiblePalindrome("bbb"));
    }

    @Test
    public void test7() {
        assertEquals(true, possiblePalindrome("bbaa"));
    }

    @Test
    public void test8() {
        assertEquals(true, possiblePalindrome("bbaacc"));
    }

    @Test
    public void test9() {
        assertEquals(true, possiblePalindrome("bbaaccd"));
    }

    @Test
    public void test10() {
        assertEquals(false, possiblePalindrome("bbaacd"));
    }

    @Test
    public void test11() {
        assertEquals(false, possiblePalindrome("abc"));
    }

    @Test
    public void test12() {
        assertEquals(false, possiblePalindrome("ab"));
    }

    @Test
    public void test13() {
        assertEquals(false, possiblePalindrome("aabbccddef"));
    }

}
