package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FirstNVowels {

    public static String firstNVowels(String str, int n) {
        String vowels = str.replaceAll("[^aeiou]", "");
        return vowels.length() >= n ? vowels.substring(0, n) : "invalid";
    }

    @Test
    public void test1() {
        assertEquals("aei", firstNVowels("sharpening skills", 3));
    }

    @Test
    public void test2() {
        assertEquals("aoeau", firstNVowels("major league", 5));
    }

    @Test
    public void test3() {
        assertEquals("aa", firstNVowels("crabby patty", 2));
    }

    @Test
    public void test4() {
        assertEquals("i", firstNVowels("shrimp", 1));
    }

    @Test
    public void test5() {
        assertEquals("invalid", firstNVowels("shrimpy", 2));
    }

    @Test
    public void test6() {
        assertEquals("invalid", firstNVowels("hostess", 5));
    }

}
