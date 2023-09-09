package hard;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class FindAnagramStringInAnotherString {

    public static boolean anaStrStr(String needle, String haystack) {

        return permutation(needle, haystack, "");

    }

    public static boolean permutation(String needle, String haystack, String combination) {
        if (needle.length() == 0) {
            Pattern pattern = Pattern.compile(combination);
            Matcher matcher = pattern.matcher(haystack);
            return matcher.find();
        }
        for (int i = 0; i < needle.length(); i++) {
            char ch = needle.charAt(i);
            String ros = needle.substring(0, i) + needle.substring(i + 1);

            boolean result = permutation(ros, haystack, combination + ch);
            if (result) {
                return result;
            }
        }
        return false;
    }

    @Test
    public void test1() {
        assertEquals(true, anaStrStr("car", "race"));
    }

    @Test
    public void test2() {
        assertEquals(true, anaStrStr("nod", "done"));
    }

    @Test
    public void test3() {
        assertEquals(false, anaStrStr("bag", "grab"));
    }

    @Test
    public void test4() {
        assertEquals(true, anaStrStr("sap", "spatula"));
    }

    @Test
    public void test5() {
        assertEquals(false, anaStrStr("sat", "spatula"));
    }

    @Test
    public void test6() {
        assertEquals(true, anaStrStr("vein", "universal"));
    }

    @Test
    public void test7() {
        assertEquals(false, anaStrStr("salt", "universal"));
    }

    @Test
    public void test8() {
        assertEquals(true, anaStrStr("roast", "pastoral"));
    }

    @Test
    public void test9() {
        assertEquals(false, anaStrStr("altar", "pastoral"));
    }

}
