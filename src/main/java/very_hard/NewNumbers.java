package very_hard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/*
New Numbers


A new number is a number that is not a permutation of any smaller number. 869 is not a new number because it is just a permutation of smaller numbers, 689 and 698. 509 is a new number because it can't be formed by a permutation of any smaller number (leading zeros not allowed).

Write a function that takes a non-negative integer and returns true if the integer is a new number and false if it is not.

Examples
isNew(3) ➞ true

isNew(30) ➞ true

isNew(321) ➞ false

isNew(123) ➞ true
Notes
A curious fact: out of the first one million integers, only 8002 are new.



 */

public class NewNumbers {


    public static boolean isNew(int number) {
        if (number < 10) {
            return true;
        }

        String numberStr = Integer.toString(number);
        List<String> permutations = new ArrayList<>();
        generatePermutations("", numberStr, permutations);

        for (String perm : permutations) {
            if (!perm.startsWith("0") && Integer.parseInt(perm) < number) {
                return false;
            }
        }

        return true;
    }

    private static void generatePermutations(String prefix, String remaining, List<String> result) {
        int n = remaining.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1, n),
                        result);
            }
        }
    }


    @Test
    public void test1() {
        assertEquals(true, isNew(0));
    }

    @Test
    public void test2() {
        assertEquals(true, isNew(90));
    }

    @Test
    public void test3() {
        assertEquals(false, isNew(601));
    }

    @Test
    public void test4() {
        assertEquals(true, isNew(123));
    }

    @Test
    public void test5() {
        assertEquals(false, isNew(321));
    }

    @Test
    public void test6() {
        assertEquals(true, isNew(40567));
    }

    @Test
    public void test7() {
        assertEquals(false, isNew(10783));
    }

    @Test
    public void test8() {
        assertEquals(true, isNew(4444));
    }

    @Test
    public void test9() {
        assertEquals(true, isNew(102));
    }

    @Test
    public void test10() {
        assertEquals(true, isNew(30004));
    }

    @Test
    public void test11() {
        assertEquals(false, isNew(40003));
    }

    @Test
    public void test12() {
        assertEquals(false, isNew(125609));
    }

    @Test
    public void test13() {
        assertEquals(false, isNew(23401));
    }

}
