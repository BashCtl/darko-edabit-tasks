package very_hard;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/*
Same Letter Patterns

Create a function that returns true if two strings share the same letter pattern, and false otherwise.

Examples
sameLetterPattern("ABAB", "CDCD") ➞ true

sameLetterPattern("ABCBA", "BCDCB") ➞ true

sameLetterPattern("FFGG", "CDCD") ➞ false

sameLetterPattern("FFFF", "ABCD") ➞ false
 */
public class SameLetterPattern {

    public static boolean sameLetterPattern(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2) {
                    return false;
                }
            } else {
                map1.put(c1, c2);
            }

            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1) {
                    return false;
                }
            } else {
                map2.put(c2, c1);
            }
        }

        return true;
    }

    @Test
    public void test1() {
        assertEquals(true, sameLetterPattern("ABAB", "CDCD"));
    }

    @Test
    public void test2() {
        assertEquals(true, sameLetterPattern("AAABBB", "CCCDDD"));
    }

    @Test
    public void test3() {
        assertEquals(true, sameLetterPattern("ABCBA", "BCDCB"));
    }

    @Test
    public void test4() {
        assertEquals(true, sameLetterPattern("AAAA", "BBBB"));
    }

    @Test
    public void test5() {
        assertEquals(true, sameLetterPattern("BAAB", "ABBA"));
    }

    @Test
    public void test6() {
        assertEquals(true, sameLetterPattern("BAAB", "QZZQ"));
    }

    @Test
    public void test7() {
        assertEquals(true, sameLetterPattern("TTZZVV", "PPSSBB"));
    }

    @Test
    public void test8() {
        assertEquals(true, sameLetterPattern("ZYX", "ABC"));
    }

    @Test
    public void test9() {
        assertEquals(true, sameLetterPattern("AABAA", "SSCSS"));
    }

    @Test
    public void test10() {
        assertEquals(true, sameLetterPattern("AABAABAA", "SSCSSCSS"));
    }

    @Test
    public void test11() {
        assertEquals(true, sameLetterPattern("UBUBUBUB", "WEWEWEWE"));
    }

    @Test
    public void test12() {
        assertEquals(false, sameLetterPattern("FFGG", "FFG"));
    }

    @Test
    public void test13() {
        assertEquals(false, sameLetterPattern("FFGG", "CDCD"));
    }

    @Test
    public void test14() {
        assertEquals(false, sameLetterPattern("FFFG", "GGHI"));
    }

    @Test
    public void test15() {
        assertEquals(false, sameLetterPattern("FFFF", "ABCD"));
    }

    @Test
    public void test16() {
        assertEquals(false, sameLetterPattern("ABCA", "ABCD"));
    }

    @Test
    public void test17() {
        assertEquals(false, sameLetterPattern("ABCAAA", "DDABCD"));
    }
    
}
