package hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MindTheGap {

    public static int gapful(int n) {
        if (n <= 100) {
            return 100;
        }
        int forward = n;
        int backward = n;
        int f = 0;
        int b = 0;
        while (true) {
            String numStrF = String.valueOf(forward);
            int dividerF = Integer.parseInt(numStrF.substring(0, 1) + numStrF.substring(numStrF.length() - 1));
            if (forward % dividerF == 0) {
                f = forward;
            } else if (f == 0) {
                forward++;
            }
            String numStrB = String.valueOf(backward);
            int dividerB = Integer.parseInt(numStrB.substring(0, 1) + numStrB.substring(numStrB.length() - 1));
            if (backward % dividerB == 0) {
                b = backward;
            } else if (b == 0) {
                backward--;
            }
            if (f != 0 && b != 0) {
                return n - b > f - n ? f : b;
            }
        }
    }

    @Test
    public void test1() {
        assertEquals(100, gapful(25));
    }

    @Test
    public void test2() {
        assertEquals(100, gapful(100));
    }

    @Test
    public void test3() {
        assertEquals(105, gapful(103));
    }

    @Test
    public void test4() {
        assertEquals(1441, gapful(1442));
    }

    @Test
    public void test5() {
        assertEquals(3333, gapful(3345));
    }

    @Test
    public void test6() {
        assertEquals(4773, gapful(4780));
    }

    @Test
    public void test7() {
        assertEquals(3078, gapful(3078));
    }

}
