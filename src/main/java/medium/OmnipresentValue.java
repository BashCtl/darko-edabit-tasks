package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class OmnipresentValue {

    public static boolean omnipresent(int[][] arr, int val) {
        for (int[] nums : arr) {
            if (Arrays.stream(nums).noneMatch(n -> n == val)) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test1() {
        assertEquals(true,
                omnipresent(new int[][]{{1, 1}, {1, 3}, {5, 1}, {6, 1}}, 1)
        );
    }

    @Test
    public void test2() {
        assertEquals(false, omnipresent(
                        new int[][]{{1, 1}, {1, 3}, {5, 1}, {6, 1}}, 6
                )
        );
    }

    @Test
    public void test3() {
        assertEquals(true, omnipresent(
                        new int[][]{{5}, {5}, {5}, {6, 5}}, 5
                )
        );
    }

    @Test
    public void test4() {
        assertEquals(false, omnipresent(
                        new int[][]{{5}, {5}, {5}, {6, 5}}, 6
                )
        );
    }

    @Test
    public void test5() {
        assertEquals(true, omnipresent(
                        new int[][]{{5, 1}, {5, 1}, {5, 1}, {6, 5, 1}}, 1
                )
        );
    }
}
