package very_hard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
Recursion: Pronic Number


A pronic number (or otherwise called as heteromecic) is a number which
is a product of two consecutive integers, that is, a number of the form n(n + 1).

Create a function that determines whether a number is pronic or not.

Examples
isHeteromecic(0) ➞ true
// 0 * (0 + 1) = 0 * 1 = 0

isHeteromecic(2) ➞ true
// 1 * (1 + 1) = 1 * 2 = 2

isHeteromecic(7) ➞ false

isHeteromecic(110) ➞ true
// 10 * (10 + 1) = 10 * 11 = 110

isHeteromecic(136) ➞ false

isHeteromecic(156) ➞ true
Notes
You are expected to solve this challenge via recursion.

 */
public class RecursionPronicNumber {

    public static boolean isHeteromecic(int n, int... holder) {
        if (holder.length == 0) {
            holder = new int[1];

        }
        int x = holder[0];
        if (x > Math.sqrt(n)) {
            return false;
        }
        if (x * (x + 1) == n) {
            return true;
        }
        holder[0] = x + 1;

        return isHeteromecic(n, holder);

    }

    private int[] numVector = new int[] {0, 2, 7, 110, 136, 156, 182, 218, 250, 272, 306, 362, 380, 422, 462, 600};
    private boolean[] resVector = new boolean[] {true, true, false, true, false, true, true, false, false, true, true, false, true, false, true, true};

    @Test
    public void test01() {
        assertEquals(isHeteromecic(numVector[0]), resVector[0]);
    }

    @Test
    public void test02() {
        assertEquals(isHeteromecic(numVector[1]), resVector[1]);
    }

    @Test
    public void test03() {
        assertEquals(isHeteromecic(numVector[2]), resVector[2]);
    }

    @Test
    public void test04() {
        assertEquals(isHeteromecic(numVector[3]), resVector[3]);
    }

    @Test
    public void test05() {
        assertEquals(isHeteromecic(numVector[4]), resVector[4]);
    }

    @Test
    public void test06() {
        assertEquals(isHeteromecic(numVector[5]), resVector[5]);
    }

    @Test
    public void test07() {
        assertEquals(isHeteromecic(numVector[6]), resVector[6]);
    }

    @Test
    public void test08() {
        assertEquals(isHeteromecic(numVector[7]), resVector[7]);
    }
    @Test
    public void test09() {
        assertEquals(isHeteromecic(numVector[8]), resVector[8]);
    }

    @Test
    public void test10() {
        assertEquals(isHeteromecic(numVector[9]), resVector[9]);
    }

    @Test
    public void test11() {
        assertEquals(isHeteromecic(numVector[10]), resVector[10]);
    }

    @Test
    public void test12() {
        assertEquals(isHeteromecic(numVector[11]), resVector[11]);
    }

    @Test
    public void test13() {
        assertEquals(isHeteromecic(numVector[12]), resVector[12]);
    }

    @Test
    public void test14() {
        assertEquals(isHeteromecic(numVector[13]), resVector[13]);
    }

    @Test
    public void test15() {
        assertEquals(isHeteromecic(numVector[14]), resVector[14]);
    }

    @Test
    public void test16() {
        assertEquals(isHeteromecic(numVector[15]), resVector[15]);
    }

}
