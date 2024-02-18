package very_hard;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/*

Recursion: N-Length Letter Groups


Write a function that returns an array of strings populated
from the slices of n-length characters of the given word
(a slice after another while n-length applies onto the word).

Examples
collect("intercontinentalisationalism", 6)
➞ ["ationa", "interc", "ntalis", "ontine"]

collect("strengths", 3)
➞ ["eng", "str", "ths"]

collect("pneumonoultramicroscopicsilicovolcanoconiosis", 15)
➞ ["croscopicsilico", "pneumonoultrami", "volcanoconiosis"]

Notes
Ensure that the resulting array is lexicographically ordered.
Return an empty array if the given string is less than n.
You are expected to solve this challenge via a recursive approach.

 */
public class RecursionNLengthLetterGroup {

    public static String[] collect(String s, int n, String... result) {
        if (s.length() < n && result.length == 0) {
            return new String[]{};
        }

        if (result.length == 0) {
            result = new String[(s.length() / n) + 1];
            result[0] = "0";
        }

        if (s.length() < n) {
            return Arrays.stream(result, 1, result.length)
                    .sorted()
                    .toArray(String[]::new);
        }
        int currentIndex = Integer.parseInt(result[0]);
        ++currentIndex;
        result[currentIndex] = s.substring(0, n);

        result[0] = String.valueOf(currentIndex);
        return collect(s.substring(n), n, result);

    }


    @Test
    public void test01() {
        assertArrayEquals(new String[]{"ationa", "interc", "ntalis", "ontine"}, collect("intercontinentalisationalism", 6));
    }

    @Test
    public void test02() {
        assertArrayEquals(new String[]{"eng", "str", "ths"}, collect("strengths", 3));
    }

    @Test
    public void test03() {
        assertArrayEquals(new String[]{"croscopicsilico", "pneumonoultrami", "volcanoconiosis"}, collect("pneumonoultramicroscopicsilicovolcanoconiosis", 15));
    }

    @Test
    public void test04() {
        assertArrayEquals(new String[]{"aphi", "call", "cogr", "lexi"}, collect("lexicographically", 4));
    }

    @Test
    public void test05() {
        assertArrayEquals(new String[]{"anesth", "esiolo"}, collect("anesthesiologists", 6));
    }

    @Test
    public void test06() {
        assertArrayEquals(new String[]{"matogl", "subder"}, collect("subdermatoglyphic", 6));
    }

    @Test
    public void test07() {
        assertArrayEquals(new String[]{"pedali", "sesqui"}, collect("sesquipedalianism", 6));
    }

    @Test
    public void test08() {
        assertArrayEquals(new String[]{"ect", "ion", "oll", "rec"}, collect("recollection", 3));
    }

    @Test
    public void test09() {
        assertArrayEquals(new String[]{"hyroidi", "poparat", "pseudop", "seudohy"}, collect("pseudopseudohypoparathyroidism", 7));
    }

    @Test
    public void test10() {
        assertArrayEquals(new String[]{"at", "ci", "fl", "ic", "if", "ih", "il", "il", "in", "io", "ip", "na", "oc", "uc"}, collect("floccinaucinihilipilification", 2));
    }

    @Test
    public void test11() {
        assertArrayEquals(new String[]{"ablis", "antid", "arian", "hment", "isest"}, collect("antidisestablishmentarianism", 5));
    }

    @Test
    public void test12() {
        assertArrayEquals(new String[]{"ali", "ali", "doc", "erc", "fra", "gil", "ice", "iou", "ist", "sup", "xpi"}, collect("supercalifragilisticexpialidocious", 3));
    }

    @Test
    public void test13() {
        assertArrayEquals(new String[]{"ensibilit", "incompreh"}, collect("incomprehensibilities", 9));
    }

    @Test
    public void test14() {
        assertArrayEquals(new String[]{"astr", "ophy", "sici"}, collect("astrophysicists", 4));
    }

    @Test
    public void test15() {
        assertArrayEquals(new String[]{"honorificabi", "litudinitati"}, collect("honorificabilitudinitatibus", 12));
    }

    @Test
    public void test16() {
        assertArrayEquals(new String[]{"unimagin"}, collect("unimaginatively", 8));
    }

    @Test
    public void test17() {
        assertArrayEquals(new String[]{}, collect("euouae", 7));
    }

    @Test
    public void test18() {
        assertArrayEquals(new String[]{"tsktsk"}, collect("tsktsk", 6));
    }

    @Test
    public void test19() {
        assertArrayEquals(new String[]{"uncopyright"}, collect("uncopyrightable", 11));
    }

    @Test
    public void test20() {
        assertArrayEquals(new String[]{"har", "ing", "pen", "tes"}, collect("tesharpening", 3));
    }


    @Test
    public void test21() {
        assertArrayEquals(new String[]{"holic", "tesha"}, collect("teshaholic", 5));
    }


}
