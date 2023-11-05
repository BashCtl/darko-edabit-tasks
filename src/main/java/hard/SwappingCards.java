package hard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Swapping Cards

Two players draw a pair of numbered cards so that both players can form a 2 digit number.
A winner can be decided if one player's number is larger than the other.

However, there is a rule where a player can swap any one of their cards with any one of the other player's cards
in a gamble to get a higher number! Note that it is illegal to swap the order of your own cards.
That means if you draw a 1 then a 9, you cannot swap them to get 91.

Paul's strategy is to always swap his lowest number with the opponent's ten's digit.
Return whether this results in Paul winning the round.

n1 is Paul's number
n2 is his opponent's number

Worked Example
swapCards(41, 79) ➞ true
// Paul's lowest number is 1
// The opponent's ten's digit is 7
// After the swap: 47 > 19
// Paul wins the round


Examples
//swapCards(41, 98) ➞ true
//
//swapCards(12, 28) ➞ true
//
//swapCards(67, 53) ➞ false
//
//swapCards(77, 54) ➞ false

Notes
If both of Paul's digits are the same, swap the ten's digit with the opponent's (paul likes to live riskily).
The cards don't include the number 0.
 */

public class SwappingCards {

    public static boolean swapCards(int x, int y) {
        int firstDigitX = x / 10;
        int secondDigitX = x % 10;

        int firstDigitY = y / 10;
        int secondDigitY = y % 10;

        if (firstDigitX > secondDigitX) {

            return Integer.parseInt(firstDigitX + "" + firstDigitY) > Integer.parseInt(secondDigitX + "" + secondDigitY);
        } else {
            return Integer.parseInt(firstDigitY + "" + secondDigitX) > Integer.parseInt(firstDigitX + "" + secondDigitY);
        }


    }


    private int[][] numVector = new int[][]{
            {41, 98}, {12, 28}, {67, 53}, {77, 54}, {45, 23}, {74, 81},
            {75, 35}, {21, 25}, {22, 34}, {24, 12}, {52, 46}, {88, 45},
            {48, 54}, {75, 87}, {13, 12}, {25, 41}, {48, 14}
    };
    private boolean[] resVector = new boolean[]{
            true, true, false, false, false, true,
            true, true, true, false, true, false,
            true, true, true, true, false
    };

    @Test
    public void test01() {
        assertEquals(swapCards(numVector[0][0], numVector[0][1]), resVector[0]);
    }

    @Test
    public void test02() {
        assertEquals(swapCards(numVector[1][0], numVector[1][1]), resVector[1]);
    }

    @Test
    public void test03() {
        assertEquals(swapCards(numVector[2][0], numVector[2][1]), resVector[2]);
    }

    @Test
    public void test04() {
        assertEquals(swapCards(numVector[3][0], numVector[3][1]), resVector[3]);
    }

    @Test
    public void test05() {
        assertEquals(swapCards(numVector[4][0], numVector[4][1]), resVector[4]);
    }

    @Test
    public void test06() {
        assertEquals(swapCards(numVector[5][0], numVector[5][1]), resVector[5]);
    }

    @Test
    public void test07() {
        assertEquals(swapCards(numVector[6][0], numVector[6][1]), resVector[6]);
    }

    @Test
    public void test08() {
        assertEquals(swapCards(numVector[7][0], numVector[7][1]), resVector[7]);
    }

    @Test
    public void test09() {
        assertEquals(swapCards(numVector[8][0], numVector[8][1]), resVector[8]);
    }

    @Test
    public void test10() {
        assertEquals(swapCards(numVector[9][0], numVector[9][1]), resVector[9]);
    }

    @Test
    public void test11() {
        assertEquals(swapCards(numVector[10][0], numVector[10][1]), resVector[10]);
    }

    @Test
    public void test12() {
        assertEquals(swapCards(numVector[11][0], numVector[11][1]), resVector[11]);
    }

    @Test
    public void test13() {
        assertEquals(swapCards(numVector[12][0], numVector[12][1]), resVector[12]);
    }

    @Test
    public void test14() {
        assertEquals(swapCards(numVector[13][0], numVector[13][1]), resVector[13]);
    }

    @Test
    public void test15() {
        assertEquals(swapCards(numVector[14][0], numVector[14][1]), resVector[14]);
    }

    @Test
    public void test16() {
        assertEquals(swapCards(numVector[15][0], numVector[15][1]), resVector[15]);
    }

    @Test
    public void test17() {
        assertEquals(swapCards(numVector[16][0], numVector[16][1]), resVector[16]);
    }

}
