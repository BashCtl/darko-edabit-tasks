package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class CheckForAnagrams {

    public static boolean isAnagram(String s1, String s2) {
        char[] charArray1 = s1.toLowerCase().replaceAll("\\s+", "").toCharArray();
        char[] charArray2 = s2.toLowerCase().replaceAll("\\s+", "").toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return new String(charArray1).equals(new String(charArray2));

    }

    @Test
    public void test1() {
        assertEquals(true, isAnagram("cristian", "Cristina"));
    }

    @Test
    public void test2() {
        assertEquals(true, isAnagram("Dave Barry", "Ray Adverb"));
    }

    @Test
    public void test3() {
        assertEquals(false, isAnagram("Nope", "Note"));
    }

    @Test
    public void test4() {
        assertEquals(false, isAnagram("Apple", "Appeal"));
    }
}
