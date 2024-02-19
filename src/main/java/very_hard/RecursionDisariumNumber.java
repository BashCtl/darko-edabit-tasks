package very_hard;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


/*
Recursion: Disarium Number

A number is said to be Disarium if the sum of its digits raised
to their respective positions is the number itself.
Create a function that determines whether a number is a Disarium or not.

Examples
isDisarium(75) ➞ false
// 7^1 + 5^2 = 7 + 25 = 32

isDisarium(135) ➞ true
// 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135

isDisarium(518) ➞ false

isDisarium(518) ➞ true

isDisarium(544) ➞ false

isDisarium(8) ➞ true

isDisarium(466) ➞ false

Notes
Position of the digit is not likely its index.
You are expected to solve this challenge via recursion.


 */
public class RecursionDisariumNumber {

    public static boolean isDisarium(int n, int... holder) {
        String sNum = String.valueOf(n);
        if (holder.length == 0) {
            holder = new int[sNum.length() + 2];
            holder[0] = n;
            holder[1] = sNum.length();
        }

        int num = Integer.parseInt(sNum.substring(sNum.length() - 1));

        int temp = (int) Math.pow(num, holder[1]);
        holder[sNum.length() + 1] = temp;
        --holder[1];
        sNum = sNum.substring(0, sNum.length()-1);

        if(sNum.isEmpty()){
            return holder[0] == Arrays.stream(holder, 2, holder.length).sum();
        }

        return isDisarium(Integer.parseInt(sNum), holder);
    }


    @Test
    public void test01() {
        assertEquals(true, isDisarium(6));
    }

    @Test
    public void test02() {
        assertEquals(false, isDisarium(75));
    }

    @Test
    public void test03() {
        assertEquals(true, isDisarium(135));
    }

    @Test
    public void test04() {
        assertEquals(false, isDisarium(466));
    }

    @Test
    public void test05() {
        assertEquals(false, isDisarium(372));
    }

    @Test
    public void test06() {
        assertEquals(true, isDisarium(175));
    }

    @Test
    public void test07() {
        assertEquals(true, isDisarium(1));
    }

    @Test
    public void test08() {
        assertEquals(false, isDisarium(696));
    }

    @Test
    public void test09() {
        assertEquals(false, isDisarium(876));
    }

    @Test
    public void test10() {
        assertEquals(true, isDisarium(89));
    }

    @Test
    public void test11() {
        assertEquals(true, isDisarium(518));
    }

    @Test
    public void test12() {
        assertEquals(true, isDisarium(598));
    }

    @Test
    public void test13() {
        assertEquals(false, isDisarium(544));
    }

    @Test
    public void test14() {
        assertEquals(false, isDisarium(466));
    }
}
