package very_hard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;

/*
Happy Number

A happy number is a number which yields a 1 by repeatedly summing up the square of its digits.
If such a process results in an endless cycle of numbers containing 4, the number is said to be an unhappy number.

Create a function that accepts a number and determines whether the number is a
happy number or not. Return true if so, false otherwise.

Examples
isHappy(67) ➞ false

isHappy(89) ➞ false

isHappy(139) ➞ true

isHappy(1327) ➞ false

isHappy(2871) ➞ false

isHappy(3970) ➞ true

Notes
Hint: Your loop terminates if the value of n is either 1 or 4.
Optionally, you can solve this challenge via a recursive approach.

 */

public class HappyNumber {

    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 4) {
            return false;
        }
        n = Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .map(num -> num * num).sum();
        return isHappy(n);

    }

    private int[] numVector = new int[]{1, 10, 44, 67, 89, 139, 1327, 2871, 3970, 5209, 6329, 8888, 9331, 10000};
    private boolean[] resVector = new boolean[]{true, true, true, false, false, true, false, false, true, false, true, false, true, true};

    @Test
    public void test1() {
        assertEquals(isHappy(numVector[0]), resVector[0]);
    }

    @Test
    public void test2() {
        assertEquals(isHappy(numVector[1]), resVector[1]);
    }

    @Test
    public void test3() {
        assertEquals(isHappy(numVector[2]), resVector[2]);
    }

    @Test
    public void test4() {
        assertEquals(isHappy(numVector[3]), resVector[3]);
    }

    @Test
    public void test5() {
        assertEquals(isHappy(numVector[4]), resVector[4]);
    }

    @Test
    public void test6() {
        assertEquals(isHappy(numVector[5]), resVector[5]);
    }

    @Test
    public void test7() {
        assertEquals(isHappy(numVector[6]), resVector[6]);
    }

    @Test
    public void test8() {
        assertEquals(isHappy(numVector[7]), resVector[7]);
    }

    @Test
    public void test9() {
        assertEquals(isHappy(numVector[8]), resVector[8]);
    }

    @Test
    public void test10() {
        assertEquals(isHappy(numVector[9]), resVector[9]);
    }

    @Test
    public void test11() {
        assertEquals(isHappy(numVector[10]), resVector[10]);
    }

    @Test
    public void test12() {
        assertEquals(isHappy(numVector[11]), resVector[11]);
    }

    @Test
    public void test13() {
        assertEquals(isHappy(numVector[12]), resVector[12]);
    }

    @Test
    public void test14() {
        assertEquals(isHappy(numVector[13]), resVector[13]);
    }

}
