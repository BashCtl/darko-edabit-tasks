package very_hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
Reverse the String (with a catch)

Create a function that takes a string and returns the reversed string.
However there's a few rules to follow in order to make the challenge interesting:

The UPPERCASE/lowercase positions must be kept in the same order as the original string (see example #1 and #2).
Spaces must be kept in the same order as the original string (see example #3).
Examples
specialReverseString("Edabit") ➞ "Tibade"

specialReverseString("UPPER lower") ➞ "REWOL reppu"

specialReverseString("1 23 456") ➞ "6 54 321"

 */
public class ReverseStringWithCatch {

    public static String specialReverseString(String str) {
        List<String> strings = Arrays.stream(str.split("")).collect(Collectors.toList());
        List<String> finalStrings = strings;
        List<Integer> spaceIndexes = IntStream.range(0, strings.size()).filter(i -> finalStrings.get(i).equals(" "))
                .boxed().collect(Collectors.toList());

        strings = strings.stream().filter(l -> !l.equals(" ")).collect(Collectors.toList());
        int lastIndex = strings.size() - 1;
        for (int i = 0; i < strings.size() / 2; i++) {
            String first = strings.get(i);
            String last = strings.get(lastIndex - i);

            strings.set(i, first.toUpperCase().equals(first) && Character.isAlphabetic(first.charAt(0)) ? last.toUpperCase() : last.toLowerCase());
            strings.set(lastIndex - i, last.toUpperCase().equals(last) && Character.isAlphabetic(last.charAt(0)) ? first.toUpperCase() : first.toLowerCase());
        }
        strings = strings.stream().filter(l -> !l.equals(" ")).collect(Collectors.toList());
        for (int i : spaceIndexes) {
            strings.add(i, " ");
        }

        return String.join("", strings);
    }

    @Test
    public void test1() {
        assertEquals("Tibade", specialReverseString("Edabit"));
    }

    @Test
    public void test2() {
        assertEquals("REWOL reppu", specialReverseString("UPPER lower"));
    }

    @Test
    public void test3() {
        assertEquals("6 54 321", specialReverseString("1 23 456"));
    }

    @Test
    public void test4() {
        assertEquals("!dlro Wolleh", specialReverseString("Hello World!"));
    }

    @Test
    public void test5() {
        assertEquals("?ysiadg odru oys 'erehw", specialReverseString("Where's your dog Daisy?"));
    }

    @Test
    public void test6() {
        assertEquals("Stee hsely tsgn IDA csacs Naemsscta Htnwo Nks'ti", specialReverseString("It's known that CSS means Cascading Style Sheets"));
    }
}
