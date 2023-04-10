package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.testng.Assert.assertEquals;

public class CountNumberOfDuplicateCharacters {

    public static int duplicateCount(String str) {
        String[] strings = str.split("");
        return (int) Arrays.stream(strings).distinct()
                .filter(s -> Collections.frequency(Arrays.asList(strings), s) > 1)
                .count();
    }

    @Test
    public void test1() {
        assertEquals(0, duplicateCount("abcde"));
    }

    @Test
    public void test2() {
        System.out.println("Duplicate characters are case sensitive.");
        assertEquals(0, duplicateCount("Aa"));
    }

    @Test
    public void test3() {
        assertEquals(2, duplicateCount("aabbcde"));
    }

    @Test
    public void test4() {
        assertEquals(2, duplicateCount("aabbcdeB"));
    }

    @Test
    public void test5() {
        assertEquals(1, duplicateCount("indivisibility"));
    }

    @Test
    public void test6() {
        assertEquals(2, duplicateCount("Indivisibilities"));
    }

    @Test
    public void test7() {
        assertEquals(2, duplicateCount("aa1112"));
    }

    @Test
    public void test8() {
        assertEquals(1, duplicateCount("bb2c"));
    }

}
