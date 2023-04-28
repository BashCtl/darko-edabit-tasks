package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SplitStringBasedOnVowelsAndConsonants {

    public static String split(String str) {
        String v = str.replaceAll("[^aeiou]", "");
        String c = str.replaceAll("[aeiou]", "");
        return v + c;
    }

//    public static void main(String[] args) {
//        System.out.println(split("abcde"));
//        System.out.println(split("Hello!"));
//    }

    @Test
    public void test1() {
        assertEquals("aebcd", split("abcde"));
    }

    @Test
    public void test2() {
        assertEquals("eoHll!", split("Hello!"));
    }

    @Test
    public void test3() {
        assertEquals("aeieWht's th tm?", split("What's the time?"));
    }
}
