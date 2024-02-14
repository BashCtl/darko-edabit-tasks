package very_hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
Longest Substring with Non-repeating Characters

Write a function that returns the longest non-repeating substring for a string input.

Examples
longestNonrepeatingSubstring("abcabcbb") ➞ "abc"

longestNonrepeatingSubstring("aaaaaa") ➞ "a"

longestNonrepeatingSubstring("abcde") ➞ "abcde"

longestNonrepeatingSubstring("abcda") ➞ "abcd"

Notes
If multiple substrings tie in length, return the one which occurs first.

 */


public class LongestSubstringNonRepeatingCharacters {

    public static String longestNonrepeatingSubstring(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            StringBuilder temp = new StringBuilder(String.valueOf(str.charAt(i)));
            for (int j = i + 1; j < str.length(); j++) {
                if (!temp.toString().contains(String.valueOf(str.charAt(j)))) {
                    temp.append(str.charAt(j));
                } else {
                    break;
                }
            }
            if (temp.length() > result.length()) {
                result = temp;
            }
        }

        return result.toString();
    }


    @Test
    public void test1() {
        assertEquals("abc", longestNonrepeatingSubstring("abcabcbb"));
    }

    @Test
    public void test2() {
        assertEquals("a", longestNonrepeatingSubstring("aaaaaa"));
    }

    @Test
    public void test3() {
        assertEquals("abcde", longestNonrepeatingSubstring("abcde"));
    }

    @Test
    public void test4() {
        assertEquals("abcd", longestNonrepeatingSubstring("abcda"));
    }

    @Test
    public void test5() {
        assertEquals("ac", longestNonrepeatingSubstring("aaccddeeffb"));
    }

    @Test
    public void test6() {
        assertEquals("abd", longestNonrepeatingSubstring("abdde"));
    }

    @Test
    public void test7() {
        assertEquals("cd", longestNonrepeatingSubstring("ccdddcccc"));
    }

    @Test
    public void test8() {
        assertEquals("cdx", longestNonrepeatingSubstring("cdxdxccxc"));
    }

    @Test
    public void test9() {
        assertEquals("defgh", longestNonrepeatingSubstring("abddefgh"));
    }

    @Test
    public void test10() {
        assertEquals("abcd", longestNonrepeatingSubstring("abcdabcd"));
    }

    @Test
    public void test11() {
        assertEquals("debc", longestNonrepeatingSubstring("abddebcc"));
    }

    @Test
    public void test12() {
        assertEquals("xyz", longestNonrepeatingSubstring("xyxxyzyzy"));
    }

    @Test
    public void test13() {
        assertEquals("lmjsde", longestNonrepeatingSubstring("kjlmjsdeee"));
    }

    @Test
    public void test14() {
        assertEquals("lmjsdfew", longestNonrepeatingSubstring("kjlmjsdfew"));
    }

    @Test
    public void test15() {
        assertEquals("lmjsdfewi", longestNonrepeatingSubstring("kjlmjsdfewii"));
    }

    @Test
    public void test16() {
        assertEquals("idfew", longestNonrepeatingSubstring("kjlmjjiiiidfewii"));
    }

    @Test
    public void test17() {
        assertEquals("kjlm", longestNonrepeatingSubstring("kjlmjjiiiidfiwii"));
    }

}
