package very_hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
Split 25 (Part 1)

About a month ago I stumbled upon an interesting problem — something called the 25 split. In the problem, you had to break up 25 into parts, and, from those parts that add to it, try to create the biggest product.

For example, 3 * 22 = 66 or 5 * 5 * 5 * 5 * 5 = 3125. With this first part, return the value of the biggest product possible using natural number parts from a given number, x.

Examples
split(5) ➞ 6
// 3 times 2

split(10) ➞ 36
// 3 * 3 * 4

split(1) ➞ 1
 */

public class Split25PartOne {

    public static int split(int x) {
        if (x == 1) return 1;
        if (x == 2) return 2;
        if (x == 3) return 3;

        int product = 1;

        while (x > 4) {
            product *= 3;
            x -= 3;
        }

        product *= x;

        return product;
    }
    @Test
    public void test1() {
        assertEquals(8748, split(25));
    }

    @Test
    public void test2() {
        assertEquals(1, split(1));
    }

    @Test
    public void test3() {
        assertEquals(36, split(10));
    }

    @Test
    public void test4() {
        assertEquals(6, split(5));
    }

    @Test
    public void test5() {
        assertEquals(243, split(15));
    }

    @Test
    public void test6() {
        assertEquals(1458, split(20));
    }
}
