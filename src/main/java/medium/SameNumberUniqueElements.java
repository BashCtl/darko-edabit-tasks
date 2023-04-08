package medium;

import org.testng.annotations.Test;

import java.util.Arrays;


import static org.testng.Assert.assertEquals;

public class SameNumberUniqueElements {

    public static boolean same(int[] a1, int[] a2) {
        return Arrays.stream(a1).distinct().count()
                == Arrays.stream(a2).distinct().count();

    }

    @Test
    public void test1() {
        assertEquals(same(new int[]{1, 3, 4, 4, 4}, new int[]{2, 5, 7}), true);
    }

    @Test
    public void test2() {
        assertEquals(same(new int[]{9, 8, 7, 6}, new int[]{4, 4, 3, 1}), false);
    }

    @Test
    public void test3() {
        assertEquals(same(new int[]{2}, new int[]{3, 3, 3, 3, 3}), true);
    }

    @Test
    public void test4() {
        assertEquals(same(new int[]{5, 6, 7, 9}, new int[]{4, 1}), false);
    }

    @Test
    public void test5() {
        assertEquals(same(new int[]{5, 9, 9}, new int[]{9, 5}), true);
    }

    @Test
    public void test6() {
        assertEquals(same(new int[]{1, 1, 1, 4}, new int[]{1, 4, 4, 4, 4, 4}), true);
    }

    @Test
    public void test7() {
        assertEquals(same(new int[]{}, new int[]{}), true);
    }

}
