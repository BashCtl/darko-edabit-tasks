package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ProductOfRemainingElements {

    public static boolean canPartition(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 1;
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    sum *= arr[j];
                }
            }
            if (sum == arr[i]) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void test1() {
        assertEquals(canPartition(new int[]{-1, -10, 1, -2, 20}), false);
    }

    @Test
    public void test2() {
        assertEquals(canPartition(new int[]{-1, -20, 5, -1, -2, 2}), true);
    }

    @Test
    public void test3() {
        assertEquals(canPartition(new int[]{2, 8, 4, 1}), true);
    }

    @Test
    public void test4() {
        assertEquals(canPartition(new int[]{1, 1, -1, 1}), false);
    }

    @Test
    public void test5() {
        assertEquals(canPartition(new int[]{-1, -1, 1, 1}), true);
    }

    @Test
    public void test6() {
        assertEquals(canPartition(new int[]{0, 5, 1, -1}), false);
    }

    @Test
    public void test7() {
        assertEquals(canPartition(new int[]{0, 1, 1, -1}), false);
    }

    @Test
    public void test8() {
        assertEquals(canPartition(new int[]{0, 1, 1, 1}), false);
    }

    @Test
    public void test9() {
        assertEquals(canPartition(new int[]{0, 0, 1, 1}), true);
    }

    @Test
    public void test10() {
        assertEquals(canPartition(new int[]{0, 0, 1}), true);
    }

    @Test
    public void test11() {
        assertEquals(canPartition(new int[]{0, 0, 0}), true);
    }

    @Test
    public void test12() {
        assertEquals(canPartition(new int[]{5, 5, 25, 100}), false);
    }

    @Test
    public void test13() {
        assertEquals(canPartition(new int[]{-1, 5, 20, 100}), false);
    }

    @Test
    public void test14() {
        assertEquals(canPartition(new int[]{1, 1, 1, 1}), true);
    }

    @Test
    public void test15() {
        assertEquals(canPartition(new int[]{-1, 1, -1}), true);
    }

    @Test
    public void test16() {
        assertEquals(canPartition(new int[]{-1, 1, 1}), false);
    }

}
