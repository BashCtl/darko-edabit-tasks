package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class SortByLength {

    public static String sortByLength(String str) {
        return Arrays.stream(str.split(" "))
                .sorted(new MyComparator())
                .collect(Collectors.joining(" "));
    }

    static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() == s2.length()) {
                return s1.compareToIgnoreCase(s2);
            }
            return -1;
        }
    }

    @Test
    public void test1() {
        assertEquals("my Hello friend", sortByLength("Hello my friend"));
    }

    @Test
    public void test2() {
        assertEquals("a if of are can two dead keep them Three secret,", sortByLength("Three can keep a secret, if two of them are dead"));
    }

    @Test
    public void test3() {
        assertEquals("be is or To to be, not the that question.", sortByLength("To be or not to be, that is the question."));
    }

    @Test
    public void test4() {
        assertEquals("a I have dream", sortByLength("I have a dream"));
    }

    @Test
    public void test5() {
        assertEquals("is end the This", sortByLength("This is the end"));
    }

}
