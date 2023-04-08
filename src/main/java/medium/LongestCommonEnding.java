package medium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class LongestCommonEnding {


    public static String longestCommonEnding(String str1, String str2) {
        List<String> common = new ArrayList<>();
        for (int i = 0; i < str2.length(); i++) {
            if (str1.endsWith(str2.substring(i))) {
                common.add(str2.substring(i));
            }
        }
        return common.size() > 0 ? common.stream().max(Comparator.comparingInt(String::length)).get() : "";
    }


    @Test
    public void test1() {
        assertEquals("tiful", longestCommonEnding("pitiful", "beautiful"));
    }

    @Test
    public void test2() {
        assertEquals("ck", longestCommonEnding("truck", "trick"));
    }

    @Test
    public void test3() {
        assertEquals("ote", longestCommonEnding("vote", "asymptote"));
    }

    @Test
    public void test4() {
        assertEquals("ation", longestCommonEnding("multiplication", "ration"));
    }

    @Test
    public void test5() {
        assertEquals("tent", longestCommonEnding("potent", "tent"));
    }

    @Test
    public void test6() {
        assertEquals("", longestCommonEnding("skyscraper", "carnivore"));
    }
}
