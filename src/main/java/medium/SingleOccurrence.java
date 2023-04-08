package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class SingleOccurrence {

    public static String singleOccurrence(String str) {
        str = str.toUpperCase();
        String[] split = str.split("");
        String collectString = Arrays.stream(split)
                .filter(letter -> Collections.frequency(Arrays.asList(split), letter) == 1)
                .collect(Collectors.joining());
        return collectString;
    }

    @Test
    public void test01() {
        assertEquals("T", singleOccurrence("TeEsShHAa"));
    }

    @Test
    public void test02() {
        assertEquals("L", singleOccurrence("LoOOvvVEEssS"));
    }

    @Test
    public void test03() {
        assertEquals("D", singleOccurrence("DeEPp"));
    }

    @Test
    public void test04() {
        assertEquals("C", singleOccurrence("EFFEAABbc"));
    }

    @Test
    public void test05() {
        assertEquals("V", singleOccurrence("AAAAVNNNNSS"));
    }

    @Test
    public void test06() {
        assertEquals("S", singleOccurrence("S"));
    }

    @Test
    public void test07() {
        assertEquals("", singleOccurrence(""));
    }

    @Test
    public void test08() {
        assertEquals("D", singleOccurrence("eEDABITaebiT"));
    }

    @Test
    public void test09() {
        assertEquals("I", singleOccurrence("iSs"));
    }

    @Test
    public void test10() {
        assertEquals("G", singleOccurrence("GOODd"));
    }

}
