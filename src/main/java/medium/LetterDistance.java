package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LetterDistance {

    public static int letterDistance(String str1, String str2) {
        int limit = Math.min(str1.length(), str2.length());
        int diff = 0;
        for (int i = 0; i < limit; i++) {
            diff += Math.abs(str1.charAt(i) - str2.charAt(i));
        }
        return str1.length() != str2.length() ? diff + Math.abs(str1.length() - str2.length()) : diff;
    }

    @Test
    public void test1() {
        assertEquals(11,letterDistance("house", "fly"));
    }

    @Test
    public void test2() {
        assertEquals(1,letterDistance("sharp", "sharq"));
    }

    @Test
    public void test3() {
        assertEquals(5,letterDistance("abcde", "bcdef"));
    }

    @Test
    public void test4() {
        assertEquals(4,letterDistance("abcde", "a"));
    }

    @Test
    public void test5() {
        assertEquals(8,letterDistance("abcde", "e"));
    }

    @Test
    public void test6() {
        assertEquals(32,letterDistance("abcde", "Abcde"));
    }

    @Test
    public void test7() {
        assertEquals(36,letterDistance("abcde", "A"));
    }

    @Test
    public void test8() {
        assertEquals(67,letterDistance("very", "fragile"));
    }
}
