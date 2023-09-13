package hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class StarShorthand {

    public static String toStarShorthand(String str) {
        List<String> symbols = Arrays.stream(str.split("")).collect(Collectors.toList());
        return symbols.stream()
                .distinct()
                .map(s -> Collections.frequency(symbols, s) > 1 ? s + "*" + Collections.frequency(symbols, s) : s)
                .collect(Collectors.joining());
    }


    @Test
    public void test1() {
        assertEquals("ab*2c*3", toStarShorthand("abbccc"));
    }

    @Test
    public void test2() {
        assertEquals("ha*4p*2y*5", toStarShorthand("haaaappyyyyy"));
    }

    @Test
    public void test3() {
        assertEquals("7*5gef*2", toStarShorthand("77777geff"));
    }

    @Test
    public void test4() {
        assertEquals("1*22*23*24*2", toStarShorthand("11223344"));
    }

    @Test
    public void test5() {
        assertEquals("abc", toStarShorthand("abc"));
    }

    @Test
    public void test6() {
        assertEquals("", toStarShorthand(""));
    }

}
