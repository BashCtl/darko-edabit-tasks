package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class CountSpecificDigit {

    public static int digitOccurrences(int min, int max, int digit) {
        String strDigits = IntStream.rangeClosed(min, max).mapToObj(String::valueOf)
                .collect(Collectors.joining());
        return (int) Arrays.stream(strDigits.split(""))
                .filter(x -> x.contains(String.valueOf(digit)))
                .count();

    }

    @Test
    public void test1() {
        assertEquals(6, digitOccurrences(51, 55, 5));
    }

    @Test
    public void test2() {
        assertEquals(0, digitOccurrences(1, 8, 9));
    }

    @Test
    public void test3() {
        assertEquals(1, digitOccurrences(71, 77, 2));
    }

    @Test
    public void test4() {
        assertEquals(2, digitOccurrences(1, 14, 4));
    }

    @Test
    public void test5() {
        assertEquals(11, digitOccurrences(20, 30, 2));
    }

    @Test
    public void test6() {
        assertEquals(10, digitOccurrences(18, 37, 3));
    }

    @Test
    public void test7() {
        assertEquals(63, digitOccurrences(5, 335, 6));
    }

    @Test
    public void test8() {
        assertEquals(3, digitOccurrences(-19, 19, 0));
    }

    @Test
    public void test9() {
        assertEquals(1, digitOccurrences(-8, -1, 8));
    }

    @Test
    public void test10() {
        assertEquals(0, digitOccurrences(-5, -5, 4));
    }

    @Test
    public void test11() {
        assertEquals(1, digitOccurrences(-5, -5, 5));
    }

    @Test
    public void test12() {
        assertEquals(5, digitOccurrences(-50, -45, 4));
    }

    @Test
    public void test13() {
        assertEquals(190, digitOccurrences(-500, -45, 4));
    }

}
