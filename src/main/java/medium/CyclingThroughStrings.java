package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CyclingThroughStrings {

    public static String stringCycling(String a, String b) {
        int i = 0;
        int j = 0;
        StringBuilder result = new StringBuilder();
        while (j < b.length()) {
            if (i == a.length()) {
                i = 0;
            }
            result.append(a.charAt(i));
            j++;
            i++;
        }
        return result.toString();
    }

    @Test
    public void test01() {
        assertEquals("abcab", stringCycling("abc", "hello"));
    }

    @Test
    public void test02() {
        assertEquals("progra", stringCycling("programming", "edabit"));
    }

    @Test
    public void test03() {
        assertEquals("hahahahahaha", stringCycling("ha", "good morning"));
    }

    @Test
    public void test04() {
        assertEquals("      ", stringCycling(" ", "python"));
    }

    @Test
    public void test05() {
        assertEquals("the q", stringCycling("the quick brown fox jumps over the lazy dog", "abcde"));
    }

    @Test
    public void test06() {
        assertEquals("the world in me evolves", stringCycling("the world in me evolves in hers", "i love Tesh, so much so"));
    }

    @Test
    public void test07() {
        assertEquals("a thing of beauty", stringCycling("a thing of beauty is a joy forever", "indulge me surely"));
    }

    @Test
    public void test08() {
        assertEquals("toto", stringCycling("to", "hide"));
    }

    @Test
    public void test09() {
        assertEquals("such a feeling c", stringCycling("such a feeling coming over me", "top of the world"));
    }
    
}
