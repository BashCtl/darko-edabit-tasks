package medium;

import org.testng.annotations.Test;

import java.util.regex.Pattern;

import static org.testng.Assert.assertEquals;

public class Functioninator8000 {

    public static String inatorInator(String inv) {
        boolean matches = Pattern.compile("(.+)?[aeiouAEIOU]$").matcher(inv).matches();
        String ends = matches ? "-inator" : "inator";
        return String.format("%s%s %d000", inv, ends, inv.length());
    }

    @Test
    public void test1() {
        assertEquals("Shrinkinator 6000", inatorInator("Shrink"));
    }

    @Test
    public void test2() {
        assertEquals("Doominator 4000", inatorInator("Doom"));
    }

    @Test
    public void test3() {
        assertEquals("EvilClone-inator 9000", inatorInator("EvilClone"));
    }

    @Test
    public void test4() {
        assertEquals("Destroyinator 7000", inatorInator("Destroy"));
    }

    @Test
    public void test5() {
        assertEquals("a-inator 1000", inatorInator("a"));
    }

    @Test
    public void test6() {
        assertEquals("Shrekinator 5000", inatorInator("Shrek"));
    }

    @Test
    public void test7() {
        assertEquals("bEE-inator 3000", inatorInator("bEE"));
    }

    @Test
    public void test8() {
        assertEquals("CAPITALISE-inator 10000", inatorInator("CAPITALISE"));
    }
}
