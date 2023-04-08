package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class ExtendVowels {
    //aeiou
    public static String extendVowels(String w, int n) {
        return n < 0 ? "invalid" :
                Arrays.stream(w.split("")).map(x -> {
                    if (Pattern.compile("[aeiouAEIOU]")
                            .matcher(x).matches()) {
                        return String.join("", Collections.nCopies(n + 1, x));
                    }
                    return x;
                }).collect(Collectors.joining());
    }


    @Test
    public void test01() {
        assertEquals("Teeeeeeshaaaaaa", extendVowels("Tesha", 5));
    }

    @Test
    public void test02() {
        assertEquals("Looooveeees", extendVowels("Loves", 3));
    }

    @Test
    public void test03() {
        assertEquals("Xaaaaaaaviiiiiiieeeeeeer", extendVowels("Xavier", 6));
    }

    @Test
    public void test04() {
        assertEquals("Heeeeeelloooooo", extendVowels("Hello", 5));
    }

    @Test
    public void test05() {
        assertEquals("EEEEdaaaabiiiit", extendVowels("Edabit", 3));
    }

    @Test
    public void test06() {
        assertEquals("Extend", extendVowels("Extend", 0));
    }

    @Test
    public void test07() {
        assertEquals("invalid", extendVowels("Shorten", -3));
    }

    @Test
    public void test08() {
        assertEquals("Teeeeesh", extendVowels("Tesh", 4));
    }

    @Test
    public void test09() {
        assertEquals("Feels", extendVowels("Feels", 0));
    }

    @Test
    public void test10() {
        assertEquals("Deeeeeeeeeep", extendVowels("Deep", 4));
    }

    @Test
    public void test11() {
        assertEquals("invalid", extendVowels("Concise", -5));
    }

    @Test
    public void test12() {
        assertEquals("Woooooooorld", extendVowels("World", 7));
    }

    @Test
    public void test13() {
        assertEquals("Coooodiiiing", extendVowels("Coding", 3));
    }

    @Test
    public void test14() {
        assertEquals("Waaaiiitiiing", extendVowels("Waiting", 2));
    }
}
