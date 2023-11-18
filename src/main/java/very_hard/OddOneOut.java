package very_hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/*
Odd One Out

Write a function that returns true if exactly one word in the array differs
in length from the rest. Return false in all other cases.

Examples
oddOneOut(["silly", "mom", "let", "the"]) ➞ true

oddOneOut(["swanky", "rhino", "moment"]) ➞ true

oddOneOut(["the", "them", "theme"]) ➞ false

oddOneOut(["very", "to", "an", "some"]) ➞ false
Notes
The length of the array will always have at least three or more words.

 */

public class OddOneOut {

    public static boolean oddOneOut(String[] arr) {
        Map<Integer, Long> stringCount = Arrays.stream(arr)
                .map(String::length).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return stringCount.values().stream().filter(c -> c == 1).count() == 1;
    }

    @Test
    public void test1() {
        assertEquals(true, oddOneOut(new String[]{"silly", "mom", "let", "the"}));
    }

    @Test
    public void test2() {
        assertEquals(true, oddOneOut(new String[]{"swanky", "rhino", "moment"}));
    }

    @Test
    public void test3() {
        assertEquals(false, oddOneOut(new String[]{"the", "them", "theme"}));
    }

    @Test
    public void test4() {
        assertEquals(false, oddOneOut(new String[]{"very", "to", "an", "some"}));
    }

    @Test
    public void test5() {
        assertEquals(true, oddOneOut(new String[]{"very", "to", "then", "some"}));
    }

}
