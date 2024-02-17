package very_hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.Assert.assertArrayEquals;

/*
Recursion: Reversed List Index

Write a recursive function that filters the items in an array (given as parameter arr) by positional parity (odd or even),
given as parameter par, starting from the opposite end. Return an array
of items on odd positions (... 5, 3, 1) or on even positions (... 6, 4, 2) and counting from the last item in the array.

Examples
getItemsAt([2, 4, 6, 8, 10], "odd") ➞ [2, 6, 10]
// 2, 6 & 10 occupy the 5th, 3rd and 1st positions from right.
// Odd positions, hence the parity, and from the opposite.

getItemsAt(['E', 'D', 'A', 'B', 'I', 'T'], "even") ➞ ['E', 'A', 'I']
// E, A and I occupy the 6th, 4th and 2nd positions from right.
// Even positions, hence the parity, and from the opposite.

getItemsAt([")", "(", "*", "&", "^", "%", "$", "#", "@", "!"]) ➞ [")", "*", ^", "$", "@"]

getItemsAt(["A", "R", "B", "I", "T", "R", "A", "R", "I", "L", "Y"], "even") ➞ ["R", "I", "R", "R", "L"]

Notes
IMPORTANT: You are advised to solve this challenge via a recursive approach, hence,
the very purpose of this challenge. You can check the Resources tab about a few topics on recursion.
Arrays are zero-indexed, so, index+1 = position or position-1 = index.
Items in the array may contain duplicates. See example #4.
The last item in the array is always the first item to start a positional count.
The sequence of the items in the resulting array should be retained (i.e. Example #1 - 6
should come after 2 and before 10, Example #2 - 'A' should come after 'E' and before 'I').

 */

public class RecursionReversedListIndex {


    public static Object[] getItemsAt(Object[] arr, String par, Object... result) {
        if (result.length == 0) {
            result = new Object[arr.length + 1];
            int index = par.equals("even") ? arr.length - 2 : arr.length - 1;
            result[0] = index;
        }
        int currentIndex = (int) result[0];
        if (currentIndex < 0) {
            return Arrays.stream(result, 1, result.length)
                    .filter(Objects::nonNull)
                    .toArray(Object[]::new);
        }

        result[currentIndex + 1] = arr[currentIndex];

        result[0] = (int) result[0] - 2;
        return getItemsAt(arr, par, result);

    }


    @Test
    public void test01() {
        assertArrayEquals(new Object[]{"E", "A", "I"}, getItemsAt(new Object[]{"E", "D", "A", "B", "I", "T"}, "even"));
    }

    @Test
    public void test02() {
        assertArrayEquals(new Object[]{"D", "B", "T"}, getItemsAt(new Object[]{"E", "D", "A", "B", "I", "T"}, "odd"));
    }

    @Test
    public void test03() {
        assertArrayEquals(new Object[]{"Q", "E", "T", "U", "O"}, getItemsAt(new Object[]{"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"}, "even"));
    }

    @Test
    public void test04() {
        assertArrayEquals(new Object[]{"O", "U", "T", "E", "Q"}, getItemsAt(new Object[]{"P", "O", "I", "U", "Y", "T", "R", "E", "W", "Q"}, "odd"));
    }

    @Test
    public void test05() {
        assertArrayEquals(new Object[]{"S", "F", "H", "K", "Z"}, getItemsAt(new Object[]{"A", "S", "D", "F", "G", "H", "J", "K", "L", "Z"}, "odd"));
    }

    @Test
    public void test06() {
        assertArrayEquals(new Object[]{"A", "D", "G", "J", "L"}, getItemsAt(new Object[]{"A", "S", "D", "F", "G", "H", "J", "K", "L", "Z"}, "even"));
    }

    @Test
    public void test07() {
        assertArrayEquals(new Object[]{4, 8}, getItemsAt(new Object[]{2, 4, 6, 8, 10}, "even"));
    }

    @Test
    public void test08() {
        assertArrayEquals(new Object[]{2, 4, 6, 8, 10}, getItemsAt(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, "odd"));
    }

    @Test
    public void test09() {
        assertArrayEquals(new Object[]{"@", "$", "^", "*", ")", "}"}, getItemsAt(new Object[]{"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "{", "}"}, "odd"));
    }

    @Test
    public void test10() {
        assertArrayEquals(new Object[]{"{", "(", "&", "%", "#", "!"}, getItemsAt(new Object[]{"}", "{", ")", "(", "*", "&", "^", "%", "$", "#", "@", "!"}, "odd"));
    }

    @Test
    public void test11() {
        assertArrayEquals(new Object[]{"O", "B", "T", "Y"}, getItemsAt(new Object[]{"O", "R", "B", "I", "T", "L", "Y"}, "odd"));
    }

    @Test
    public void test12() {
        assertArrayEquals(new Object[]{"R", "I", "R", "R", "L"}, getItemsAt(new Object[]{"A", "R", "B", "I", "T", "R", "A", "R", "I", "L", "Y"}, "even"));
    }


}
