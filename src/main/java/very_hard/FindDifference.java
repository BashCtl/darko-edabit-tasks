package very_hard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/*

Find the Difference

You are given two strings s and t.

String t is generated by randomly shuffling string s and then adding one more letter at a random position.

Return the letter that was added to t.

Examples
findTheDifference("bcefg", "bcdefg") ➞ 'd'

findTheDifference("abcd", "abcde") ➞ 'e'

findTheDifference("aiou", "aeiou") ➞ 'e'

findTheDifference("mnoqrst", "mnopqrst") ➞ 'p'

 */

public class FindDifference {


    public static char findTheDifference(String s, String t) {
        List<Character> list1 = Arrays.stream(s.split(""))
                .map(n -> n.charAt(0)).collect(Collectors.toList());
        List<Character> list2 = Arrays.stream(t.split(""))
                .map(n -> n.charAt(0)).collect(Collectors.toList());
        for (Character c : new HashSet<>(list2)) {
            if (Collections.frequency(list1, c) != Collections.frequency(list2, c)) {
                return c;
            }
        }

        return 0;
    }

    @Test
    public void test01() {
        assertEquals('d', findTheDifference("bcefg", "bcdefg"));
    }

    @Test
    public void test02() {
        assertEquals('e', findTheDifference("bcdfg", "bcdefg"));
    }

    @Test
    public void test03() {
        assertEquals('e', findTheDifference("aiou", "aeiou"));
    }

    @Test
    public void test04() {
        assertEquals('p', findTheDifference("mnoqrst", "mnopqrst"));
    }

    @Test
    public void test05() {
        assertEquals('t', findTheDifference("rsuvw", "rstuvw"));
    }

    @Test
    public void test06() {
        assertEquals('e', findTheDifference("abcd", "abcde"));
    }

    @Test
    public void test07() {
        assertEquals('s', findTheDifference("rt", "rst"));
    }

    @Test
    public void test08() {
        assertEquals('h', findTheDifference("gjklmn", "ghjklmn"));
    }

    @Test
    public void test09() {
        assertEquals('a', findTheDifference("ae", "aea"));
    }

    @Test
    public void randomizedTest() {
        for (int i = 0; i < Letters.randInt(11, 20); i++) {
            String a = String.valueOf(Letters.randChar(97, 122)), s = Letters.randStr(6, 8);
            assertEquals(a.charAt(0), findTheDifference(s, Letters.shuffle(s + a)));
        }
    }
}

class Letters {
    public static String shuffle(String s) {
        char[] r = s.toCharArray();
        for (int i = s.length() - 1; i > 0; i--) {
            char t = r[i];
            int k = (int) Math.floor(Math.random() * (i + 1));
            r[i] = r[k];
            r[k] = t;
        }
        return String.valueOf(r);
    }

    public static String randStr(int... m) {
        char[] s = new char[Letters.randInt(m)];
        for (int i = 0; i < s.length; i++) s[i] = Letters.randChar();
        return String.valueOf(s);
    }

    public static char randChar(int... x) {
        x = x.length < 1 ? new int[]{97, 122} : x;
        return Character.toChars((int) Math.floor(Math.random() * (x[1] - x[0] + 1)) + x[0])[0];
    }

    public static int randInt(int... x) {
        x = x.length < 2 ? new int[]{6, 8} : x;
        return (int) Math.floor(Math.random() * (x[1] - x[0] + 1)) + x[0];
    }
}