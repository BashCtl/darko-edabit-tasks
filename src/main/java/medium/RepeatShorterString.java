package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RepeatShorterString {

    public static String lengthen(String str1, String str2) {
        String strShort = str1.length() > str2.length() ? str2 : str1;
        String strLong = str1.length() > str2.length() ? str1 : str2;
        StringBuilder result = new StringBuilder();
          point:  while(true) {
                for (String s : strShort.split("")) {
                    result.append(s);
                    if (result.length() == strLong.length()) {
                        break point;
                    }
                }
            }
        return result.toString();
    }

    @Test
    public void test1() {
        assertEquals("abababa", lengthen("abcdefg", "ab"));
    }

    @Test
    public void test2() {
        assertEquals("forestfo", lengthen("ingenius", "forest"));
    }

    @Test
    public void test3() {
        assertEquals("clapclap", lengthen("skipping", "clap"));
    }

    @Test
    public void test4() {
        assertEquals("kkkkkkkkk", lengthen("k", "champagne"));
    }

    @Test
    public void test5() {
        assertEquals("DUHDUHDUH", lengthen("DUH", "champagne"));
    }

}
