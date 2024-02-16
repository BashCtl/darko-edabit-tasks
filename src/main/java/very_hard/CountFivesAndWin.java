package very_hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/*
Count 5s And Win

Arun is obsessed with primes, especially five. He considers a number
to be luckiest if it has the highest number of five in it.
If two numbers have the same frequency of five, Arun considers the larger of them to be luckiest,
and if there is no five in any number, the first given number is considered luckiest. Help him choose the luckiest number.

Examples
getLuckiest([-544, 666, -645, -445]) ➞ -445

getLuckiest([5, 12, 55, 11]) ➞ 55

getLuckiest([5, 12, -55,  11]) ➞ -55

getLuckiest([515, 1255, -55,  1]) ➞ 1255

getLuckiest([44, 12, 7, 40]) ➞ 44

Notes
Return 0 if given an empty array.


 */
public class CountFivesAndWin {

    public static int getLuckiest(int[] r) {
        if (r.length == 0) {
            return 0;
        }
        Map<Integer, Long> numFives = Arrays.stream(r).boxed()
                .filter(num -> String.valueOf(num).contains("5"))
                .collect(Collectors.toMap(num -> num,
                        num -> Arrays.stream(String.valueOf(Math.abs(num)).split(""))
                                .filter(x -> x.equals("5")).count()));
        if (numFives.isEmpty()) {
            return r[0];
        }
        Long maxValue = Collections.max(numFives.entrySet(), Map.Entry.comparingByValue()).getValue();
        List<Integer> keys = numFives.entrySet().stream()
                .filter(e -> e.getValue() == maxValue)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        return Collections.max(keys);
    }

    @Test
    public void test01() {
        assertEquals(-445, getLuckiest(new int[]{-544, 666, -645, -445}));
    }

    @Test
    public void test02() {
        assertEquals(0, getLuckiest(new int[]{}));
    }

    @Test
    public void test03() {
        assertEquals(-55, getLuckiest(new int[]{-55, -155, 45, 31, 67}));
    }

    @Test
    public void test04() {
        assertEquals(55, getLuckiest(new int[]{5, 12, 55, 11}));
    }

    @Test
    public void test05() {
        assertEquals(-55, getLuckiest(new int[]{5, 12, -55, 11}));
    }

    @Test
    public void test06() {
        assertEquals(1255, getLuckiest(new int[]{515, 1255, -55, 1}));
    }

    @Test
    public void test07() {
        assertEquals(44, getLuckiest(new int[]{44, 12, 7, 40}));
    }

    @Test
    public void test08() {
        assertEquals(-1, getLuckiest(new int[]{-1, -43, -67, 3}));
    }
}
