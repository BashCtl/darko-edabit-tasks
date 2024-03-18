package very_hard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/*
Maximum And Minimum Product Triplets


Write two functions:

One that returns the maximum product of three numbers in an array.
One that returns the minimum product of three numbers in an array.
Examples
maxProduct([-8, -9, 1, 2, 7]) ➞ 504

maxProduct([-8, 1, 2, 7, 9]) ➞ 126

minProduct([1, -1, 1, 1]) ➞ -1

minProduct([-5, -3, -1, 0, 4]) ➞ -15

 */

public class MaximumAndMinimumProductTriplets {

    public static int maxProduct(int[] r) {
        List<Integer> products = new ArrayList<>();
        int n = r.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    products.add(r[i] * r[j] * r[k]);
                }
            }
        }

        return Collections.max(products);
    }

    public static int minProduct(int[] r) {
        List<Integer> products = new ArrayList<>();
        int n = r.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    products.add(r[i] * r[j] * r[k]);
                }
            }
        }

        return Collections.min(products);
    }

    @Test
    public void test01() {
        assertEquals(-1, maxProduct(new int[]{1, -1, 1}));
    }

    @Test
    public void test02() {
        assertEquals(1, maxProduct(new int[]{1, -1, 1, 1}));
    }

    @Test
    public void test03() {
        assertEquals(504, maxProduct(new int[]{-8, -9, 1, 2, 7}));
    }

    @Test
    public void test04() {
        assertEquals(126, maxProduct(new int[]{-8, 1, 2, 7, 9}));
    }

    @Test
    public void test05() {
        assertEquals(50, maxProduct(new int[]{1, 1, 5, 1, 1, -10, -1}));
    }

    @Test
    public void test06() {
        assertEquals(-210, maxProduct(new int[]{-8, -7, -6, -5}));
    }

    @Test
    public void test07() {
        assertEquals(56, maxProduct(new int[]{-8, -7, -6, -5, 1}));
    }

    @Test
    public void test08() {
        assertEquals(0, maxProduct(new int[]{1, 0, 1, 0, 0}));
    }

    @Test
    public void test09() {
        assertEquals(0, maxProduct(new int[]{-5, 1, 10, 0, 0}));
    }

    @Test
    public void test10() {
        assertEquals(0, maxProduct(new int[]{-5, -1, -1, 0, 0}));
    }

    @Test
    public void test11() {
        assertEquals(5, maxProduct(new int[]{-5, 1, -1, 0, 0}));
    }

    @Test
    public void test12() {
        assertEquals(60, maxProduct(new int[]{-5, -3, -1, 0, 4}));
    }

    @Test
    public void test13() {
        assertEquals(441, maxProduct(new int[]{5, 3, -1, 0, -4, 7, 7, 9}));
    }

    @Test
    public void test14() {
        assertEquals(-1, minProduct(new int[]{1, -1, 1}));
    }

    @Test
    public void test15() {
        assertEquals(-1, minProduct(new int[]{1, -1, 1, 1}));
    }

    @Test
    public void test16() {
        assertEquals(-126, minProduct(new int[]{-8, -9, 1, 2, 7}));
    }

    @Test
    public void test17() {
        assertEquals(-504, minProduct(new int[]{-8, 1, 2, 7, 9}));
    }

    @Test
    public void test18() {
        assertEquals(-50, minProduct(new int[]{1, 1, 5, 1, 1, -10, -1}));
    }

    @Test
    public void test19() {
        assertEquals(-336, minProduct(new int[]{-8, -7, -6, -5}));
    }

    @Test
    public void test20() {
        assertEquals(-336, minProduct(new int[]{-8, -7, -6, -5, 1}));
    }

    @Test
    public void test21() {
        assertEquals(0, minProduct(new int[]{1, 0, 1, 0, 0}));
    }

    @Test
    public void test22() {
        assertEquals(-50, minProduct(new int[]{-5, 1, 10, 0, 0}));
    }

    @Test
    public void test23() {
        assertEquals(-5, minProduct(new int[]{-5, -1, -1, 0, 0}));
    }

    @Test
    public void test24() {
        assertEquals(0, minProduct(new int[]{-5, 1, -1, 0, 0}));
    }

    @Test
    public void test25() {
        assertEquals(-15, minProduct(new int[]{-5, -3, -1, 0, 4}));
    }

    @Test
    public void test26() {
        assertEquals(-252, minProduct(new int[]{5, 3, -1, 0, -4, 7, 7, 9}));
    }

}
