package hard;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratingWordsFromNames {

    public static boolean anagram(String name, String[] words) {
        Map<String, Long> namesMap = Arrays.stream(name.replaceAll("\\s+", "").toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> wordsMap = Arrays.stream(words).flatMap(w -> Arrays.stream(w.split("")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return namesMap.equals(wordsMap);
    }


    @Test
    public void test01() {
        assertEquals(true, anagram("Tesha Xavier", new String[]{"six", "have", "rate"}));
    }

    @Test
    public void test02() {
        assertEquals(true, anagram("Natalie Portman", new String[]{"ornamental", "pita"}));
    }

    @Test
    public void test03() {
        assertEquals(true, anagram("Graham Norton", new String[]{"graham", "not", "nor"}));
    }

    @Test
    public void test04() {
        assertEquals(true, anagram("Emma Watson", new String[]{"mows", "meant", "a"}));
    }

    @Test
    public void test05() {
        assertEquals(true, anagram("Daniel Radcliffe", new String[]{"clarified", "elf", "and"}));
    }

    @Test
    public void test06() {
        assertEquals(true, anagram("Tom Hiddleston", new String[]{"tenths", "mood", "lid"}));
    }

    @Test
    public void test07() {
        assertEquals(true, anagram("Blake Lively", new String[]{"key", "veal", "bill"}));
    }

    @Test
    public void test08() {
        assertEquals(true, anagram("Ryan Reynolds", new String[]{"yonder", "sly", "ran"}));
    }

    @Test
    public void test09() {
        assertEquals(true, anagram("Kristen Stewart", new String[]{"trinkets", "war", "set"}));
    }

    @Test
    public void test10() {
        assertEquals(true, anagram("Justin Bieber", new String[]{"injures", "ebb", "it"}));
    }

    @Test
    public void test11() {
        assertEquals(false, anagram("Chris Pratt", new String[]{"chirps", "rat"}));
    }

    @Test
    public void test12() {
        assertEquals(false, anagram("Jeff Goldblum", new String[]{"jog", "meld", "bluffs"}));
    }

    @Test
    public void test13() {
        assertEquals(false, anagram("Taylor Swift", new String[]{"stratify", "ow"}));
    }

    @Test
    public void test14() {
        assertEquals(false, anagram("Adam Levine", new String[]{"medieval", "man"}));
    }

    @Test
    public void test15() {
        assertEquals(false, anagram("Blake Shelton", new String[]{"betoken", "all", "she"}));
    }

    @Test
    public void test16() {
        assertEquals(false, anagram("Miley Cyrus", new String[]{"lyric", "my", "suer"}));
    }

    @Test
    public void test17() {
        assertEquals(false, anagram("Matt Damon", new String[]{"madman"}));
    }

    @Test
    public void test18() {
        assertEquals(false, anagram("Graham Norton", new String[]{"graham", "not", "or"}));
    }

}
