package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PagesInBook {

    /*
    nth term of an AP: an = a + (n - 1)d
Sum of n terms of an AP: Sn = n/2 (2a + (n - 1) d) = n/2 (a + l),
where l is the last term of the arithmetic progression.
     */
    public static boolean pagesInBook(int total) {
        int d = 1 + 4 * 2 * total;
        int x = (int) (-1 + Math.sqrt(d)) / 2;
        int nPrevious = ((x - 1) * x) / 2;
        return nPrevious == total - x;
    }

    @Test
    public void test1() {
        assertEquals(false, pagesInBook(5));
    }

    @Test
    public void test2() {
        assertEquals(true, pagesInBook(4005));
    }

    @Test
    public void test3() {
        assertEquals(true, pagesInBook(9453));
    }

    @Test
    public void test4() {
        assertEquals(false, pagesInBook(9474));
    }

    @Test
    public void test5() {
        assertEquals(true, pagesInBook(125250));
    }

    @Test
    public void test6() {
        assertEquals(true, pagesInBook(920046));
    }

}
