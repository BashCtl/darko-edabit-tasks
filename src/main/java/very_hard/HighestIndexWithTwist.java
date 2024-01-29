package very_hard;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Highest Index (With a Twist)

Given a name, return the letter with the highest index in alphabetical order,
with its corresponding index, in the form of a string.
You are prohibited to use max() nor is reassigning a value to the alphabet array.

Examples
alphabet = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]


alphabetIndex(alphabet, "Xavier") ➞ "24x"

alphabetIndex(alphabet, "Tesha") ➞ "20t"

alphabetIndex(alphabet, "Andrey") ➞ "25y"

 */
public class HighestIndexWithTwist {

    public static String alphabetIndex(String[] alphabet, String s) {
        s = s.toLowerCase();
        int max = -1;
        String letter = "";
        List<String> alpha = Arrays.asList(alphabet);
        for (int i = 0; i < s.length(); i++) {
            String tempLetter = String.valueOf(s.charAt(i));
            int index = alpha.indexOf(tempLetter);
            if (index > max) {
                max = index + 1;
                letter = tempLetter;
            }
        }
        return String.format("%s%s", max, letter);

    }

    @Test
    public void test01() {
        assertEquals("19s", alphabetIndex(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Oscar"));
    }

    @Test
    public void test02() {
        assertEquals("21u", alphabetIndex(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Lucas"));
    }

    @Test
    public void test03() {
        assertEquals("18r", alphabetIndex(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Marko"));
    }

    @Test
    public void test04() {
        assertEquals("25y", alphabetIndex(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Esley"));
    }

    @Test
    public void test05() {
        assertEquals("18r", alphabetIndex(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Rogei"));
    }

    @Test
    public void test06() {
        assertEquals("19s", alphabetIndex(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Nicolas"));
    }

    @Test
    public void test07() {
        assertEquals("22v", alphabetIndex(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Flavio"));
    }

    @Test
    public void test08() {
        assertEquals("25y", alphabetIndex(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Andrey"));
    }

    @Test
    public void test09() {
        assertEquals("15o", alphabetIndex(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Hello"));
    }

    @Test
    public void test10() {
        assertEquals("20t", alphabetIndex(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Tesha"));
    }

    @Test
    public void test11() {
        assertEquals("24x", alphabetIndex(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Xavier"));
    }

}
