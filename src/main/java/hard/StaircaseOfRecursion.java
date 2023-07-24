package hard;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class StaircaseOfRecursion {

    public static int waysToClimb(int num) {
        if (num == 0) {
            return 1;
        } else if (num <= 3) {
            return num;
        }

        return waysToClimb(num - 1) + waysToClimb(num - 2);
    }

    @Test
    public void test1() {
        assertEquals(1, waysToClimb(0));
    }

    @Test
    public void test2() {
        assertEquals(1, waysToClimb(1));
    }

    @Test
    public void test3() {
        assertEquals(2, waysToClimb(2));
    }

    @Test
    public void test4() {
        assertEquals(3, waysToClimb(3));
    }

    @Test
    public void test5() {
        assertEquals(5, waysToClimb(4));
    }

    @Test
    public void test6() {
        assertEquals(8, waysToClimb(5));
    }

    @Test
    public void test7() {
        assertEquals(13, waysToClimb(6));
    }

    @Test
    public void test8() {
        assertEquals(21, waysToClimb(7));
    }

    @Test
    public void test9() {
        assertEquals(987, waysToClimb(15));
    }

    @Test
    public void test10() {
        assertEquals(46368, waysToClimb(23));
    }
}
