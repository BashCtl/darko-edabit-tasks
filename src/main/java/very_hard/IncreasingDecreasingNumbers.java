package very_hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/*

Increasing or Decreasing Numbers

Tesh needs your help to find out the increasing or decreasing numbers for a given range.

Increasing Numbers
Numbers whose digits, when read from left to right, are never less than
the previous digit. See below some examples of increasing numbers:

1111
123456
125788999

Decreasing Numbers
Numbers whose digits, when read from left to right, are never greater
than the previous digit. See below some examples of decreasing numbers:

1111
654321
999887521

Create a function that takes a number n and returns total occurrences of all
the increasing or decreasing numbers in the range 1 - 10^n.

Examples
incDec(0) ➞ 1
// 10^0 = 1
// 1 is both increasing and decreasing.

incDec(1) ➞ 10
// 10^1 = 10
// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] are both increasing and decreasing numbers.

incDec(3) ➞ 475

Notes
To make it even clear, the increasing or decreasing numbers in range 101-200 are:

110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 122, 123, 124, 125, 126, 127, 128, 129, 133, 134,
135, 136, 137, 138, 139, 144, 145, 146, 147, 148, 149, 155, 156, 157, 158, 159, 166, 167, 168, 169,
177, 178, 179, 188, 189, 199, 200

The total will be 47 in this case.
 */
public class IncreasingDecreasingNumbers {

    public static List<Integer> listDigits(int number) {
        return Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());
    }

    public static List<Integer> sortArray(List<Integer> list, boolean isDescending) {
        Collections.sort(list);
        if (isDescending) {
            Collections.reverse(list);
        }
        return list;
    }

    public static int incDec(int n) {
        return (int) IntStream.rangeClosed(1, (int) Math.pow(10, n))
                .filter(number -> listDigits(number).equals(sortArray(listDigits(number), false)) ||
                        listDigits(number).equals(sortArray(listDigits(number), true))).boxed().count();

    }


    @Test
    public void test01() {
        assertEquals(1, incDec(0));
    }

    @Test
    public void test02() {
        assertEquals(10, incDec(1));
    }

    @Test
    public void test03() {
        assertEquals(100, incDec(2));
    }

    @Test
    public void test04() {
        assertEquals(475, incDec(3));
    }

    @Test
    public void test05() {
        assertEquals(1675, incDec(4));
    }

    @Test
    public void test06() {
        assertEquals(4954, incDec(5));
    }

    @Test
    public void test07() {
        assertEquals(12952, incDec(6));
    }

}
