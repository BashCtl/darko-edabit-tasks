package very_hard;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*
Sherlock and Squares

Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value
describing a range of integers. Sherlock must determine the number of square integers within that range,
inclusive of the endpoints (note that a square integer is an integer
which is the square of an integer, e.g. 1, 4, 9, 16, 25, 36, 49).

For example, the range is a=24 and b=49, inclusive.
There are three square integers in the range: 25, 36 and 49.

Complete the squares function that returns an integer representing the number
of square integers in the inclusive range from a to b.

Examples
squares(3, 9) ➞ 2

squares(17, 24) ➞ 0

squares(1, 1000000000) ➞ 31622

Notes
Your solution must solve each problem in 1 second or less.
 */
public class SherlockAndSquares {

    public static int squares(int a, int b) {
        return (int) Math.sqrt(b) - (int) Math.ceil(Math.sqrt(a)) + 1;
    }

    @Test
    public void test1() {
        assertThat(squares(35, 70), is(3));
    }

    @Test(timeout = 1000)
    public void test2() {
        assertThat(squares(100, 1000), is(22));
    }

    @Test(timeout = 1000)
    public void test3() {
        assertThat(squares(3, 9), is(2));
    }

    @Test(timeout = 1000)
    public void test4() {
        assertThat(squares(17, 24), is(0));
    }

    @Test(timeout = 1000)
    public void test5() {
        assertThat(squares(433, 100000), is(296));
    }

    @Test(timeout = 1000)
    public void test6() {
        assertThat(squares(1, 1000000000), is(31622));
    }

    @Test(timeout = 1000)
    public void test7() {
        assertThat(squares(89784519, 103811134), is(713));
    }

    @Test(timeout = 1000)
    public void test8() {
        assertThat(squares(50979851, 733216221), is(19937));
    }
}
